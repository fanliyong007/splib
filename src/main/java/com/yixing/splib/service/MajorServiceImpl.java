package com.yixing.splib.service;

import com.yixing.splib.dao.MajorMapper;
import com.yixing.splib.entity.Major;
import com.yixing.splib.entity.MajorExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("majorService")
public class MajorServiceImpl implements MajorService
{
    @Resource
    private MajorMapper majorMapper;
    @Override
    public List<Major> getAll()
    {
        MajorExample majorExample=new MajorExample();
        majorExample.setOrderByClause("major_id");
        return majorMapper.selectByExample(majorExample);
    }
}
