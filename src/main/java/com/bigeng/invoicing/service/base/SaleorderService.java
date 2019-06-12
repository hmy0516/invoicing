package com.bigeng.invoicing.service.base;

import com.bigeng.invoicing.pojo.base.SaleOrder;
import com.bigeng.invoicing.pojo.base.SaleOrderKey;

public interface SaleorderService {
    SaleOrder showAllSale(SaleOrderKey key);
    Integer addSaleOrder(SaleOrder saleOrder);
}
