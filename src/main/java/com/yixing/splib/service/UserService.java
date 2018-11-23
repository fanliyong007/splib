package com.yixing.splib.service;

import com.yixing.splib.dao.UserMapper;
import com.yixing.splib.entity.User;
import com.yixing.splib.entity.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserMapper userMapper;
    public List<User> getAll()
    {
        return userMapper.selectByExample(null);
    }

}
