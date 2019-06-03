package com.bigeng.invoicing.controller.system;

import com.bigeng.invoicing.pojo.system.Users;
import com.bigeng.invoicing.service.system.UsersService;
import com.bigeng.invoicing.service.system.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping("/queryUser/{id}")
    public Users queryUser(@PathVariable("id") String id){
        return usersService.queryUser(id);
    }
}
