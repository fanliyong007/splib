package com.yixing.splib.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yixing.splib.entity.Catalog;
import com.yixing.splib.entity.Detail;
import com.yixing.splib.entity.Oplog;

import com.yixing.splib.entity.User;
import com.yixing.splib.service.CatalogService;
import com.yixing.splib.service.DetailService;
import com.yixing.splib.service.OplogService;
import com.yixing.splib.service.UserService;
import com.yixing.splib.util.Msg;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class OplogManageController
{
    @Resource
    private OplogService oplogService;
    @Resource
    private CatalogService catalogService;
    @Resource
    private DetailService detailService;
    @Resource
    private UserService userService;
    //借书外部接口
    @RequestMapping(value = "/borrowBook")
    public Msg borrowBook(@Valid Oplog oplog, BindingResult result)
    {
        Catalog catalog=new Catalog();
        catalog.setSubnum(oplog.getBookId());
        catalog=catalogService.get(catalog).get(0);
        User user=new User();
        user.setUserCode(new Integer(oplog.getUserId()));
        user= userService.get(user).get(0);//得到当前借书人的信息
        if (result.getErrorCount() > 0&&catalog.getBookRemainnum()<1&&user.getBrrowlimit()<=user.getBorrowed())//&&catalog.getBookRemainnum()>1
       //数据绑定错误或图书剩余数量不够或读者借阅余额不足
        {
            Map<String, Object> errors = new HashMap<String, Object>();
            for (FieldError error : result.getFieldErrors())
            {
                System.out.println(error.getField() + ":" + error.getDefaultMessage());
                errors.put(error.getField(), error.getDefaultMessage());
            }
            return Msg.fail().add("errors", errors);
        }
        try
        {
            user.setBorrowed(user.getBorrowed()+1);//学生已借阅书本数量增加
            userService.updateUser(user);//更新学生信息
            Detail detail=new Detail();
            detail.setSubnum(catalog.getSubnum());
            detail=detailService.get(detail).get(0);//获得当前借阅图书的detail对象
            detail.setOutdate(oplog.getOpTime());//设置图书借出日期
            detail.setUserId(user.getUserId());//设置借阅者id
            detail.setIslended(true);//标记书本已借出
            detailService.updateDetail(detail);//更新图书借出情况
            catalog.setBookRemainnum(catalog.getBookRemainnum()-1);
            catalogService.updateCatalog(catalog);//更新图书剩余数量
            oplogService.saveOplog(oplog);//保存操作记录
            return Msg.success();
        } catch (Exception e)
        {
            return Msg.fail().add("errors", e.getMessage());
        }
    }
    //还书外部接口
    @RequestMapping(value = "/returnBook")
    public Msg returnBook(@Valid Oplog oplog, BindingResult result)
    {
        if (result.getErrorCount()>0)
        {
            Map<String, Object> errors = new HashMap<String, Object>();
            for (FieldError error : result.getFieldErrors())
            {
                System.out.println(error.getField() + ":" + error.getDefaultMessage());
                errors.put(error.getField(), error.getDefaultMessage());
            }
            return Msg.fail().add("errors", errors);
        }
        try
        {
            Catalog catalog=new Catalog();
            Oplog oplog1=oplogService.get(oplog.getBookId());//得到归还书本借出时的操作记录
            catalog.setSubnum(oplog.getBookId());
            catalog=catalogService.get(catalog).get(0);
            User user=new User();
            user.setUserCode(new Integer(oplog1.getUserId()));
            user=userService.get(user).get(0);
            user.setBorrowed(user.getBorrowed()-1);//学生已借阅书本数量减少
            userService.updateUser(user);//更新学生信息
            Detail detail=new Detail();
            detail.setSubnum(catalog.getSubnum());
            detail=detailService.get(detail).get(0);//获得当前归还图书的detail对象
            detail.setIndate(oplog.getOpTime());//设置图书归还日期
            detail.setUserId(null);//设置借阅者id
            detail.setIslended(false);//标记书本已借出
            detailService.updateDetail(detail);//更新图书归还情况
            catalog.setBookRemainnum(catalog.getBookRemainnum()+1);
            catalogService.updateCatalog(catalog);//更新图书剩余数量
            oplog.setUserId(user.getUserCode().toString());
            oplogService.saveOplog(oplog);//保存操作记录
            System.out.println(oplog.toString());
            return Msg.success();
        } catch (Exception e)
        {
            return Msg.fail().add("errors", e.getMessage());
        }
    }
    //查询所有Catalog外部接口
    @RequestMapping(value = "/oplog")
    public Msg getUser(@RequestParam(value = "pn", defaultValue = "1") Integer pageNum)
    {
        //在查询之前调用静态方法设置起始页和页面大小
        PageHelper.startPage(pageNum, 8);
        //startPage后面紧跟着的查询就是分页查询
        List<Oplog> oplogs=oplogService.getAll();
        //使用PageInfo包装查询后的结果，并将pageInfo存入map中
        PageInfo<Oplog> pageInfo=new PageInfo<Oplog>(oplogs,5);
        return Msg.success().add("oplog",pageInfo);
    }
    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
