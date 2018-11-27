package com.yixing.splib.service;

import com.yixing.splib.entity.Detail;

import java.util.List;

public interface DetailService
{

    //增加Detail信息
    public void saveDetail(Detail detail);
    //删除Detail信息
    public void deleteDetail(String book_id);
    //更新Detail信息
    public void updateDetail(Detail detail);
    //获取所有Detail信息
    public List<Detail> getAll();
    //批量删除
    public void deleteDetailBatch(List<String> book_ids);

}
