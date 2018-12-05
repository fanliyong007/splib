package com.yixing.splib.service;

import com.yixing.splib.dao.OplogMapper;
import com.yixing.splib.entity.Oplog;
import com.yixing.splib.entity.OplogExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("oplogService")
public class OplogServiceImpl implements OplogService
{
    @Resource
    private OplogMapper oplogMapper;

    @Override
    public void saveOplog(Oplog oplog)
    {
        oplogMapper.insertSelective(oplog);
    }
    @Override
    public List<Oplog> getAll()
    {
        OplogExample oplogExample=new OplogExample();
        oplogExample.setOrderByClause("op_id");
        return oplogMapper.selectByExampleALL(oplogExample);
    }
}
