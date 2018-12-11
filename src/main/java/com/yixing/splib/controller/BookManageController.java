package com.yixing.splib.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yixing.splib.entity.Catalog;
import com.yixing.splib.entity.Detail;
import com.yixing.splib.entity.User;
import com.yixing.splib.service.CatalogService;
import com.yixing.splib.service.DetailService;
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
import java.util.*;

@RestController
@RequestMapping("/api")
public class BookManageController
{
    @Resource
    private CatalogService catalogService;
    @Resource
    private DetailService detailService;
    @Resource
    private UserService userService;
    //增加Catalog外部接口
    @RequestMapping(value = "/addBook")
    public Msg save(@Valid Catalog catalog,@Valid Detail detail, BindingResult result)
    {

        if (result.getErrorCount() > 0)
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
            System.out.println("catalog:"+catalog.toString());
            List<Detail>details=detailService.getAll();
            Detail detail1=details.get(details.size()-1);
            Integer tmp=new Integer(detail1.getBookId())+1;
            detail.setBookId(tmp.toString());
            System.out.println("detail:"+detail.toString());
            catalogService.saveCatalog(catalog);
            detailService.saveDetail(detail);
            return Msg.success();
        } catch (Exception e)
        {
            return Msg.fail().add("errors", e.getMessage());
        }
    }
    //修改Catalog外部接口
    @RequestMapping(value = "/updateBook/{id}")
    public Msg updateUser(@Valid Catalog catalog, @Valid Detail detail, BindingResult result)
    {
        if (result.getErrorCount() > 0)
        {
            Map<String, Object> errors = new HashMap<>();
            for (FieldError error : result.getFieldErrors())
            {
                System.out.println(error.getField() + ":" + error.getDefaultMessage());
                errors.put(error.getField(), error.getDefaultMessage());
            }
            return Msg.fail().add("errors", errors);
        }
        try
        {
            catalogService.updateCatalog(catalog);
            detailService.updateDetail(detail);
            return Msg.success();
        } catch (Exception e)
        {
            return Msg.fail().add("errors", e.getMessage());
        }
    }
    //查询所有Catalog外部接口
    @RequestMapping(value = "/book")
    public Msg getALL(@RequestParam(value = "pn", defaultValue = "1") Integer pageNum)
    {
        //在查询之前调用静态方法设置起始页和页面大小
        PageHelper.startPage(pageNum, 8);
        //startPage后面紧跟着的查询就是分页查询
        List<Detail> details=detailService.getAll();
        //使用PageInfo包装查询后的结果，并将pageInfo存入map中
        PageInfo<Detail> detailpageInfo=new PageInfo<Detail>(details,5);
        return Msg.success().add("detail",detailpageInfo);
    }
    //查询某一个Catalog外部接口
    @RequestMapping(value = "/getBook")
    public Msg getUser(@RequestParam(value = "pn", defaultValue = "1") Integer pageNum, Catalog catalog, User user)
    {
        Detail detail=new Detail();
        detail.setUserId(user.getUserId());
        List<Detail>details=detailService.get(detail);
        List<Catalog>borrowedBook=new LinkedList<>();
        for(Detail d:details)
        {
            Catalog tmp=new Catalog();
            tmp.setSubnum(d.getSubnum());
            borrowedBook.add(catalogService.get(tmp).get(0));
        }
        //在查询之前调用静态方法设置起始页和页面大小
        PageHelper.startPage(pageNum, 8);
        //startPage后面紧跟着的查询就是分页查询s
        List<Catalog> catalogs=catalogService.get(catalog);
        //使用PageInfo包装查询后的结果，并将pageInfo存入map中
        PageInfo<Catalog> catalogpageInfo=new PageInfo<Catalog>(catalogs,5);
        PageInfo<Catalog> borrowedBookPageInfo=new PageInfo<Catalog>(borrowedBook,5);
        return Msg.success().add("detail",catalogpageInfo).add("borrowedBook",borrowedBookPageInfo);
    }
    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
