package com.bigeng.invoicing.mapper;

import com.bigeng.invoicing.pojo.system.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {

    Users queryUser(String id);
}
