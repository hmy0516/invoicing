package com.bigeng.invoicing.mapper.resource;

import com.bigeng.invoicing.pojo.resource.Vendor;

import java.util.List;

public interface VendorMapper {
    int deleteByPrimaryKey(String cId);

    int insert(Vendor record);

    Vendor selectByPrimaryKey(String cId);

    List<Vendor> selectAll();

    int updateByPrimaryKey(Vendor record);
}