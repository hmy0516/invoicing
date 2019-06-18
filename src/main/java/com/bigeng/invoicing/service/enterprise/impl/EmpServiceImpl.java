package com.bigeng.invoicing.service.enterprise.impl;

import com.bigeng.invoicing.mapper.enterprise.EmpMapper;
import com.bigeng.invoicing.pojo.enterprise.Employee;
import com.bigeng.invoicing.service.enterprise.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/5 8:44
 */
@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper employeeMapper;

    @Override
    public boolean deleteByPrimaryKey(String cId) {
        String ids[]=cId.split(",");
        return employeeMapper.deleteByPrimaryKey(ids)==ids.length;
    }

    @Override
    public int insert(Employee record) {
        return employeeMapper.insert(record);
    }

    @Override
    public Employee selectByPrimaryKey(String cId) {
        return employeeMapper.selectByPrimaryKey(cId);
    }

    @Override
    public List<Employee> selectAll() {
        return employeeMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Employee record) {
        return employeeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Employee> selectByPage(Integer page, Integer size,
                                       String number, String name, String sex,String lmmobile,String status) {
        int start=(page-1)*size;
        return employeeMapper.selectByPage(start,size,number,name,sex,lmmobile,status);
    }

    @Override
    public Long PageCount(String number, String name, String sex,String lmmobile,String status) {
        return employeeMapper.getPageCount(number,name,sex,lmmobile,status);
    }
}
