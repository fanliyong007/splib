package com.yixing.splib.dao;

import com.yixing.splib.entity.Detail;
import com.yixing.splib.entity.DetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetailMapper {
    int countByExample(DetailExample example);

    int deleteByExample(DetailExample example);

    int deleteByPrimaryKey(String bookId);

    int insert(Detail record);

    int insertSelective(Detail record);

    List<Detail> selectByExampleALL(DetailExample example);

    Detail selectByPrimaryKeyALL(String bookId);

    List<Detail> selectByExample(DetailExample example);

    Detail selectByPrimaryKey(String bookId);

    int updateByExampleSelective(@Param("record") Detail record, @Param("example") DetailExample example);

    int updateByExample(@Param("record") Detail record, @Param("example") DetailExample example);

    int updateByPrimaryKeySelective(Detail record);

    int updateByPrimaryKey(Detail record);
}