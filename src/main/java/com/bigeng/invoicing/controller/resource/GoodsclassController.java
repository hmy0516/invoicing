package com.bigeng.invoicing.controller.resource;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.resource.Goodsclass;
import com.bigeng.invoicing.service.resource.GoodsclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/11 17:27
 */
@RestController
public class GoodsclassController {
    @Autowired
    private GoodsclassService goodsclassService;
    @RequestMapping(value = "/goodsclass",method = RequestMethod.POST)
    public RespMsg addGoodsclass(@RequestBody Goodsclass goodsclass){
        if(goodsclassService.insert(goodsclass)==1){
            return RespMsg.ok("添加成功");
        }
        else {
            return  RespMsg.error("添加失败");
        }
    }

    @RequestMapping(value = "/goodsclass",method = RequestMethod.PUT)
    public RespMsg updateGoodsclass(@RequestBody Goodsclass goodsclass){
        if(goodsclassService.updateByPrimaryKey(goodsclass)==1){
            return  RespMsg.ok("更改成功");
        }
        else{
            return RespMsg.error("更改失败");
        }
    }

    @RequestMapping(value = "/goodsclass",method = RequestMethod.GET)
    public RespMsg selectGoodsclass(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            String name){
        Map<String,Object> map=new HashMap<>();
        List<Goodsclass> goodsclasss=goodsclassService.selectByPage(page,size,name);
        map.put("goodsclasss",goodsclasss);
        Long count=goodsclassService.getPageCount(name);
        map.put("count",count);
        return RespMsg.ok("查询成功",map);
    }

    @RequestMapping(value = "/goodsclass/{ids}",method = RequestMethod.DELETE)
    public RespMsg deleteGoodsclass(@PathVariable String ids){
        if(goodsclassService.deleteByPrimaryKey(ids)){
            return RespMsg.ok("删除成功");
        }else{
            return RespMsg.error("删除失败");
        }

    }
}
