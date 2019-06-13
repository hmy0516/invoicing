package com.bigeng.invoicing.controller.base;

import com.bigeng.invoicing.pojo.base.SaleOrder;
import com.bigeng.invoicing.pojo.base.SaleOrderKey;
import com.bigeng.invoicing.service.base.SaleorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SaleOrderController {

    @Autowired
    SaleorderService saleorderService;

    @RequestMapping(value = "/showOrder" ,method = RequestMethod.GET)
    public SaleOrder showOrder(@RequestBody SaleOrderKey key){
        return saleorderService.selectByPrimaryKey(key);
    }

    @RequestMapping(value = "/showAllOrder" ,method = RequestMethod.GET)
    public List<SaleOrder> showAllOrder(@RequestBody SaleOrderKey key){
        System.out.println(key);
        return saleorderService.showAllSale(key);
    }

    @RequestMapping(value = "/addOrder",method = RequestMethod.POST)
    public Integer insert(@RequestBody SaleOrder saleOrder,@RequestBody SaleOrderKey key){
        return saleorderService.insert(saleOrder);
    }

    @RequestMapping(value = "/updateOrder",method = RequestMethod.PUT)
    public Integer updateByPrimaryKeySelective(@RequestBody SaleOrder saleOrder){
        return saleorderService.updateByPrimaryKeySelective(saleOrder);
    }


}
