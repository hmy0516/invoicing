package com.bigeng.invoicing.controller.resource;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.resource.Unit;
import com.bigeng.invoicing.service.resource.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/11 16:15
 */
@RestController
public class UnitController {
    @Autowired
    private UnitService unitService;

    @RequestMapping(value = "/unit",method = RequestMethod.POST)
    public RespMsg addUnit(@RequestBody Unit unit){
        if(unitService.insert(unit)==1){
            return RespMsg.ok("添加成功");
        }
        else {
            return  RespMsg.error("添加失败");
        }
    }

    @RequestMapping(value = "/unit",method = RequestMethod.PUT)
    public RespMsg updateUnit(@RequestBody Unit unit){
        if(unitService.updateByPrimaryKey(unit)==1){
            return  RespMsg.ok("更改成功");
        }
        else{
            return RespMsg.error("更改失败");
        }
    }

    @RequestMapping(value = "/unit",method = RequestMethod.GET)
    public RespMsg selectUnit(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            String name){
        Map<String,Object> map=new HashMap<>();
        List<Unit> units=unitService.selectByPage(page,size,name);
        map.put("units",units);
        Long count=unitService.getPageCount(name);
        map.put("count",count);
        return RespMsg.ok("查询成功",map);
    }

    @RequestMapping(value = "/unit/{ids}",method = RequestMethod.DELETE)
    public RespMsg deleteUnit(@PathVariable String ids){
        if(unitService.deleteByPrimaryKey(ids)){
            return RespMsg.ok("删除成功");
        }else{
            return RespMsg.error("删除失败");
        }

    }
}
