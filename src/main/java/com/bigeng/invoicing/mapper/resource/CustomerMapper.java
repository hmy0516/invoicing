package com.bigeng.invoicing.mapper.resource;

import com.bigeng.invoicing.pojo.resource.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    int deleteByPrimaryKey(String cId);

    int insert(Customer record);

    Customer selectByPrimaryKey(String cId);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);
}