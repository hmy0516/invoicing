package com.bigeng.invoicing.service.base.impl;

import com.bigeng.invoicing.mapper.base.PurchorderMapper;
import com.bigeng.invoicing.pojo.base.Purchorder;
import com.bigeng.invoicing.service.base.PurchorderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PurchorderServiceImpl implements PurchorderService {
    @Autowired
    PurchorderMapper purchorderMapper;
    @Override
    public List<Purchorder> findAll() {
        return purchorderMapper.findAll();
    }
}
