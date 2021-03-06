package com.yixing.splib.controller;

import com.yixing.splib.entity.Login;
import com.yixing.splib.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller

public class ThymeleafController
{
    @Autowired
    private LoginService loginService;
    @RequestMapping("/")
    public String hello(Map<String, Object> map)
    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        map.put("time", "北京时间"+df.format(new Date()));
        return "login";
    }
    @RequestMapping("/manage")
    public String manage(Model model)
    {
        Subject subject= SecurityUtils.getSubject();
        Login login=loginService.get((String)subject.getPrincipal());
        model.addAttribute("username",login.getUsername());
        return "manage";
    }
    @RequestMapping("/noAuth")
    public String noAuth()
    {
        return "noAuth";
    }
    @RequestMapping("/signout")
    public String signOut()
    {
        Subject subject= SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/";
    }
    @RequestMapping("/login")
    public String login(Model model, String username, String password)
    {
        System.out.println("得到姓名"+username+"，得到密码"+password);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        model.addAttribute("time", "北京时间"+df.format(new Date()));
        /**
         * 使用Shiro编写认证操作
         */
        //1、获取subject
        Subject subject= SecurityUtils.getSubject();
        //2、封装用户数据
        UsernamePasswordToken token=new UsernamePasswordToken(username,password);
        //3、执行登录方法
        try
        {
            Login login=loginService.get(token.getUsername());
            subject.login(token);
            System.out.println("登录成功");
            //没用异常代表登录成功
            return "redirect:manage";
        } catch (UnknownAccountException e)
        {
            //返回UnknownAccountException 代表用户名不存在
            model.addAttribute("msg","用户名不存在");
            return "login";
        }
        catch (IncorrectCredentialsException e)
        {
            //返回IncorrectCredentialsException 代表密码错误
            model.addAttribute("msg","密码错误");
            return "login";
        }
    }



}