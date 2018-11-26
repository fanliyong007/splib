package com.yixing.splib.service;

import com.yixing.splib.entity.User;
import java.util.List;


public interface UserService
{
    //增加User信息
    public void saveUser(User user);
    //删除User信息
    public void deleteUser(Integer id);
    //更新User信息
    public void updateUser(User user);
    //获取所有User信息
    public List<User> getAll();
    //批量删除
    public void deleteUserBatch(List<String> ids);
}
