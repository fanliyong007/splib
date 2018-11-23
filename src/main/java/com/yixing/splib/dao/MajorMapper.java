package com.yixing.splib.dao;

import com.yixing.splib.entity.Major;
import com.yixing.splib.entity.MajorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MajorMapper {
    int countByExample(MajorExample example);

    int deleteByExample(MajorExample example);

    int deleteByPrimaryKey(String majorId);

    int insert(Major record);

    int insertSelective(Major record);

    List<Major> selectByExample(MajorExample example);

    Major selectByPrimaryKey(String majorId);

    int updateByExampleSelective(@Param("record") Major record, @Param("example") MajorExample example);

    int updateByExample(@Param("record") Major record, @Param("example") MajorExample example);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
}