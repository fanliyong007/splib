package com.yixing.splib.service;

import com.yixing.splib.dao.UserMapper;
import com.yixing.splib.entity.User;
import com.yixing.splib.entity.UserExample;
import org.springframework.stereotype.Service;
import com.yixing.splib.entity.UserExample.Criteria;
import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService
{

    @Resource
    private UserMapper userMapper;

    //增加User信息
    public void saveUser(User user)
    {
        userMapper.insertSelective(user);
    }
    //删除User信息
    public void deleteUser(Integer id)
    {
        userMapper.deleteByPrimaryKey(id);
    }
    //更新User信息
    public void updateUser(User user)
    {
        userMapper.updateByPrimaryKeySelective(user);
    }
    //获取所有User信息
    public List<User> getAll()
    {
        UserExample userExample=new UserExample();
        userExample.setOrderByClause("user_id");
        return userMapper.selectByExample(userExample);
    }
    //批量删除
    public void deleteUserBatch(List<String> ids)
    {
        UserExample userExample = new UserExample();
        Criteria criteria = userExample.createCriteria();
        criteria.andUserIdIn(ids);
        userMapper.deleteByExample(userExample);
    }
}
