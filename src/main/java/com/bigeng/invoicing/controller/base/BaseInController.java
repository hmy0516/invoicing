package com.bigeng.invoicing.controller.base;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.base.BaseIn;
import com.bigeng.invoicing.pojo.base.BaseInDetail;
import com.bigeng.invoicing.service.base.BaseInService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class BaseInController {
    @Autowired
    BaseInService baseInService;
    @PostMapping("/baseIn")
    public Boolean addBaseIn(@RequestBody BaseIn baseIn){
        Boolean  bool1,bool2;
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        baseIn.setC_uuid(uuid);
        bool1 = baseInService.addBaseIn(baseIn);
        if (bool1==false)
            return  false;
        for(BaseInDetail baseInDetail: baseIn.getBaseInDetail()) {
            bool2 = baseInService.addBaseInDetail(baseInDetail);
            if (bool2==false)
                return  false;
        }
        return true;
    }

    @GetMapping("/baseIn")
    public RespMsg findAllBaseIn(@RequestParam(value = "start",defaultValue = "0")int start,@RequestParam(value = "size",defaultValue = "5")int size){
        PageHelper.startPage(start, size);
        List<BaseIn> listBaseIn = baseInService.findAllBaseIn();
        PageInfo<BaseIn> page = new PageInfo<>(listBaseIn);
        return RespMsg.ok("Select Successfully!",page);
    }

    @GetMapping("/baseIn/{c_uuid}")
    public  BaseIn findOneBaseIn(@PathVariable("c_uuid") String c_uuid){
        BaseIn baseIn = baseInService.findOneBaseIn(c_uuid);
        return  baseIn;

    }
}
