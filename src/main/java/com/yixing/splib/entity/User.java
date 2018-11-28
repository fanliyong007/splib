package com.yixing.splib.entity;

import java.util.Date;

public class User {
    private Integer userCode;

    private String userId;

    private String userName;

    private Date regdate;

    private Integer borrowed;

    private Boolean iscanceled;

    private Date canceleddate;

    private Integer userAge;

    private String userGender;

    private String idnum;

    private String userPhone;

    private Integer brrowlimit;

    private Boolean iscompensated;

    private Integer compensatedint;

    private Boolean isfined;

    private Integer fineint;

    private String majorId;
    private String colleageId;

    private Colleage colleage;

    private Major major;

    public Integer getUserCode() {
        return userCode;
    }

    public void setUserCode(Integer userCode) {
        this.userCode = userCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public Integer getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Integer borrowed) {
        this.borrowed = borrowed;
    }

    public Boolean getIscanceled() {
        return iscanceled;
    }

    public void setIscanceled(Boolean iscanceled) {
        this.iscanceled = iscanceled;
    }

    public Date getCanceleddate() {
        return canceleddate;
    }

    public void setCanceleddate(Date canceleddate) {
        this.canceleddate = canceleddate;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender == null ? null : userGender.trim();
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum == null ? null : idnum.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getBrrowlimit() {
        return brrowlimit;
    }

    public void setBrrowlimit(Integer brrowlimit) {
        this.brrowlimit = brrowlimit;
    }

    public Boolean getIscompensated() {
        return iscompensated;
    }

    public void setIscompensated(Boolean iscompensated) {
        this.iscompensated = iscompensated;
    }

    public Integer getCompensatedint() {
        return compensatedint;
    }

    public void setCompensatedint(Integer compensatedint) {
        this.compensatedint = compensatedint;
    }

    public Boolean getIsfined() {
        return isfined;
    }

    public void setIsfined(Boolean isfined) {
        this.isfined = isfined;
    }

    public Integer getFineint() {
        return fineint;
    }

    public void setFineint(Integer fineint) {
        this.fineint = fineint;
    }

    public Colleage getColleage()
    {
        return colleage;
    }

    public void setColleage(Colleage colleage)
    {
        this.colleage = colleage;
    }

    public Major getMajor()
    {
        return major;
    }

    public void setMajor(Major major)
    {
        this.major = major;
    }

    public String getMajorId()
    {
        return majorId;
    }

    public void setMajorId(String majorId)
    {
        this.majorId = majorId;
    }

    public String getColleageId()
    {
        return colleageId;
    }

    public void setColleageId(String colleageId)
    {
        this.colleageId = colleageId;
    }

    public User(Integer userCode, String userId, String userName, Date regdate, Integer borrowed, Boolean iscanceled, Date canceleddate, Integer userAge, String userGender, String idnum, String userPhone, Integer brrowlimit, Boolean iscompensated, Integer compensatedint, Boolean isfined, Integer fineint, String majorId, String colleageId)
    {
        this.userCode = userCode;
        this.userId = userId;
        this.userName = userName;
        this.regdate = regdate;
        this.borrowed = borrowed;
        this.iscanceled = iscanceled;
        this.canceleddate = canceleddate;
        this.userAge = userAge;
        this.userGender = userGender;
        this.idnum = idnum;
        this.userPhone = userPhone;
        this.brrowlimit = brrowlimit;
        this.iscompensated = iscompensated;
        this.compensatedint = compensatedint;
        this.isfined = isfined;
        this.fineint = fineint;
        this.majorId = majorId;
        this.colleageId = colleageId;
    }

    public User()
    {
        super();
    }

    @Override
    public String toString()
    {
        return "User{" +
                "userCode=" + userCode +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", regdate=" + regdate +
                ", borrowed=" + borrowed +
                ", iscanceled=" + iscanceled +
                ", canceleddate=" + canceleddate +
                ", userAge=" + userAge +
                ", userGender='" + userGender + '\'' +
                ", idnum='" + idnum + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", brrowlimit=" + brrowlimit +
                ", iscompensated=" + iscompensated +
                ", compensatedint=" + compensatedint +
                ", isfined=" + isfined +
                ", fineint=" + fineint +
                ", majorId='" + majorId + '\'' +
                ", colleageId='" + colleageId + '\'' +
                '}';
    }
}