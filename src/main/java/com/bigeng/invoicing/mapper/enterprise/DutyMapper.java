package com.bigeng.invoicing.mapper.enterprise;

import com.bigeng.invoicing.pojo.enterprise.Duty;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DutyMapper {
    List<Duty> showAll(@Param("start")Integer start, @Param("count")Integer count);
    Integer getAllCount();
    void delById(@Param("id")String id);
    void updateDuty(@Param("duty")Duty duty);
    void addDuty(@Param("duty")Duty duty);
}
