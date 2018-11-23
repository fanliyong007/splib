package com.yixing.splib.entity;

public class Colleage {
    private String colleageId;

    private String colleageName;

    public String getColleageId() {
        return colleageId;
    }

    public void setColleageId(String colleageId) {
        this.colleageId = colleageId == null ? null : colleageId.trim();
    }

    public String getColleageName() {
        return colleageName;
    }

    public void setColleageName(String colleageName) {
        this.colleageName = colleageName == null ? null : colleageName.trim();
    }
}