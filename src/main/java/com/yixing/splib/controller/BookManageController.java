package com.yixing.splib.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yixing.splib.entity.Catalog;
import com.yixing.splib.entity.Detail;
import com.yixing.splib.service.CatalogService;
import com.yixing.splib.service.DetailService;
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
            catalogService.saveCatalog(catalog);
            detailService.saveDetail(detail);
            return Msg.success();
        } catch (Exception e)
        {
            return Msg.fail().add("errors", e.getMessage());
        }
    }
    //删除Catalog外部接口
    @ResponseBody
    @RequestMapping(value="/deleteBook/{ids}")
    public Msg delete(@PathVariable("ids")String ids) {
        if(ids.contains(",")) {
            String[] strIds=ids.split(",");
            List<String> catalogIds=new ArrayList<String>();
            for(String s:strIds) {
                catalogIds.add(s);
            }
            catalogService.deleteCatalogBatch(catalogIds);
        }else {
            catalogService.deleteCatalog(ids);
        }
        return Msg.success();
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
    public Msg getUser(@RequestParam(value = "pn", defaultValue = "1") Integer pageNum)
    {
        //在查询之前调用静态方法设置起始页和页面大小
        PageHelper.startPage(pageNum, 8);
        //startPage后面紧跟着的查询就是分页查询
        List<Detail> details=detailService.getAll();
        //使用PageInfo包装查询后的结果，并将pageInfo存入map中
        PageInfo<Detail> detailpageInfo=new PageInfo<Detail>(details,1);
        return Msg.success().add("detail",detailpageInfo);
    }
    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
