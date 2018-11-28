package com.yixing.splib.service;

import com.yixing.splib.entity.Login;

import java.util.List;

public interface LoginService
{
    //增加Login信息
    public void saveLogin(Login login);
    //更新Login信息
    public void updateLogin(Login login);
    //获取所有Login信息
    public List<Login> getAll();
}
