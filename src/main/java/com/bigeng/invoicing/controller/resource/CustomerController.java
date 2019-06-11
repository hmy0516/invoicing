package com.bigeng.invoicing.controller.resource;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.resource.Customer;
import com.bigeng.invoicing.service.resource.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public RespMsg selectCustomer(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            String name,String addr,String contacter,String salename){
        Map<String,Object> map=new HashMap<>();
        List<Customer> customers=customerService.selectByPage(page,size,name,addr,contacter,salename);
        map.put("customers",customers);
        Long count=customerService.PageCount(name,addr,contacter,salename);
        map.put("count",count);
        return RespMsg.ok("查询成功",map);
    }

    @RequestMapping(value = "/customer/{ids}",method = RequestMethod.DELETE)
    public RespMsg deleteCustomer(@PathVariable String ids){
        if(customerService.deleteByPrimaryKey(ids)){
            return RespMsg.ok("删除成功");
        }else{
            return RespMsg.error("删除失败");
        }

    }

}
