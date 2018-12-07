package com.yixing.splib.service;


import com.yixing.splib.dao.CatalogMapper;
import com.yixing.splib.entity.Catalog;
import com.yixing.splib.entity.CatalogExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service("catalogService")
public class CatalogServiceImpl implements CatalogService
{
    @Resource
    private CatalogMapper catalogMapper;

    //增加User信息
    public void saveCatalog(Catalog catalog)
    {
        catalogMapper.insertSelective(catalog);
    }
    //删除User信息
    public void deleteCatalog(String subnum)
    {
        catalogMapper.deleteByPrimaryKey(subnum);
    }
    //更新User信息
    public void updateCatalog(Catalog catalog)
    {
        catalogMapper.updateByPrimaryKey(catalog);
    }
    //获取所有User信息
    public List<Catalog> getAll()
    {
        CatalogExample catalogExample=new CatalogExample();
        catalogExample.setOrderByClause("subnum");
        return catalogMapper.selectByExample(catalogExample);
    }

    @Override
    public List<Catalog> get(Catalog catalog)
    {
        CatalogExample catalogExample=new CatalogExample();
        CatalogExample.Criteria criteria = catalogExample.createCriteria();
        if(!StringUtils.isEmpty(catalog.getSubnum()))
        {
            criteria.andSubnumEqualTo(catalog.getSubnum());
        }
        if(!StringUtils.isEmpty(catalog.getBookName()))
        {
            catalog.setBookName("%"+catalog.getBookName()+"%");
            criteria.andBookNameLike(catalog.getBookName());
        }
        if(!StringUtils.isEmpty(catalog.getBookAuthor()))
        {
            catalog.setBookAuthor("%"+catalog.getBookAuthor()+"%");
            criteria.andBookAuthorLike(catalog.getBookAuthor());
        }
           return catalogMapper.selectByExample(catalogExample);
    }
    //批量删除
    public void deleteCatalogBatch(List<String> ids)
    {
        CatalogExample userExample = new CatalogExample();
        CatalogExample.Criteria criteria = userExample.createCriteria();
        criteria.andSubnumIn(ids);
        catalogMapper.deleteByExample(userExample);
    }
}
