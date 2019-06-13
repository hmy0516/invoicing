package com.bigeng.invoicing.service.resource;

import com.bigeng.invoicing.pojo.resource.Customer;

import java.util.List;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/10 20:10
 */
public interface CustomerService {

    boolean deleteByPrimaryKey(String cId);

    int insert(Customer record);

    Customer selectByPrimaryKey(String cId);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);

    List<Customer> selectByPage( Integer page, Integer size, String name, String addr, String contacter, String saleneme);

    Long PageCount(String name, String addr, String contacter, String salename);
}
