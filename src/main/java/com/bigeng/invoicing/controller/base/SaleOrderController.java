package com.bigeng.invoicing.controller.base;

import com.alibaba.fastjson.JSON;
import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.base.SaleOrder;
import com.bigeng.invoicing.pojo.base.SaleOrderKey;
import com.bigeng.invoicing.service.base.SaleOrderDetailService;
import com.bigeng.invoicing.service.base.SaleorderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class SaleOrderController {

    @Autowired
    SaleorderService saleorderService;

    @Autowired
    SaleOrderDetailService detailService;

    @RequestMapping(value = "/sale/order" ,method = RequestMethod.GET)
    public RespMsg showAllOrder(@RequestBody SaleOrderKey key, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "5") int pageSize ){
        PageHelper.startPage(pageNum,pageSize);
        List<SaleOrder> orderList = saleorderService.showAllSale(key);
        PageInfo<SaleOrder> page = new PageInfo<>(orderList);
        return RespMsg.ok("success!",page);
    }

    @RequestMapping(value = "SaleOrderNo" ,method = RequestMethod.GET)
    public RespMsg findMaxCNo(){
        Long maxDate = saleorderService.findMaxDate();
        if(maxDate==null){
            Calendar cal= Calendar.getInstance();
            int y=cal.get(Calendar.YEAR);
            int m=cal.get(Calendar.MONTH)+1;
            int d=cal.get(Calendar.DATE);
            String mo="";
            if(m<10){
                mo="0"+m;
            }
            String dtDt=y+""+mo+""+d+""+1001;
            return RespMsg.ok("success",dtDt);
        }
        maxDate++;
        return RespMsg.ok("success",maxDate);
    }

    @RequestMapping(value = "/SaleOrder",method = RequestMethod.POST)
    public RespMsg insert(@RequestBody SaleOrder saleOrder){
        System.out.println(saleOrder.toString());
        saleorderService.insert(saleOrder);
        detailService.insertBatch(saleOrder.getDetailList());
        return RespMsg.ok("success!");
    }

    /*@RequestMapping(value = "/SaleOrder",method = RequestMethod.POST)
    public RespMsg insert(@RequestBody Map<String, Object> models){
        System.out.println(models.get("saleOrder"));
        SaleOrder saleOrder= JSON.parseObject(JSON.toJSONString(models.get("saleOrder")), SaleOrder.class);
        System.out.println(JSON.parseObject(JSON.toJSONString(models.get("saleOrder")), SaleOrder.class));
        saleorderService.insert(saleOrder);
        *//*detailService.insertBatch(saleOrder.getDetailList());*//*
        return RespMsg.ok("success!");
    }*/

    @RequestMapping(value = "/updateOrder",method = RequestMethod.PUT)
    public RespMsg updateByPrimaryKeySelective(@RequestBody SaleOrder saleOrder){
         saleorderService.updateByPrimaryKeySelective(saleOrder);
        return RespMsg.ok("success!");
    }


}
