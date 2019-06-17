package com.bigeng.invoicing.controller.enterprise;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.enterprise.Department;
import com.bigeng.invoicing.service.enterprise.impl.DepartmentServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentServiceImpl departmentServiceImpl;

   //查找全部
    @GetMapping("/department")
    public RespMsg listAllDepartment(@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size)  {

        PageHelper.startPage(start,size);
        List<Department> listDepartment= departmentServiceImpl.findAll();
        PageInfo<Department> page = new PageInfo<>(listDepartment);
       /* return page;*/
        return RespMsg.ok("success!",page);

    }
    //删除
    @DeleteMapping("/department/{id}")
    public int deleteOne(@PathVariable("id")String cDid){
        int num = departmentServiceImpl.deleteOne(cDid);
        return num;
    }

    //查找一个
    @GetMapping("/department/{id}")
    public  String findOne(@PathVariable("id") String cDid){
        Department department=departmentServiceImpl.findOne(cDid);
        return  department.toString();
    }

    //添加
    @PostMapping("/department")
    public  boolean  addOne(@RequestBody Department department){
        boolean bool = departmentServiceImpl.addOne(department);
        return bool;
    }

    //更新
    @PutMapping("/department")
    public  int updateOne(@RequestBody Department department){
        int num = departmentServiceImpl.updateOne(department);
        return num;
    }
}
