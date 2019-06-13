package com.bigeng.invoicing.mapper.resource;

import com.bigeng.invoicing.pojo.resource.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerMapper {
    int deleteByPrimaryKey(@Param("cids") String[] cId);

    int insert(Customer record);

    Customer selectByPrimaryKey(String cId);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);

    List<Customer> selectByPage(@Param("start") Integer start,@Param("size") Integer size,@Param("name") String name,@Param("addr") String addr,@Param("contacter") String contacter,@Param("salename") String salename);

    Long getPageCount(@Param("name") String name,@Param("addr") String addr,@Param("contacter") String contacter,@Param("salename") String salename);
}