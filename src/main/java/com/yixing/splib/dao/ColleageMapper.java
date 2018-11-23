package com.yixing.splib.dao;

import com.yixing.splib.entity.Colleage;
import com.yixing.splib.entity.ColleageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColleageMapper {
    int countByExample(ColleageExample example);

    int deleteByExample(ColleageExample example);

    int deleteByPrimaryKey(String colleageId);

    int insert(Colleage record);

    int insertSelective(Colleage record);

    List<Colleage> selectByExample(ColleageExample example);

    Colleage selectByPrimaryKey(String colleageId);

    int updateByExampleSelective(@Param("record") Colleage record, @Param("example") ColleageExample example);

    int updateByExample(@Param("record") Colleage record, @Param("example") ColleageExample example);

    int updateByPrimaryKeySelective(Colleage record);

    int updateByPrimaryKey(Colleage record);
}