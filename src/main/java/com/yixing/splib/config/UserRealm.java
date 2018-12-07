package com.yixing.splib.config;

import com.yixing.splib.entity.Login;
import com.yixing.splib.service.LoginService;
import org.apache.catalina.security.SecurityUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
//自定义Realm
public class UserRealm extends AuthorizingRealm
{
    @Autowired
    private LoginService loginService;
    //执行授权逻辑
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection)
    {
        System.out.println("执行授权逻辑");
        //给资源授权
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        //info.addStringPermission("user:select");
        Subject subject= SecurityUtils.getSubject();
        //subject.getPrincipal()可获得SimpleAuthenticationInfo中第一个参数
        Login login=loginService.get((String)subject.getPrincipal());
        if(login.getPerms().equals("admin"))
            info.addStringPermission("user");
        info.addStringPermission(login.getPerms());
        return info;
    }
    //执行认证逻辑
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException
    {
        System.out.println("执行认证逻辑");
        //读入数据库的用户名和密码
        //编写shiro判断逻辑，判断用户名和密码
        //1、判断用户名
        UsernamePasswordToken token=(UsernamePasswordToken) authenticationToken;
        Login login=loginService.get(token.getUsername());
        if(login==null)
        {
            //如果用户名不存在
            return null;//shiro底层会抛出UnKnowAccountException
        }
        //2、判断密码
        return new SimpleAuthenticationInfo(login.getUsername(),login.getPassword(),"UserRealm");
    }
}
