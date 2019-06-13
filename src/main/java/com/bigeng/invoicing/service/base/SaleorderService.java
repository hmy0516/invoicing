package com.bigeng.invoicing.service.base;

import com.bigeng.invoicing.pojo.base.SaleOrder;
import com.bigeng.invoicing.pojo.base.SaleOrderKey;

import java.util.List;

public interface SaleorderService {

    int insert(SaleOrder record);

    int insertSelective(SaleOrder record);

    SaleOrder selectByPrimaryKey(SaleOrderKey key);

    List<SaleOrder> showAllSale(SaleOrderKey key);

    int updateByPrimaryKeySelective(SaleOrder record);

    int updateByPrimaryKey(SaleOrder record);
}
