package com.bigeng.invoicing.controller.system;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.system.LoginForm;
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

    @PostMapping(value = "/login")
    public RespMsg login(@RequestBody LoginForm loginForm){
        System.out.println(loginForm.getUsername()+"="+loginForm.getPassword());
        Users user = usersService.login(loginForm.getUsername(), loginForm.getPassword());
        if(user!=null)
            return RespMsg.ok("登录成功!!",user);
        else
            return RespMsg.error("登录失败!!!");
    }
}
