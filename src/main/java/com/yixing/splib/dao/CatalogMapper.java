package com.yixing.splib.dao;

import com.yixing.splib.entity.Catalog;
import com.yixing.splib.entity.CatalogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CatalogMapper {
    int countByExample(CatalogExample example);

    int deleteByExample(CatalogExample example);

    int deleteByPrimaryKey(String subnum);

    int insert(Catalog record);

    int insertSelective(Catalog record);

    List<Catalog> selectByExample(CatalogExample example);

    Catalog selectByPrimaryKey(String subnum);

    int updateByExampleSelective(@Param("record") Catalog record, @Param("example") CatalogExample example);

    int updateByExample(@Param("record") Catalog record, @Param("example") CatalogExample example);

    int updateByPrimaryKeySelective(Catalog record);

    int updateByPrimaryKey(Catalog record);
}