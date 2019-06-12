package com.bigeng.invoicing.service.base.impl;

import com.bigeng.invoicing.mapper.base.SaleOrderDetailMapper;
import com.bigeng.invoicing.mapper.base.SaleOrderMapper;
import com.bigeng.invoicing.pojo.base.SaleOrder;
import com.bigeng.invoicing.pojo.base.SaleOrderKey;
import com.bigeng.invoicing.service.base.SaleorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleorderServiceImpl implements SaleorderService {

    @Autowired
    SaleOrderMapper saleOrderMapper;

    @Override
    public SaleOrder showAllSale(SaleOrderKey key) {
        return saleOrderMapper.selectByPrimaryKey(key);
    }
}
