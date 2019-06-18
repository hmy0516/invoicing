package com.bigeng.invoicing.controller.enterprise;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.enterprise.Duty;
import com.bigeng.invoicing.pojo.enterprise.DutyDto;
import com.bigeng.invoicing.service.enterprise.DutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DutyController {

    @Autowired
    DutyService dutyService;

    //@GetMapping("/showAll/{page}/{count}")
    @GetMapping("/Duty")
    public RespMsg showAll(@RequestParam(value = "page", defaultValue = "1") Integer page,@RequestParam(value = "count", defaultValue = "5") Integer count){
        List<Duty> dutyList = dutyService.showAll(page, count);
        return RespMsg.ok("success!",dutyList);
    }

    @GetMapping("/DutyBy")
    public RespMsg findBy(@RequestBody DutyDto dto){
        List<Duty> dutyList = dutyService.findBy(dto);
        return RespMsg.ok("success!",dutyList);
    }

    //应该不需要删除职务
    @RequestMapping(value = ("/Duty/{id}"))
    public void delById(@PathVariable String id){
        dutyService.delById(id);
    }


    //@PutMapping("/updateDuty")
    @RequestMapping(value = "/Duty",method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public RespMsg updateDuty(@RequestBody Duty duty){
        dutyService.updateDuty(duty);
        return RespMsg.ok("success!");
    }

    @RequestMapping(value = "/Duty",method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public RespMsg addDuty(@RequestBody Duty duty){
        dutyService.addDuty(duty);
        return RespMsg.ok("success!");
    }

}
