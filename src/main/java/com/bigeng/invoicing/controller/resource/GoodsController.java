package com.bigeng.invoicing.controller.resource;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.resource.Goods;
import com.bigeng.invoicing.pojo.resource.Vendor_Goodsprice;
import com.bigeng.invoicing.service.resource.GoodsService;
import com.bigeng.invoicing.service.resource.Vendor_GoodspriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/11 21:30
 */
@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @Autowired
    private Vendor_GoodspriceService vendor_goodspriceService;

    @RequestMapping(value = "/goods",method = RequestMethod.POST)
    public RespMsg addGoods(@RequestBody Goods goods){
        if(goodsService.insert(goods)==1){
            return RespMsg.ok("添加成功");
        }
        else {
            return  RespMsg.error("添加失败");
        }
    }

    @RequestMapping(value = "/goods",method = RequestMethod.PUT)
    public RespMsg updateGoods(@RequestBody Goods goods){
        if(goodsService.updateByPrimaryKey(goods)==1){
            return  RespMsg.ok("更改成功");
        }
        else{
            return RespMsg.error("更改失败");
        }
    }

    @RequestMapping(value = "/goods",method = RequestMethod.GET)
    public RespMsg selectGoods(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            String name,String brand,String comp,String classs){
        Map<String,Object> map=new HashMap<>();
        List<Goods> goods=goodsService.selectByPage(page,size,name,brand,comp,classs);
        map.put("goods",goods);
        Long count=goodsService.PageCount(name,brand,comp,classs);
        map.put("count",count);
        return RespMsg.ok("查询成功",map);
    }

    @RequestMapping(value = "/goods/{ids}",method = RequestMethod.DELETE)
    public RespMsg deleteGoods(@PathVariable String ids){
        if(goodsService.deleteByPrimaryKey(ids)){
            return RespMsg.ok("删除成功");
        }else{
            return RespMsg.error("删除失败");
        }

    }

    @RequestMapping(value = "/sprice/{gid}/{ids}",method = RequestMethod.DELETE)
    public RespMsg deleteSprice(@PathVariable String gid,@PathVariable String ids){
        if(vendor_goodspriceService.deleteByPrimaryKey(gid,ids)){
            return RespMsg.ok("删除成功");
        }else{
            return RespMsg.error("删除失败");
        }

    }

    @RequestMapping(value = "/sprice",method = RequestMethod.PUT)
    public RespMsg updateSprice(@RequestBody Vendor_Goodsprice vendor_goodsprice){
        if(vendor_goodspriceService.updateByPrimaryKey(vendor_goodsprice)==1){
            return  RespMsg.ok("更改成功");
        }
        else{
            return RespMsg.error("更改失败");
        }
    }

    @RequestMapping(value = "/sprice",method = RequestMethod.POST)
    public RespMsg addSprice(@RequestBody Vendor_Goodsprice vendor_goodsprice){
        if(vendor_goodspriceService.insert(vendor_goodsprice)==1){
            return RespMsg.ok("添加成功");
        }
        else {
            return  RespMsg.error("添加失败");
        }
    }

    @RequestMapping(value = "/sprice",method = RequestMethod.GET)
    public RespMsg selectSprice(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            @RequestParam(defaultValue = "0") Integer sort, String cGid,@RequestParam(defaultValue = "0") Integer status, String vid){
        Map<String,Object> map=new HashMap<>();
        List<Vendor_Goodsprice> vendor_goodsprices=vendor_goodspriceService.selectByPrimaryKeyWithC_gid(page,size,sort,cGid,status,vid);
        map.put("vendor_goodsprices",vendor_goodsprices);
        Long count=vendor_goodspriceService.selectByPrimaryKeyWithC_GidCount(cGid,status,vid);
        map.put("count",count);
        return RespMsg.ok("查询成功",map);
    }
}
