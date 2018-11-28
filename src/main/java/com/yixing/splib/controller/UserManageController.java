package com.yixing.splib.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yixing.splib.entity.Login;
import com.yixing.splib.entity.Major;
import com.yixing.splib.entity.User;
import com.yixing.splib.service.LoginService;
import com.yixing.splib.service.MajorService;
import com.yixing.splib.service.UserService;
import com.yixing.splib.util.Msg;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserManageController
{
    @Resource
    private UserService userService;
    @Resource
    private LoginService loginService;
    @Resource
    private MajorService majorService;
    //增加user外部接口
    @RequestMapping(value = "/addUser")
    public Msg save(@Valid User user,@Valid Login login,BindingResult result)
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
            loginService.saveLogin(login);
            userService.saveUser(user);
            return Msg.success();
        } catch (Exception e)
        {
            return Msg.fail().add("errors", e.getMessage());
        }
    }
    //查询user外部接口
    @RequestMapping(value = "/user")
    public Msg getUser(@RequestParam(value = "pn", defaultValue = "1") Integer pageNum)
    {
        //在查询之前调用静态方法设置起始页和页面大小
        PageHelper.startPage(pageNum, 8);
        //startPage后面紧跟着的查询就是分页查询
        List<User> users = userService.getAll();
        //使用PageInfo包装查询后的结果，并将pageInfo存入map中
        PageInfo<User> pageInfo = new PageInfo<>(users, 1);
        return Msg.success().add("user", pageInfo);
    }
    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
