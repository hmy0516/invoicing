package com.bigeng.invoicing.service.resource;

import com.bigeng.invoicing.pojo.resource.Vendor;

import java.util.List;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/11 17:57
 */
public interface VendorService {
    boolean deleteByPrimaryKey(String cId);

    int insert(Vendor record);

    Vendor selectByPrimaryKey(String cId);

    List<Vendor> selectAll();

    int updateByPrimaryKey(Vendor record);

    List<Vendor> selectByPage( Integer page, Integer size, String name, String addr, String contacter, String saleneme);

    Long PageCount(String name, String addr, String contacter, String salename);
}
