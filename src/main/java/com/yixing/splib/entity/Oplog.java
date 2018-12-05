package com.yixing.splib.entity;


import java.util.Date;

public class Oplog {
    private String opId;

    private String opWay;

    private Date opTime;

    private String bookId;

    private String userId;

    private String opUser;

    private Catalog catalog;

    private User user;

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId == null ? null : opId.trim();
    }

    public String getOpWay() {
        return opWay;
    }

    public void setOpWay(String opWay) {
        this.opWay = opWay == null ? null : opWay.trim();
    }

    public Date getOpTime() {
        return opTime;
    }

    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId == null ? null : bookId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOpUser() {
        return opUser;
    }

    public void setOpUser(String opUser) {
        this.opUser = opUser == null ? null : opUser.trim();
    }

    public Catalog getCatalog()
    {
        return catalog;
    }

    public void setCatalog(Catalog catalog)
    {
        this.catalog = catalog;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public Oplog(String opId, String opWay, Date opTime, String bookId, String userId, String opUser)
    {
        this.opId = opId;
        this.opWay = opWay;
        this.opTime = opTime;
        this.bookId = bookId;
        this.userId = userId;
        this.opUser = opUser;
    }

    public Oplog()
    {
        super();
    }

    @Override
    public String toString()
    {
        return "Oplog{" +
                "opId='" + opId + '\'' +
                ", opWay='" + opWay + '\'' +
                ", opTime=" + opTime +
                ", bookId='" + bookId + '\'' +
                ", userId='" + userId + '\'' +
                ", opUser='" + opUser + '\'' +
                '}';
    }
}