package com.bigeng.invoicing.controller.base;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.base.SaleOrder;
import com.bigeng.invoicing.pojo.base.SaleOrderKey;
import com.bigeng.invoicing.service.base.SaleorderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SaleOrderController {

    @Autowired
    SaleorderService saleorderService;

    @RequestMapping(value = "/sale/order" ,method = RequestMethod.GET)
    public RespMsg showAllOrder(@RequestBody SaleOrderKey key, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "5") int pageSize ){
        PageHelper.startPage(pageNum,pageSize);
        List<SaleOrder> orderList = saleorderService.showAllSale(key);
        PageInfo<SaleOrder> page = new PageInfo<>(orderList);
        return RespMsg.ok("success!",page);
    }

    @RequestMapping(value = "/SaleOrder",method = RequestMethod.POST)
    public RespMsg insert(@RequestBody SaleOrder saleOrder,@RequestBody SaleOrderKey key){
        saleorderService.insert(saleOrder);
        return RespMsg.ok("success!");
    }

    @RequestMapping(value = "/updateOrder",method = RequestMethod.PUT)
    public RespMsg updateByPrimaryKeySelective(@RequestBody SaleOrder saleOrder){
         saleorderService.updateByPrimaryKeySelective(saleOrder);
        return RespMsg.ok("success!");
    }


}
