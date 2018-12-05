package com.yixing.splib.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig
{
    @Bean
    //创建ShiroFilterFactoryBean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager")DefaultWebSecurityManager securityManager)
    {
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //添加shiro内置过滤器，可以实现权限相关的拦截
        /**
         * 常用的过滤器：
         *         anon:无需认证（登录）可以访问
         *         authc：必须认证才可以访问
         *         user：如果使用rememberMe的功能可以访问
         *         perms：该资源必须授予资源权限才可以访问
         *         role：该资源必须的到角色权限才可以访问
         */
        Map<String,String> filterMap=new LinkedHashMap<>();
        //放行登录页面
        filterMap.put("/login","anon");
        filterMap.put("/*","authc");
        filterMap.put("/manage/*","authc");
        //授权过滤器
        filterMap.put("/api/user","perms[admin]");
        filterMap.put("/api/book","perms[user]");
        filterMap.put("/api/oplog","perms[admin]");
        //修改跳转页面
        shiroFilterFactoryBean.setLoginUrl("/");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        //设置未授权提示页面
        shiroFilterFactoryBean.setUnauthorizedUrl("/noAuth");
        return shiroFilterFactoryBean;
    }
    @Bean(name = "securityManager")
    //创建DefaultWebSecurityManager
    public DefaultWebSecurityManager getSecurityManager(@Qualifier("userRealm")UserRealm userRealm)
    {
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        //关联realm
        securityManager.setRealm(userRealm);
        return  securityManager;
    }
    //创建Realm
    @Bean(name = "userRealm")
    public UserRealm getRealm()
    {
        return new UserRealm();
    }
    /**
     * 配置ShiroDialect结合thymeleaf与shiro
     */
    @Bean
    public ShiroDialect getShiroDialect()
    {
        return new ShiroDialect();
    }
}

