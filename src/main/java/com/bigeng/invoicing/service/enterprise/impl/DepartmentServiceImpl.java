package com.bigeng.invoicing.service.enterprise.impl;

import com.bigeng.invoicing.mapper.enterprise.DepartmentMapper;
import com.bigeng.invoicing.pojo.enterprise.Department;
import com.bigeng.invoicing.service.enterprise.DepartmentService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> findAll(){
        return departmentMapper.findAll();
    }

    @Override
    public int deleteOne(String cDid) {
        System.out.println(cDid);
        departmentMapper.deleteOne(cDid);
        return 1;
    }

    @Override
    public Department findOne(String cDid) {
        return departmentMapper.findOne(cDid);
    }

    @Override
    public Boolean addOne(Department department) {
        Boolean bool=departmentMapper.addOne(department);
        return bool;
    }

    @Override
    public int updateOne(Department department) {
        return departmentMapper.updateOne(department);
    }


}
