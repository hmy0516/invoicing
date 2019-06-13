package com.bigeng.invoicing.mapper.resource;

import com.bigeng.invoicing.pojo.resource.Goodsclass;

import java.util.List;

public interface GoodsclassMapper {
    int deleteByPrimaryKey(String cClass);

    int insert(Goodsclass record);

    Goodsclass selectByPrimaryKey(String cClass);

    List<Goodsclass> selectAll();

    int updateByPrimaryKey(Goodsclass record);
}