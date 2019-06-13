package com.bigeng.invoicing.service.base;

import com.bigeng.invoicing.pojo.base.SaleOrderDetail;
import com.bigeng.invoicing.pojo.base.SaleOrderDetailKey;

public interface SaleOrderDetailService {
    int deleteByPrimaryKey(SaleOrderDetailKey key);

    int insert(SaleOrderDetail record);

    int insertSelective(SaleOrderDetail record);

    SaleOrderDetail selectByPrimaryKey(SaleOrderDetailKey key);

    SaleOrderDetail findOrderByNo(Integer iNo);

    int updateByPrimaryKeySelective(SaleOrderDetail record);

    int updateByPrimaryKey(SaleOrderDetail record);
}
