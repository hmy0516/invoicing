package com.bigeng.invoicing.service.enterprise;

import com.bigeng.invoicing.mapper.enterprise.EmpMapper;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/5 8:43
 */
public interface EmpService {
    boolean deleteByNum(String numbers);

    int add(EmpMapper empMapper);
}
