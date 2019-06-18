package com.bigeng.invoicing.service.base.impl;

import com.bigeng.invoicing.mapper.base.SaleOrderDetailMapper;
import com.bigeng.invoicing.pojo.base.SaleOrderDetail;
import com.bigeng.invoicing.pojo.base.SaleOrderDetailKey;
import com.bigeng.invoicing.service.base.SaleOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleOrderDetailServiceImpl implements SaleOrderDetailService {

    @Autowired
    SaleOrderDetailMapper detailMapper;

    @Override
    public int deleteByPrimaryKey(SaleOrderDetailKey key) {
        return detailMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(SaleOrderDetail record) {
        return detailMapper.insert(record);
    }

    @Override
    public int insertBatch(List<SaleOrderDetail> list) {
        return detailMapper.insertBatch(list);
    }

    @Override
    public int insertSelective(SaleOrderDetail record) {
        return detailMapper.insertSelective(record);
    }

    @Override
    public SaleOrderDetail selectByPrimaryKey(SaleOrderDetailKey key) {
        return detailMapper.selectByPrimaryKey(key);
    }

    @Override
    public SaleOrderDetail findOrderByNo(Long iNo) {
        return detailMapper.findOrderByNo(iNo);
    }

    @Override
    public int updateByPrimaryKeySelective(SaleOrderDetail record) {
        return detailMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SaleOrderDetail record) {
        return detailMapper.updateByPrimaryKey(record);
    }
}
