package com.yixing.splib.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yixing.splib.entity.Catalog;
import com.yixing.splib.entity.Oplog;
import com.yixing.splib.service.CatalogService;
import com.yixing.splib.service.OplogService;
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
    private CatalogService catalogService;
    //增加Catalog外部接口
    @RequestMapping(value = "/addOplog")
    public Msg save(@Valid Oplog oplog, BindingResult result)
    {
        Catalog catalog=new Catalog();
        catalog.setSubnum(oplog.getBookId());
        catalog=catalogService.get(catalog).get(0);
        if (result.getErrorCount() > 0&&catalog.getBookRemainnum()>1)
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
            catalog.setBookRemainnum(catalog.getBookRemainnum()-1);
            catalogService.saveCatalog(catalog);
            oplogService.saveOplog(oplog);
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
