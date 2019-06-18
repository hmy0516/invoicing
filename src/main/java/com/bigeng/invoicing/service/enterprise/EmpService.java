package com.bigeng.invoicing.service.enterprise;

import com.bigeng.invoicing.pojo.enterprise.Employee;

import java.util.List;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/5 8:43
 */
public interface EmpService {
    boolean deleteByPrimaryKey(String cId);

    int insert(Employee record);

    Employee selectByPrimaryKey(String cNumber);

    List<Employee> selectAll();

    int updateByPrimaryKey(Employee record);

    List<Employee> selectByPage(Integer page, Integer size,
                                String number, String name, String sex,String lmmobile,String status);

    Long PageCount(String number, String name, String sex,String lmmobile,String status);
}
