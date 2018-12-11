package com.yixing.splib.service;

import com.yixing.splib.dao.DetailMapper;
import com.yixing.splib.entity.Detail;
import com.yixing.splib.entity.DetailExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
@Service("detailService")
public class DetailServiceImpl implements DetailService
{
    @Resource
    private DetailMapper detailMapper;
    @Override
    public void saveDetail(Detail detail)
    {
        detailMapper.insertSelective(detail);
    }

    @Override
    public void deleteDetail(String book_id)
    {
        detailMapper.deleteByPrimaryKey(book_id);
    }

    @Override
    public void updateDetail(Detail detail)
    {
        detailMapper.updateByPrimaryKey(detail);
    }

    @Override
    public List<Detail> getAll()
    {
        DetailExample detailExample=new DetailExample();
        detailExample.setOrderByClause("book_id");
        return detailMapper.selectByExampleALL(detailExample);
    }

    @Override
    public Detail get(Detail detail)
    {
        DetailExample detailExample=new DetailExample();
        DetailExample.Criteria criteria = detailExample.createCriteria();
        if(!StringUtils.isEmpty(detail.getSubnum()))
        {
            criteria.andSubnumEqualTo(detail.getSubnum());
        }
        return detailMapper.selectByExampleALL(detailExample).get(0);
    }

    @Override
    public void deleteDetailBatch(List<String> book_ids)
    {
        DetailExample detailExample=new DetailExample();
        DetailExample.Criteria criteria=detailExample.createCriteria();
        criteria.andBookIdIn(book_ids);
        detailMapper.deleteByExample(detailExample);
    }
}
