package com.bigeng.invoicing.mapper.system;

import com.bigeng.invoicing.pojo.system.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersMapper {

    Users queryUser(String id);
    Users login(@Param("username") String cNumber, @Param("password") String password);
}
