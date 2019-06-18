package com.bigeng.invoicing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoicingApplicationTests {

    @Test
    public void contextLoads() {
        //System.out.println(getUUID().substring(0,10)+":getUUID");
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
        /*String[] retArray = new String[10];
        for(int i=0;i<10;i++){

            retArray[i] = getUUID();
        }
        System.out.println("uuid:"+retArray);*/
    }

    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        //去掉“-”符号
        System.out.println(uuid+":UUID");
        return uuid.replaceAll("-", "");
    }

}
