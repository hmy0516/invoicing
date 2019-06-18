package com.bigeng.invoicing.service.resource.impl;

import com.bigeng.invoicing.mapper.resource.Vendor_GoodspriceMapper;
import com.bigeng.invoicing.pojo.resource.Vendor_Goodsprice;
import com.bigeng.invoicing.service.resource.Vendor_GoodspriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/15 20:59
 */
@Service
@Transactional
public class Vendor_GoodspriceServiceImpl implements Vendor_GoodspriceService {
    @Autowired
    private Vendor_GoodspriceMapper vendor_goodspriceMapper;
    @Override
    public boolean deleteByPrimaryKey(String gid,String cId) {
        String ids[]=cId.split(",");
        return vendor_goodspriceMapper.deleteByPrimaryKey(gid,ids)==ids.length;
    }

    @Override
    public int insert(Vendor_Goodsprice record) {
        return vendor_goodspriceMapper.insert(record);
    }

    @Override
    public Vendor_Goodsprice selectByPrimaryKey(String cGid, String cVid) {
        return vendor_goodspriceMapper.selectByPrimaryKey(cGid,cVid);
    }

    @Override
    public List<Vendor_Goodsprice> selectAll() {
        return vendor_goodspriceMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Vendor_Goodsprice record) {
        return vendor_goodspriceMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Vendor_Goodsprice> selectByPrimaryKeyWithC_gid(Integer page, Integer size, Integer sort, String cGid, Integer status, String vid) {
        return vendor_goodspriceMapper.selectByPrimaryKeyWithC_gid((page-1)*size,size,sort,cGid,status,vid);
    }

    @Override
    public Long selectByPrimaryKeyWithC_GidCount(String cGid, Integer status, String vid) {
        return vendor_goodspriceMapper.selectByPrimaryKeyWithC_GidCount(cGid,status,vid);
    }
}
