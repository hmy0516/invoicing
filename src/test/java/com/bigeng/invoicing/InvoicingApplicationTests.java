package com.bigeng.invoicing;

import com.bigeng.invoicing.controller.enterprise.DepartmentController;
import com.bigeng.invoicing.pojo.enterprise.Department;
import com.bigeng.invoicing.service.enterprise.DepartmentService;
import com.bigeng.invoicing.service.enterprise.impl.DepartmentServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoicingApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Test
    public void dataTest(){
//        DepartmentController dc=new DepartmentController();
//        PageInfo<Department> page=dc.listAllDepartment(0,5);
        DepartmentServiceImpl departmentService = new DepartmentServiceImpl();
        /*List<Department> all = departmentService.findAll();
        System.out.println(all);*/
       int mark= departmentService.deleteOne("d003");
        System.out.println(mark);
    }
}
