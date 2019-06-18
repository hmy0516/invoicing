package com.bigeng.invoicing.mapper.base;

import com.bigeng.invoicing.pojo.base.SaleOrderDetail;
import com.bigeng.invoicing.pojo.base.SaleOrderDetailKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SaleOrderDetailMapper {
    int deleteByPrimaryKey(SaleOrderDetailKey key);

    int insert(SaleOrderDetail record);

    int insertSelective(SaleOrderDetail record);

    int insertBatch(List<SaleOrderDetail> list);

    SaleOrderDetail selectByPrimaryKey(SaleOrderDetailKey key);

    SaleOrderDetail findOrderByNo(Long iNo);

    int updateByPrimaryKeySelective(SaleOrderDetail record);

    int updateByPrimaryKey(SaleOrderDetail record);
}