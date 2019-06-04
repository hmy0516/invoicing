package com.bigeng.invoicing.mapper.enterprise;
import com.bigeng.invoicing.pojo.enterprise.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface DepartmentMapper  {

    /*@Select("select * from t_hr_department ")*/
    public List<Department> findAll();
    public Boolean addOne(Department department);
    public  void deleteOne(String id);
    public Department findOne(String id);
    public int updateOne(Department department);
}