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
    private EmpMapper empMapper;

    @Override
    public int add(Employee employee) {
        return empMapper.addEmp(employee);
    }

    @Override
    public boolean deleteByNum(String numbers) {
        String[] splits=numbers.split(",");
        return empMapper.deleteByNum(splits)==splits.length;
    }

    @Override
    public int updateEmp(Employee employee) {
        return empMapper.updateEmp(employee);
    }

    @Override
    public List<Employee> getEmpByPage(Integer page, Integer size, String keywords, String c_number) {
        int start=(page-1)*size;
        return empMapper.getEmpByPage(start,size,keywords,c_number);
    }
}
