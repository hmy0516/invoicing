package com.bigeng.invoicing.mapper.enterprise;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/5 8:42
 */
@Mapper
public interface EmpMapper {
    int deleteByNum(@Param("numbers") String[] splits);

    int add(EmpMapper empMapper);
}
