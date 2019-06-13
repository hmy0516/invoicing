package com.bigeng.invoicing.service.base;

import com.bigeng.invoicing.pojo.base.Purchorder;
import com.bigeng.invoicing.pojo.base.Purchorderdetail;

import java.util.List;

public interface PurchorderService {
    public  List<Purchorder> findAll();
    public  Purchorder findOne(Long i_pono);
    public  Boolean addOne(Purchorder purchorder);
    public  Boolean addPurchorderdetail(Purchorderdetail purchorderdetail);
    public  int deleteOne(Long i_pono);
    public  int deleteOnePurchorderdetail(Long i_pono,String c_gid);
    public  int deleteAllPurchorderdetail(Long i_pono);
    public  int updateOne(Purchorder purchorder);
    public  int updateStatus(Long i_pono,int i_status);
}

