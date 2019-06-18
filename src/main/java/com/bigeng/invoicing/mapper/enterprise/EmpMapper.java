package com.bigeng.invoicing.mapper.enterprise;

import com.bigeng.invoicing.pojo.enterprise.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/5 8:42
 */
@Mapper
public interface EmpMapper {
    int deleteByPrimaryKey(@Param("cids") String[] cId);

    int insert(Employee record);

    Employee selectByPrimaryKey(String cNumber);

    List<Employee> selectAll();

    int updateByPrimaryKey(Employee record);

    List<Employee> selectByPage(@Param("start") Integer start, @Param("size") Integer size,
                                @Param("number") String number, @Param("name") String name, @Param("sex") String sex, @Param("lmmobile") String lmmobile, @Param("status") String status);

    Long getPageCount(@Param("number") String number, @Param("name") String name, @Param("sex") String sex, @Param("lmmobile") String lmmobile, @Param("status") String status);
}
