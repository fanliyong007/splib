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
    public void deleteLogin(String username)
    {
        loginMapper.deleteByPrimaryKey(username);
    }

    @Override
    public void updateLogin(Login login)
    {
        loginMapper.updateByPrimaryKey(login);
    }

    @Override
    public List<Login> getAll()
    {
        LoginExample loginExample=new LoginExample();
        loginExample.setOrderByClause("username");
        return loginMapper.selectByExample(loginExample);
    }

    @Override
    public void deleteLoginBatch(List<String> usernames)
    {
        LoginExample loginExample=new LoginExample();
        LoginExample.Criteria criteria=loginExample.createCriteria();
        criteria.andUsernameIn(usernames);
        loginMapper.deleteByExample(loginExample);
    }
}
