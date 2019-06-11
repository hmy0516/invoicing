package com.bigeng.invoicing.service.resource;

import com.bigeng.invoicing.pojo.resource.Unit;

import java.util.List;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/11 14:52
 */
public interface UnitService {
    Boolean deleteByPrimaryKey(String cId);

    int insert(Unit record);

    Unit selectByPrimaryKey(String cId);

    List<Unit> selectAll();

    int updateByPrimaryKey(Unit record);

    List<Unit> selectByPage( Integer page, Integer size, String name);

    Long getPageCount(String name);
}
