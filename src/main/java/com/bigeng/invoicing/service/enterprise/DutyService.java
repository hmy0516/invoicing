package com.bigeng.invoicing.service.enterprise;

import com.bigeng.invoicing.pojo.enterprise.Duty;

import java.util.List;

public interface DutyService {
    List<Duty> showAll(Integer start,Integer end);
    Integer getAllCount();
    void delById(String id);
    void updateDuty(Duty duty);
    void addDuty(Duty duty);
}
