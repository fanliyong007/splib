package com.yixing.splib.dao;

import com.yixing.splib.entity.Oplog;
import com.yixing.splib.entity.OplogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OplogMapper {
    int countByExample(OplogExample example);

    int deleteByExample(OplogExample example);

    int deleteByPrimaryKey(String opId);

    int insert(Oplog record);

    int insertSelective(Oplog record);

    List<Oplog> selectByExample(OplogExample example);

    Oplog selectByPrimaryKey(String opId);

    int updateByExampleSelective(@Param("record") Oplog record, @Param("example") OplogExample example);

    int updateByExample(@Param("record") Oplog record, @Param("example") OplogExample example);

    int updateByPrimaryKeySelective(Oplog record);

    int updateByPrimaryKey(Oplog record);
}