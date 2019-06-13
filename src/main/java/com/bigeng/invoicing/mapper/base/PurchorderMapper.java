package com.bigeng.invoicing.mapper.base;

import com.bigeng.invoicing.pojo.base.Purchorder;
import com.bigeng.invoicing.pojo.base.Purchorderdetail;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PurchorderMapper{

    public List<Purchorder> findAll();

    public Purchorder findOne(Long i_pono);

    @Insert("insert into t_lsc_purchorder(c_uuid,i_pono,dt_dt,dt_begin,dt_end,c_clerk,c_vendor,c_base,c_sale,c_check,dt_check,c_checkout,dt_checkout,c_invalid,dt_invalid,c_comment,i_bno,i_status) values (#{c_uuid},#{i_pono},#{dt_dt},#{dt_begin},#{dt_end},#{c_clerk},#{c_vendor},#{c_base},#{c_sale},#{c_check},#{dt_check},#{c_checkout},#{dt_checkout},#{c_invalid},#{dt_invalid},#{c_comment},#{i_bno},#{i_status})")
    public Boolean addOne(Purchorder purchorder);

    @Insert("insert into t_lsc_purchorderdetail(i_pono,c_gid,f_pquant,c_unit,f_price,f_amount,c_comment) values (#{i_pono},#{c_gid},#{f_pquant},#{c_unit},#{f_price},#{f_amount},#{c_comment})")
    public Boolean addPurchorderdetail(Purchorderdetail purchorderdetail);

    @Update("update t_lsc_purchorder set c_uuid=#{c_uuid},dt_dt=#{dt_dt},dt_begin=#{dt_begin},dt_end=#{dt_end},c_clerk=#{c_clerk},c_vendor=#{c_vendor},c_base=#{c_base},c_sale=#{c_sale},c_check=#{c_check},dt_check=#{dt_check},c_checkout=#{c_checkout},dt_checkout=#{dt_checkout},c_invalid=#{c_invalid},dt_invalid=#{dt_invalid},c_comment=#{c_comment},i_bno=#{i_bno},i_status=#{i_status} where i_pono= #{i_pono} ")
    public int updateOne(Purchorder purchorder);

    @Update("update t_lsc_purchorder set i_status=#{i_status} where i_pono= #{i_pono} ")
    public int updateStatus(Long i_pono,int i_status);

    @Delete("delete from t_lsc_purchorderdetail where i_pono= #{i_pono} and c_gid=#{c_gid}")
    public  int deleteOnePurchorderdetail(Long i_pono,String c_gid);

    @Delete("delete from t_lsc_purchorderdetail where i_pono= #{i_pono} ")
    public  int deleteAllPurchorderdetail(Long i_pono);

    @Delete(" delete from t_lsc_purchorder where i_pono= #{i_pono} ")
    public  int deleteOne(Long i_pono);



}
