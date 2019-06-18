package com.bigeng.invoicing.service.resource;

import com.bigeng.invoicing.pojo.resource.Vendor_Goodsprice;

import java.util.List;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/15 20:54
 */
public interface Vendor_GoodspriceService {
    boolean deleteByPrimaryKey(String gid,String cId);

    int insert(Vendor_Goodsprice record);

    Vendor_Goodsprice selectByPrimaryKey(String cGid, String cVid);

    List<Vendor_Goodsprice> selectAll();

    int updateByPrimaryKey(Vendor_Goodsprice record);

    List<Vendor_Goodsprice> selectByPrimaryKeyWithC_gid(Integer page,Integer size, Integer sort,
                                                 String cGid,Integer status,String vid );

    Long selectByPrimaryKeyWithC_GidCount(String cGid,Integer status,String vid);
}
