package com.yixing.splib.service;

import com.yixing.splib.entity.Login;

import java.util.List;

public interface LoginService
{
    //增加Login信息
    public void saveLogin(Login login);
    //删除Login信息
    public void deleteLogin(String username);
    //更新Login信息
    public void updateLogin(Login login);
    //获取所有Login信息
    public List<Login> getAll();
    //批量删除
    public void deleteLoginBatch(List<String> usernames);
}
