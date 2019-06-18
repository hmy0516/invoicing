package com.bigeng.invoicing.controller.enterprise;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.enterprise.Employee;
import com.bigeng.invoicing.service.enterprise.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        if(empService.insert(employee)==1)
            return RespMsg.ok("添加成功");
        else
            return RespMsg.error("删除失败");
    }

    @RequestMapping(value = "/emp/{numbers}",method=RequestMethod.DELETE)
    public RespMsg deleteByNum(@PathVariable String numbers){
        if(empService.deleteByPrimaryKey(numbers))
            return RespMsg.ok("删除成功");
        else
            return RespMsg.error("删除失败");
    }

    @RequestMapping(value="/emp",method= RequestMethod.PUT)
    public RespMsg updateEmp(@RequestBody Employee employee){
        if(empService.updateByPrimaryKey(employee)==1)
            return  RespMsg.ok("更新成功");
        else
            return RespMsg.error("更新失败");
    }

    @RequestMapping(value="/emp",method=RequestMethod.GET)
    public RespMsg getEmpByPage(
            @RequestParam(defaultValue = "1")  Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            String number, String name, String sex,String lmmobile,String status
    ){
        Map<String,Object> map=new HashMap<>();
        List<Employee> employees=empService.selectByPage(page,size,number,name,sex,lmmobile,status);
        map.put("employees",employees);
        Long count=empService.PageCount(number,name,sex,lmmobile,status);
        map.put("count",count);
        return RespMsg.ok("查询成功",map);
    }

}
