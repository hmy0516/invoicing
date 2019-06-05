package com.bigeng.invoicing.controller.enterprise;

import com.bigeng.invoicing.mapper.enterprise.EmpMapper;
import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.enterprise.Employee;
import com.bigeng.invoicing.service.enterprise.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/5 8:44
 */
@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping(value = "/emp",method = RequestMethod.POST)
    public RespMsg addEmp(@RequestBody Employee employee){
        if(empService.add(employee)==1)
            return RespMsg.ok("添加成功");
        else
            return RespMsg.error("删除失败");
    }

    @RequestMapping(value = "/emp/{numbers}",method=RequestMethod.DELETE)
    public RespMsg deleteByNum(@PathVariable String numbers){
        if(empService.deleteByNum(numbers))
            return RespMsg.ok("删除成功");
        else
            return RespMsg.error("删除失败");
    }

    @RequestMapping(value="/emp",method= RequestMethod.PUT)
    public RespMsg updateEmp(@RequestBody Employee employee){
        if(empService.updateEmp(employee)==1)
            return  RespMsg.ok("更新成功");
        else
            return RespMsg.error("更新失败");
    }

}
