package com.bigeng.invoicing.service.base;

import com.bigeng.invoicing.pojo.base.SaleOrderDetail;
import com.bigeng.invoicing.pojo.base.SaleOrderDetailKey;

import java.util.List;

public interface SaleOrderDetailService {
    int deleteByPrimaryKey(SaleOrderDetailKey key);

    int insert(SaleOrderDetail record);

    int insertBatch(List<SaleOrderDetail> list);

    int insertSelective(SaleOrderDetail record);

    SaleOrderDetail selectByPrimaryKey(SaleOrderDetailKey key);

    SaleOrderDetail findOrderByNo(Long iNo);

    int updateByPrimaryKeySelective(SaleOrderDetail record);

    int updateByPrimaryKey(SaleOrderDetail record);
}
