package com.bigeng.invoicing.controller.base;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.base.Purchorder;
import com.bigeng.invoicing.service.base.PurchorderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class PurchorderController {
    @Autowired
    PurchorderService purchorderService;

    @GetMapping("/purchorder")
    public RespMsg listAllPurchorder(@RequestParam(value = "start",defaultValue="0") int start,@RequestParam(value = "size",defaultValue = "5") int size) {
        PageHelper.startPage(start,size);
        List<Purchorder> listAllPurchorder = purchorderService.findAll();
        PageInfo<Purchorder> page = new PageInfo<>(listAllPurchorder);
        return RespMsg.ok("Select Successfully!",page);
    }
}
