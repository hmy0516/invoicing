package com.bigeng.invoicing.service.enterprise.impl;

import com.bigeng.invoicing.mapper.enterprise.DutyMapper;
import com.bigeng.invoicing.pojo.enterprise.Duty;
import com.bigeng.invoicing.pojo.enterprise.DutyDto;
import com.bigeng.invoicing.service.enterprise.DutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DutyServiceImpl implements DutyService {

    @Autowired
    DutyMapper dutyMapper;

    @Override
    public List<Duty> showAll(Integer page,Integer aPageCount) {
        Integer start=(page-1)*aPageCount;
        //Integer allCount = dutyMapper.getAllCount();

        return dutyMapper.showAll(start,aPageCount);
    }

    @Override
    public Integer getAllCount() {
        return dutyMapper.getAllCount();
    }

    @Override
    public List<Duty> findBy(DutyDto dto) {
        System.out.println("ser"+dto.getcId());
        System.out.println("ser"+dto.getcDuty());
        return dutyMapper.findBy(dto);
    }

    @Override
    public void delById(String id) {
        dutyMapper.delById(id);
    }


    @Override
    public void updateDuty(Duty duty) {
        dutyMapper.updateDuty(duty);
    }

    @Override
    public void addDuty(Duty duty) {
        dutyMapper.addDuty(duty);
    }
}
