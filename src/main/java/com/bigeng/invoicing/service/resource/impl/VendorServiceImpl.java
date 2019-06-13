package com.bigeng.invoicing.service.resource.impl;

import com.bigeng.invoicing.mapper.resource.VendorMapper;
import com.bigeng.invoicing.pojo.resource.Vendor;
import com.bigeng.invoicing.service.resource.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/11 17:59
 */
@Service
@Transactional
public class VendorServiceImpl implements VendorService {
    @Autowired
    private VendorMapper vendorMapper;

    @Override
    public boolean deleteByPrimaryKey(String cId) {
        String ids[]=cId.split(",");
        return vendorMapper.deleteByPrimaryKey(ids)==ids.length;
    }

    @Override
    public int insert(Vendor record) {
        return vendorMapper.insert(record);
    }

    @Override
    public Vendor selectByPrimaryKey(String cId) {
        return vendorMapper.selectByPrimaryKey(cId);
    }

    @Override
    public List<Vendor> selectAll() {
        return vendorMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Vendor record) {
        return vendorMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Vendor> selectByPage(Integer page, Integer size, String name, String addr, String contacter, String saleneme) {
        int start=(page-1)*size;
        return vendorMapper.selectByPage(start,size,name,addr,contacter,saleneme);
    }

    @Override
    public Long PageCount(String name, String addr, String contacter, String salename) {
        return vendorMapper.getPageCount(name,addr,contacter,salename);
    }
}
