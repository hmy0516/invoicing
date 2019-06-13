package com.bigeng.invoicing.controller.resource;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.resource.Goods;
import com.bigeng.invoicing.service.resource.GoodsService;
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
        List<Goods> goodss=goodsService.selectByPage(page,size,name,brand,comp,classs);
        map.put("goodss",goodss);
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
}
