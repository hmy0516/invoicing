package com.bigeng.invoicing.service.enterprise.impl;

import com.bigeng.invoicing.mapper.enterprise.EmpMapper;
import com.bigeng.invoicing.service.enterprise.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/5 8:44
 */
@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public int add(EmpMapper empMapper) {
        return empMapper.add(empMapper);
    }

    @Override
    public boolean deleteByNum(String numbers) {
        String[] splits=numbers.split(",");
        return empMapper.deleteByNum(splits)==splits.length;
    }
}
