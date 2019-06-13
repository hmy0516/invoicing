package com.bigeng.invoicing.mapper.resource;

import com.bigeng.invoicing.pojo.resource.Unit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UnitMapper {
    int deleteByPrimaryKey(@Param("cids") String[] cId);

    int insert(Unit record);

    Unit selectByPrimaryKey(String cId);

    List<Unit> selectAll();

    int updateByPrimaryKey(Unit record);

    List<Unit> selectByPage(@Param("start") Integer start,@Param("size") Integer size,@Param("name") String name);

    Long getPageCount(@Param("name") String name);
}