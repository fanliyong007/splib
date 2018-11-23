package com.yixing.splib.entity;

import java.util.Date;

public class Detail {
    private String bookId;

    private String subnum;

    private Integer bookCode;

    private Boolean islended;

    private Date outdate;

    private Date indate;

    private String userId;

    private Boolean islost;

    private Date lostdate;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId == null ? null : bookId.trim();
    }

    public String getSubnum() {
        return subnum;
    }

    public void setSubnum(String subnum) {
        this.subnum = subnum == null ? null : subnum.trim();
    }

    public Integer getBookCode() {
        return bookCode;
    }

    public void setBookCode(Integer bookCode) {
        this.bookCode = bookCode;
    }

    public Boolean getIslended() {
        return islended;
    }

    public void setIslended(Boolean islended) {
        this.islended = islended;
    }

    public Date getOutdate() {
        return outdate;
    }

    public void setOutdate(Date outdate) {
        this.outdate = outdate;
    }

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Boolean getIslost() {
        return islost;
    }

    public void setIslost(Boolean islost) {
        this.islost = islost;
    }

    public Date getLostdate() {
        return lostdate;
    }

    public void setLostdate(Date lostdate) {
        this.lostdate = lostdate;
    }
}