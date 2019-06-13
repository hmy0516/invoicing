package com.bigeng.invoicing.mapper.resource;

import com.bigeng.invoicing.pojo.resource.Vendor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface VendorMapper {
    int deleteByPrimaryKey(@Param("cids") String[] cId);

    int insert(Vendor record);

    Vendor selectByPrimaryKey(String cId);

    List<Vendor> selectAll();

    int updateByPrimaryKey(Vendor record);

    List<Vendor> selectByPage(@Param("start") Integer start, @Param("size") Integer size, @Param("name") String name, @Param("addr") String addr, @Param("contacter") String contacter, @Param("salename") String salename);

    Long getPageCount(@Param("name") String name,@Param("addr") String addr,@Param("contacter") String contacter,@Param("salename") String salename);
}