package com.yixing.splib.service;

import com.yixing.splib.entity.Oplog;

import java.util.List;

public interface OplogService
{
    //增加Oplog信息
    public void saveOplog(Oplog oplog);
    //获取所有Oplog信息
    public List<Oplog> getAll();

}