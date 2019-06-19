package com.bigeng.invoicing.service.base.impl;

import com.bigeng.invoicing.mapper.base.SaleOrderMapper;
import com.bigeng.invoicing.pojo.base.SaleOrder;
import com.bigeng.invoicing.pojo.base.SaleOrderKey;
import com.bigeng.invoicing.service.base.SaleorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class SaleorderServiceImpl implements SaleorderService {

    @Autowired
    SaleOrderMapper saleOrderMapper;

    @Override
    public List<SaleOrder> showAllSale() {
        return saleOrderMapper.selectByKey();
    }

    @Override
    public int insert(SaleOrder record) {
        record.setcUuid(UUID.randomUUID().toString().replaceAll("-", ""));
        record.setDtDt(new Date());
        return saleOrderMapper.insert(record);
    }

    @Override
    public int insertSelective(SaleOrder record) {
        return saleOrderMapper.insertSelective(record);
    }

    @Override
    public SaleOrder selectByPrimaryKey(SaleOrderKey key) {
        return saleOrderMapper.selectByPrimaryKey(key);
    }

    @Override
    public Long findMaxDate() {
        return saleOrderMapper.findMaxDate();
    }

    @Override
    public int updateByPrimaryKeySelective(SaleOrder record) {
        return saleOrderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SaleOrder record) {
        return saleOrderMapper.updateByPrimaryKey(record);
    }
}
