package com.bigeng.invoicing.service.base.impl;

import com.bigeng.invoicing.mapper.base.PurchorderMapper;
import com.bigeng.invoicing.pojo.base.Purchorder;
import com.bigeng.invoicing.pojo.base.Purchorderdetail;
import com.bigeng.invoicing.service.base.PurchorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchorderServiceImpl implements PurchorderService {

    @Autowired
    PurchorderMapper purchorderMapper;
    @Override
    public List<Purchorder> findAll() {
        return purchorderMapper.findAll();
    }

    @Override
    public Purchorder findOne(Long i_pono) {
        return purchorderMapper.findOne(i_pono);
    }

    @Override
    public Boolean addOne(Purchorder  purchorder) {
        return purchorderMapper.addOne(purchorder);
    }

    @Override
    public Boolean addPurchorderdetail(Purchorderdetail  purchorderdetail) {
        return purchorderMapper.addPurchorderdetail(purchorderdetail);
    }

    @Override
    public int deleteOne(Long i_pono) {
        return purchorderMapper.deleteOne(i_pono);
    }

    @Override
    public int deleteOnePurchorderdetail(Long i_pono, String c_gid) {
        return purchorderMapper.deleteOnePurchorderdetail(i_pono,c_gid);
    }

    @Override
    public int deleteAllPurchorderdetail(Long i_pono) {
        return purchorderMapper.deleteAllPurchorderdetail(i_pono);
    }

    @Override
    public int updateOne(Purchorder purchorder) {
        return purchorderMapper.updateOne(purchorder);
    }

    @Override
    public int updateStatus(Long i_pono, int i_status) {
        return purchorderMapper.updateStatus(i_pono,i_status);
    }

    @Override
    public List<Purchorder> findAllByVendor(String c_vendor) {
        return purchorderMapper.findAllByVendor(c_vendor);
    }

}
