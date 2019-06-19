package com.bigeng.invoicing.mapper.base;

import com.bigeng.invoicing.pojo.base.SaleOrder;
import com.bigeng.invoicing.pojo.base.SaleOrderKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface SaleOrderMapper {
    int deleteByPrimaryKey(SaleOrderKey key);

    int insert(SaleOrder record);

    int insertSelective(SaleOrder record);

    SaleOrder selectByPrimaryKey(SaleOrderKey key);

    Long findMaxDate();

    List<SaleOrder> selectByKey();

    int updateByPrimaryKeySelective(SaleOrder record);

    int updateByPrimaryKey(SaleOrder record);
}