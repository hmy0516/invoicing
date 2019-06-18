package com.bigeng.invoicing.service.base.impl;

import com.bigeng.invoicing.mapper.base.BaseInMapper;
import com.bigeng.invoicing.pojo.base.BaseIn;
import com.bigeng.invoicing.pojo.base.BaseInDetail;
import com.bigeng.invoicing.service.base.BaseInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseInServiceImpl implements BaseInService {
    @Autowired
    BaseInMapper baseInMapper;
    @Override
    public Boolean addBaseIn(BaseIn baseIn) {
        return baseInMapper.addBaseIn(baseIn);
    }

    @Override
    public Boolean addBaseInDetail(BaseInDetail baseInDetail) {
        return baseInMapper.addBaseInDetail(baseInDetail);
    }

    @Override
    public List<BaseIn> findAllBaseIn() {
        return baseInMapper.findAllBaseIn();
    }

    @Override
    public BaseIn findOneBaseIn(String c_uuid) {
        return baseInMapper.findOneBaseIn(c_uuid);
    }
}
