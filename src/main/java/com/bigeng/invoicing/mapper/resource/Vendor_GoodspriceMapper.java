package com.bigeng.invoicing.mapper.resource;

import com.bigeng.invoicing.pojo.resource.Vendor_Goodsprice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Vendor_GoodspriceMapper {
    int deleteByPrimaryKey(@Param("cGid") String cGid, @Param("cVid") String cVid);

    int insert(Vendor_Goodsprice record);

    Vendor_Goodsprice selectByPrimaryKey(@Param("cGid") String cGid, @Param("cVid") String cVid);

    List<Vendor_Goodsprice> selectAll();

    int updateByPrimaryKey(Vendor_Goodsprice record);
}