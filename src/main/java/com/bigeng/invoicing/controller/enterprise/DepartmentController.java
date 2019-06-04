package com.bigeng.invoicing.controller.enterprise;

import com.bigeng.invoicing.pojo.RespMsg;
import com.bigeng.invoicing.pojo.enterprise.Department;
import com.bigeng.invoicing.service.enterprise.DepartmentService;
import com.bigeng.invoicing.service.enterprise.impl.DepartmentServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentServiceImpl departmentServiceImpl;


   /* @RequestMapping("/getAllDepartment")
    public List<Department> getAllDepartment(){
        List<Department> listDepartment = departmentServiceImpl.findAll();
        return  listDepartment;
    }*/
   //查找全部
    @RequestMapping("/listAllDepartment")
    public PageInfo<Department> listAllDepartment(@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size)  {
        PageHelper.startPage(start,size);
        List<Department> listDepartment= departmentServiceImpl.findAll();
        PageInfo<Department> page = new PageInfo<>(listDepartment);
        return page;
        //return RespMsg.ok("success!","ppp");

    }
    //删除
    @RequestMapping("/deleteOne")
    public int deleteOne(String cDid){
        int num = departmentServiceImpl.deleteOne(cDid);
        System.out.println(num);
        return num;
    }

    //查找一个
    @RequestMapping("/findOne/{id}")
    public  String findOne(@PathVariable("id") String cDid){
        Department department=departmentServiceImpl.findOne(cDid);
        return  department.toString();
    }

    //添加
    @RequestMapping("/addOne")
    public  boolean  addOne(Department department){
        boolean bool = departmentServiceImpl.addOne(department);
        return bool;
    }

    //更新
    @RequestMapping("/updateOne")
    public  int updateOne(Department department){
        int num = departmentServiceImpl.updateOne(department);
        return num;
    }
}
