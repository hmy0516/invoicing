package com.bigeng.invoicing.controller.resource;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.resource.Customer;
import com.bigeng.invoicing.service.resource.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/10 20:24
 */
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customer",method = RequestMethod.POST)
    public RespMsg addCustomer(@RequestBody Customer customer){
        if(customerService.insert(customer)==1){
            return RespMsg.ok("添加成功");
        }
        else {
            return  RespMsg.error("添加失败");
        }
    }

    @RequestMapping(value = "/customer",method = RequestMethod.PUT)
    public RespMsg updateCustomer(@RequestBody Customer customer){
        if(customerService.updateByPrimaryKey(customer)==1){
            return  RespMsg.ok("更改成功");
        }
        else{
           return RespMsg.error("更改失败");
        }
    }

    @RequestMapping(value = "/customer",method = RequestMethod.GET)
    public RespMsg selectCustomer(){
        return RespMsg.ok("查询成功",customerService.selectAll());
    }

}
