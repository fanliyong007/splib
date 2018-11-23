package com.yixing.splib.controller;

import com.yixing.splib.service.UserService;
import com.yixing.splib.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@EnableAutoConfiguration
public class RESTfulController
{
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping(value="/getall")
    public Msg test()
    {
        return Msg.success().add("user",userService.getAll());
    }
}
