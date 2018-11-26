package com.yixing.splib.service;

import com.yixing.splib.entity.Catalog;

import java.util.List;

public interface CatalogService
{
    //增加User信息
    public void saveCatalog(Catalog catalog);
    //删除User信息
    public void deleteCatalog(String subnum);
    //更新User信息
    public void updateCatalog(Catalog catalog);
    //获取所有User信息
    public List<Catalog> getAll();
    //批量删除
    public void deleteCatalogBatch(List<String> ids);
}
