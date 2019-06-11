package com.bigeng.invoicing.controller.resource;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.resource.Vendor;
import com.bigeng.invoicing.service.resource.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/11 19:37
 */
@RestController
public class VendorController {
    @Autowired
    private VendorService vendorService;

    @RequestMapping(value = "/vendor",method = RequestMethod.POST)
    public RespMsg addVendor(@RequestBody Vendor vendor){
        if(vendorService.insert(vendor)==1){
            return RespMsg.ok("添加成功");
        }
        else {
            return  RespMsg.error("添加失败");
        }
    }

    @RequestMapping(value = "/vendor",method = RequestMethod.PUT)
    public RespMsg updateVendor(@RequestBody Vendor vendor){
        if(vendorService.updateByPrimaryKey(vendor)==1){
            return  RespMsg.ok("更改成功");
        }
        else{
            return RespMsg.error("更改失败");
        }
    }

    @RequestMapping(value = "/vendor",method = RequestMethod.GET)
    public RespMsg selectVendor(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            String name,String addr,String contacter,String salename){
        Map<String,Object> map=new HashMap<>();
        List<Vendor> vendors=vendorService.selectByPage(page,size,name,addr,contacter,salename);
        map.put("vendors",vendors);
        Long count=vendorService.PageCount(name,addr,contacter,salename);
        map.put("count",count);
        return RespMsg.ok("查询成功",map);
    }

    @RequestMapping(value = "/vendor/{ids}",method = RequestMethod.DELETE)
    public RespMsg deleteVendor(@PathVariable String ids){
        if(vendorService.deleteByPrimaryKey(ids)){
            return RespMsg.ok("删除成功");
        }else{
            return RespMsg.error("删除失败");
        }

    }
}
