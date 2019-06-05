package com.bigeng.invoicing.controller.enterprise;

import com.bigeng.invoicing.mapper.enterprise.EmpMapper;
import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.service.enterprise.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/5 8:44
 */
@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping(value = "/add")
    public RespMsg addEmp(EmpMapper empMapper){
        System.err.println(empMapper);
        if(empService.add(empMapper)==1)
            return RespMsg.ok("添加成功");
        else
            return RespMsg.error("删除失败");
    }

    @RequestMapping(value = "/delete/{numbers}")
    public RespMsg deleteByNum(@PathVariable String numbers){
        if(empService.deleteByNum(numbers))
            return RespMsg.ok("删除成功");
        else
            return RespMsg.error("删除失败");
    }
}
