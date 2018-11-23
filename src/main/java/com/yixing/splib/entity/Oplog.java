package com.yixing.splib.entity;

import java.util.Date;

public class Oplog {
    private String opId;

    private String opWay;

    private Date opTime;

    private String bookId;

    private String userId;

    private String opUser;

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
}