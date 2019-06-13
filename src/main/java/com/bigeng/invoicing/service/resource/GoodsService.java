package com.bigeng.invoicing.service.resource;

import com.bigeng.invoicing.pojo.resource.Goods;

import java.util.List;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/11 21:14
 */
public interface GoodsService {

    boolean deleteByPrimaryKey(String cId);

    int insert(Goods record);

    Goods selectByPrimaryKey(String cId);

    List<Goods> selectAll();

    int updateByPrimaryKey(Goods record);

    List<Goods> selectByPage( Integer page, Integer size, String name,String brand,String comp,String classs);

    Long PageCount(String name,String brand,String comp,String classs);
}
