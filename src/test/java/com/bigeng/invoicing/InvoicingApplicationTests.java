package com.bigeng.invoicing;

import com.bigeng.invoicing.mapper.enterprise.DutyMapper;
import com.bigeng.invoicing.pojo.enterprise.Duty;
import com.bigeng.invoicing.service.enterprise.DutyService;
import com.bigeng.invoicing.service.enterprise.impl.DutyServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoicingApplicationTests {
    DutyService dutyService = new DutyServiceImpl();
    @Test
    public void contextLoads() {
    }


}
