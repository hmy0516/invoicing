package com.bigeng.invoicing.service.enterprise;

import com.bigeng.invoicing.pojo.enterprise.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> findAll();
    public int deleteOne(String cDid);
    public Department findOne(String cDid);
    public Boolean addOne(Department department);
    public int updateOne(Department department);



}
