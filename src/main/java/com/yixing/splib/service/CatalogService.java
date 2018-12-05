package com.yixing.splib.service;

import com.yixing.splib.entity.Catalog;

import java.util.List;

public interface CatalogService
{
    //增加Book信息
    public void saveCatalog(Catalog catalog);
    //删除Book信息
    public void deleteCatalog(String subnum);
    //更新Book信息
    public void updateCatalog(Catalog catalog);
    //获取所有Book信息
    public List<Catalog> getAll();
    // 获取某个学生的信息
    public List<Catalog> get(Catalog catalog);
    //批量删除
    public void deleteCatalogBatch(List<String> ids);
}
