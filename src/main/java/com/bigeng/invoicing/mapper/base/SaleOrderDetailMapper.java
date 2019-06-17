package com.bigeng.invoicing.mapper.base;

import com.bigeng.invoicing.pojo.base.SaleOrderDetail;
import com.bigeng.invoicing.pojo.base.SaleOrderDetailKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SaleOrderDetailMapper {
    int deleteByPrimaryKey(SaleOrderDetailKey key);

    int insert(SaleOrderDetail record);

    int insertSelective(SaleOrderDetail record);

    SaleOrderDetail selectByPrimaryKey(SaleOrderDetailKey key);

    SaleOrderDetail findOrderByNo(Long iNo);

    int updateByPrimaryKeySelective(SaleOrderDetail record);

    int updateByPrimaryKey(SaleOrderDetail record);
}