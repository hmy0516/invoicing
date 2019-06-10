package com.bigeng.invoicing.controller.enterprise;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.enterprise.Groupinfo;
import com.bigeng.invoicing.service.enterprise.GroupinfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GroupinfoController {
    @Autowired
    GroupinfoService groupinfoService;

    //查全部
    @GetMapping("/groupinfo")
    public RespMsg listAllGroupinfo(@RequestParam(value = "start",defaultValue = "0") int start , @RequestParam(value = "size",defaultValue = "5" ) int size) {
        PageHelper.startPage(start,size);
        List<Groupinfo> listGroupinfo = groupinfoService.findAll();
        PageInfo<Groupinfo> page = new PageInfo<>(listGroupinfo);
        return RespMsg.error("Select Successfuly!",page);
    }

    //删除
    @DeleteMapping("/groupinfo/{c_groupname}")
    public  int deleteOne(@PathVariable("c_groupname") String c_groupname){
        return  groupinfoService.deleteOne(c_groupname);
    }

    //单个查找
    @GetMapping("/groupinfo/{c_groupname}")
    public String findOne(@PathVariable("c_groupname")String c_groupname){
        Groupinfo groupinfo = groupinfoService.findOne(c_groupname);
        return groupinfo.toString();
    }

    //添加
    @PostMapping("/groupinfo")
    public  Boolean addOne(@RequestBody Groupinfo groupinfo){
        return groupinfoService.addOne(groupinfo);
    }

    //更新
    @PutMapping("/groupinfo")
    public  int updateOne(@RequestBody Groupinfo groupinfo){

        return groupinfoService.updateOne(groupinfo);
    }
}
