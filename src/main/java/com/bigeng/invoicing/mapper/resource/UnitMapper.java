package com.bigeng.invoicing.mapper.resource;

import com.bigeng.invoicing.pojo.resource.Unit;

import java.util.List;

public interface UnitMapper {
    int deleteByPrimaryKey(String cId);

    int insert(Unit record);

    Unit selectByPrimaryKey(String cId);

    List<Unit> selectAll();

    int updateByPrimaryKey(Unit record);
}