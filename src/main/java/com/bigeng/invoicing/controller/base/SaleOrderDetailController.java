package com.bigeng.invoicing.controller.base;

import com.bigeng.invoicing.pojo.base.SaleOrderDetail;
import com.bigeng.invoicing.pojo.base.SaleOrderDetailKey;
import com.bigeng.invoicing.service.base.SaleOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaleOrderDetailController {

    @Autowired
    SaleOrderDetailService detailService;

    @RequestMapping(value = "/showAllDetail")
    public SaleOrderDetail showAllOrderDetail(SaleOrderDetailKey key){
        return detailService.selectByPrimaryKey(key);
    }
}
