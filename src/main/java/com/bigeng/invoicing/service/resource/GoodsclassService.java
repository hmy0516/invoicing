package com.bigeng.invoicing.service.resource;

import com.bigeng.invoicing.pojo.resource.Goodsclass;

import java.util.List;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/11 17:13
 */
public interface GoodsclassService {
    Boolean deleteByPrimaryKey(String cId);

    int insert(Goodsclass record);

    Goodsclass selectByPrimaryKey(String cId);

    List<Goodsclass> selectAll();

    int updateByPrimaryKey(Goodsclass record);

    List<Goodsclass> selectByPage( Integer page, Integer size, String name);

    Long getPageCount(String name);
}
