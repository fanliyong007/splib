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
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.text.DateFormat;
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
    //增加user外部接口
    @RequestMapping(value = "/addUser")
    public Msg save(@Valid User user,BindingResult result)
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
            Login login=new Login();
            login.setUsername(user.getUserId());
            login.setPassword("123456");//设置默认密码
            login.setPerms("user");//默认为普通用户
            System.out.println("login=\n"+login.toString());
            System.out.println("user=\n"+user.toString());
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
    public Msg get(@RequestParam(value = "pn", defaultValue = "1") Integer pageNum)
    {
        //在查询之前调用静态方法设置起始页和页面大小
        PageHelper.startPage(pageNum, 8);
        //startPage后面紧跟着的查询就是分页查询
        List<User> users = userService.getAll();
        //使用PageInfo包装查询后的结果，并将pageInfo存入map中
        PageInfo<User> pageInfo = new PageInfo<>(users, 5);
        return Msg.success().add("user", pageInfo);
    }
    @RequestMapping(value = "/getUser")
    public Msg getUser(@RequestParam(value = "pn", defaultValue = "1") Integer pageNum,User user)
    {
        //在查询之前调用静态方法设置起始页和页面大小
        PageHelper.startPage(pageNum, 8);
        //startPage后面紧跟着的查询就是分页查询
        List<User> users = userService.get(user);
        //使用PageInfo包装查询后的结果，并将pageInfo存入map中
        PageInfo<User> pageInfo = new PageInfo<>(users, 5);
        return Msg.success().add("user", pageInfo);
    }
    //禁用或更新user接口
    @RequestMapping(value = "/updateUser")
    public Msg disableUser(@Valid User user,Login login,BindingResult result)
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
            Login tmp=loginService.get(login.getUsername());
            login.setPerms(tmp.getPerms());
            loginService.updateLogin(login);
            userService.updateUser(user);
            return Msg.success();
        } catch (Exception e)
        {
            return Msg.fail().add("errors", e.getMessage());
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
