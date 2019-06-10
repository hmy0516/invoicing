package com.bigeng.invoicing.mapper.enterprise;

import com.bigeng.invoicing.pojo.enterprise.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/5 8:42
 */
@Mapper
public interface EmpMapper {
    int deleteByNum(@Param("numbers") String[] splits);

    int addEmp( Employee employee);

    int updateEmp(@Param("emp") Employee employee);

    List<Employee> getEmpByPage(@Param("start") int start, @Param("size") Integer size,@Param("keywords") String keywords);
}