package com.yixing.splib.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yixing.splib.entity.User;
import com.yixing.splib.service.UserService;
import com.yixing.splib.util.Msg;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.*;


@RestController
@EnableAutoConfiguration
public class UserRESTfulController
{
    @Resource
    private UserService userService;

    //增加user外部接口
    @RequestMapping(value = "/addUser")
    public Msg save(@Valid User user, BindingResult result)
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
            userService.saveUser(user);
            return Msg.success();
        } catch (Exception e)
        {
            return Msg.fail().add("errors", e.getMessage());
        }
    }
    //删除user外部接口
    @ResponseBody
    @RequestMapping(value="/deleteUser/{ids}")
    public Msg delete(@PathVariable("ids")String ids) {
        if(ids.contains(",")) {
            String[] strIds=ids.split(",");
            List<String> userIds=new ArrayList<String>();
            for(String s:strIds) {
                userIds.add(s);
            }
            userService.deleteUserBatch(userIds);
        }else {
            Integer id=Integer.parseInt(ids);
            userService.deleteUser(id);
        }
        return Msg.success();
    }
    //修改user外部接口
    @RequestMapping(value = "/updateUser/{id}")
    public Msg updateUser(@Valid User user, BindingResult result)
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
            userService.updateUser(user);
            return Msg.success();
        } catch (Exception e)
        {
            return Msg.fail().add("errors", e.getMessage());
        }
    }
    //查询所有user外部接口
    @RequestMapping(value = "/user")
    public Msg getUser(@RequestParam(value = "pn", defaultValue = "1") Integer pageNum)
    {
        //在查询之前调用静态方法设置起始页和页面大小
        PageHelper.startPage(pageNum, 8);
        //startPage后面紧跟着的查询就是分页查询
        List<User> users = userService.getAll();
        //使用PageInfo包装查询后的结果，并将pageInfo存入map中
        PageInfo<User> pageInfo = new PageInfo<>(users, 1);
        return Msg.success().add("page", pageInfo);
    }
    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
