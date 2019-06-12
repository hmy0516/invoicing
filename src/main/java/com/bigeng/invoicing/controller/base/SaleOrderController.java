package com.bigeng.invoicing.controller.base;

import com.bigeng.invoicing.pojo.base.SaleOrder;
import com.bigeng.invoicing.pojo.base.SaleOrderKey;
import com.bigeng.invoicing.service.base.SaleorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaleOrderController {

    @Autowired
    SaleorderService saleorderService;

    @PostMapping("/showAllOrder")
    public SaleOrder showAllOrder(@RequestBody SaleOrderKey key){
        return saleorderService.showAllSale(key);
    }
}
