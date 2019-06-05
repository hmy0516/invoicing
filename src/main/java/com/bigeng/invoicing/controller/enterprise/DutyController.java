package com.bigeng.invoicing.controller.enterprise;

import com.bigeng.invoicing.pojo.enterprise.Duty;
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
    @RequestMapping(value = "/showAll/{page}/{count}",method = RequestMethod.GET)
    public List<Duty> showAll(@PathVariable Integer page,@PathVariable Integer count){
        return dutyService.showAll(page,count);
    }

    @RequestMapping(value = "/getCount",method = RequestMethod.GET)
    public Integer getPageCount(){
        return dutyService.getAllCount();
    }

    //应该不需要删除职务
    @RequestMapping(value = ("/del/{id}"))
    public void delById(@PathVariable String id){
        dutyService.delById(id);
    }


    //@PutMapping("/updateDuty")
    @RequestMapping(value = "/updateDuty",method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public void updateDuty(@RequestBody Duty duty){
        dutyService.updateDuty(duty);
    }

    @RequestMapping(value = "/addDuty",method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public void addDuty(@RequestBody Duty duty){
        System.out.println(duty);
        dutyService.addDuty(duty);
    }

}
