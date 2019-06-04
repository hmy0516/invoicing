package com.bigeng.invoicing.controller.system;

import com.bigeng.invoicing.pojo.system.Users;
import com.bigeng.invoicing.service.system.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping("/queryUser/{id}")
    //@RequestMapping(value = "/queryUser/{id}",method = RequestMethod.GET)
    public Users queryUser(@PathVariable("id") String id){
        return usersService.queryUser(id);
    }
}
