package com.bigeng.invoicing.mapper.resource;

import com.bigeng.invoicing.pojo.resource.Goodsclass;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsclassMapper {
    int deleteByPrimaryKey(@Param("cids") String[] cId);

    int insert(Goodsclass record);

    Goodsclass selectByPrimaryKey(String cClass);

    List<Goodsclass> selectAll();

    int updateByPrimaryKey(Goodsclass record);

    List<Goodsclass> selectByPage(@Param("start") Integer start, @Param("size") Integer size, @Param("name") String name);

    Long getPageCount(@Param("name") String name);
}