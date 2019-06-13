package com.bigeng.invoicing.controller.base;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.base.Purchorder;
import com.bigeng.invoicing.pojo.base.PurchorderParam;
import com.bigeng.invoicing.pojo.base.Purchorderdetail;
import com.bigeng.invoicing.service.base.PurchorderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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

    @GetMapping("/purchorder/{i_pono}")
    public Purchorder findOne(@PathVariable("i_pono")Long i_pono){
        Purchorder purchorder=purchorderService.findOne(i_pono);
        return purchorder;
    }

    @PostMapping("/purchorder")
    public Boolean addPurchorder(@RequestBody Purchorder purchorder){
        purchorderService.addOne(purchorder);
        for(Purchorderdetail purchorderdetail: purchorder.getPurchorderdetailList()){
            Boolean boolTemp = purchorderService.addPurchorderdetail(purchorderdetail);
            if(boolTemp==false)
                return false;
        }
        return true;
    }

    @DeleteMapping("/purchorder/{i_pono}")
    public int deleteOne(@PathVariable("i_pono") Long i_pono){
        int temp1=purchorderService.deleteOne(i_pono);
        int temp2=purchorderService.deleteAllPurchorderdetail(i_pono);
        if(temp1==0||temp2==0)
            return 0;
        else
            return temp1+temp2;
    }

    @DeleteMapping("/purchorder")
    public  int deletePurchorderdetail(@RequestBody PurchorderParam purchorderParam){
        int temp=purchorderService.deleteOnePurchorderdetail(purchorderParam.getI_pono(),purchorderParam.getC_gid());
        return temp;
    }

    @PutMapping("/purchorder")
    public int updateOne(@RequestBody Purchorder purchorder){
        int temp = purchorderService.updateOne(purchorder);
        return temp;
    }
}
