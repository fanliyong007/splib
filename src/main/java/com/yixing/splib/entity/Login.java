package com.yixing.splib.entity;

public class Login {
    private String username;

    private String password;

    private String perms;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms == null ? null : perms.trim();
    }

    public Login(String username, String password, String perms)
    {
        this.username = username;
        this.password = password;
        this.perms = perms;
    }

    public Login()
    {
        super();
    }

    @Override
    public String toString()
    {
        return "Login{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", perms='" + perms + '\'' +
                '}';
    }
}