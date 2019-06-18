package com.bigeng.invoicing.service.enterprise;

import com.bigeng.invoicing.pojo.enterprise.Duty;
import com.bigeng.invoicing.pojo.enterprise.DutyDto;

import java.util.List;

public interface DutyService {
    List<Duty> showAll(Integer start,Integer end);
    Integer getAllCount();
    List<Duty> findBy(DutyDto dto);
    void delById(String id);
    void updateDuty(Duty duty);
    void addDuty(Duty duty);
}
