package com.bigeng.invoicing.mapper.resource;

import com.bigeng.invoicing.pojo.resource.Goods;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(String cId);

    int insert(Goods record);

    Goods selectByPrimaryKey(String cId);

    List<Goods> selectAll();

    int updateByPrimaryKey(Goods record);
}