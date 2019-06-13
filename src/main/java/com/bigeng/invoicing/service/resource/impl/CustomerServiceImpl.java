package com.bigeng.invoicing.service.resource.impl;

import com.bigeng.invoicing.mapper.resource.CustomerMapper;
import com.bigeng.invoicing.pojo.resource.Customer;
import com.bigeng.invoicing.service.resource.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/10 20:12
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public boolean deleteByPrimaryKey(String cId) {
        String ids[]=cId.split(",");
        return customerMapper.deleteByPrimaryKey(ids)==ids.length;
    }

    @Override
    public int insert(Customer record) {
        return customerMapper.insert(record);
    }

    @Override
    public Customer selectByPrimaryKey(String cId) {
        return customerMapper.selectByPrimaryKey(cId);
    }

    @Override
    public List<Customer> selectAll() {
        return customerMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        return customerMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Customer> selectByPage(Integer page, Integer size, String name, String addr, String contacter, String saleneme) {
        int start=(page-1)*size;
        return customerMapper.selectByPage(start,size,name,addr,contacter,saleneme);
    }

    @Override
    public Long PageCount(String name, String addr, String contacter, String salename) {
        return customerMapper.getPageCount(name,addr,contacter,salename);
    }
}
