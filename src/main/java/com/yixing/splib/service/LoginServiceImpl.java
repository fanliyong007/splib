package com.yixing.splib.service;

import com.yixing.splib.dao.LoginMapper;
import com.yixing.splib.entity.Login;
import com.yixing.splib.entity.LoginExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("loginService")
public class LoginServiceImpl implements LoginService
{
    @Resource
    private LoginMapper loginMapper;
    @Override
    public void saveLogin(Login login)
    {
        loginMapper.insertSelective(login);
    }
    @Override
    public void updateLogin(Login login)
    {
        loginMapper.updateByPrimaryKey(login);
    }

    @Override
    public Login get(String username)
    {
        return loginMapper.selectByPrimaryKey(username);
    }

    @Override
    public List<Login> getAll()
    {
        LoginExample loginExample=new LoginExample();
        loginExample.setOrderByClause("username");
        return loginMapper.selectByExample(loginExample);
    }
}
