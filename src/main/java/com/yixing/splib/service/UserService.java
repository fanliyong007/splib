package com.yixing.splib.service;

import com.yixing.splib.entity.User;
import java.util.List;


public interface UserService
{
    //增加User信息
    public void saveUser(User user);
    //更新User信息
    public void updateUser(User user);
    //获取所有User信息
    public List<User> getAll();
    //获取某一User信息
    public List<User> get(User user);

}
