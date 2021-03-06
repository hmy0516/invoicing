package com.bigeng.invoicing.service.system.impl;

import com.bigeng.invoicing.mapper.system.UsersMapper;
import com.bigeng.invoicing.pojo.system.Users;
import com.bigeng.invoicing.service.system.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;

    @Override
    public Users queryUser(String id) {
        return usersMapper.queryUser(id);
    }

    @Override
    public Users login(String cNumber, String password) {
        return usersMapper.login(cNumber,password);
    }
}
