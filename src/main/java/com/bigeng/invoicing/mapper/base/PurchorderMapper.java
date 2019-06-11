package com.bigeng.invoicing.mapper.base;

import com.bigeng.invoicing.pojo.base.Purchorder;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PurchorderMapper{

    List<Purchorder> findAll();

    @Insert("insert into t_lsc_purchorder(i_pono,c_uuid,dt_dt,dt_begin,dt_end,c_clerk,c_vendor,c_base,c_sale,c_check,dt_check,c_checkout,dt_checkout,c_invalid,dt_invalid,c_comment,i_bno,i_status,PurchorderdetailList values (#{i_pono},#{c_uuid},#{dt_dt},#{dt_begin},#{dt_end},#{c_clerk},#{c_vendor},#{c_base},#{c_sale},#{c_check},#{dt_check},#{c_checkout},#{dt_checkout},#{c_invalid},#{dt_invalid},#{c_comment},#{i_bno},#{i_status},#{PurchorderdetailList})")
    public Boolean addOne(Purchorder purchorder);

    @Delete(" delete from t_lsc_purchorder where i_pono= #{i_pono} ")
    public  int deleteOne(Long i_pono);

    @Select("select * from t_lsc_purchorder where i_pono = #{i_pono} ")
    public Purchorder findOne(Long i_pono);

    @Update("update t_lsc_purchorder set c_uuid=#{c_uuid},dt_dt=#{dt_dt},dt_begin=#{dt_begin},dt_end=#{dt_end},c_clerk=#{c_clerk},c_vendor=#{c_vendor},c_base=#{c_base},c_sale=#{c_sale},c_check=#{c_check},dt_check=#{dt_check},c_checkout=#{c_checkout},dt_checkout=#{dt_checkout},c_invalid=#{c_invalid},dt_invalid=#{dt_invalid},c_comment=#{c_comment},i_bno=#{i_bno},i_status=#{i_status},PurchorderdetailList=#{PurchorderdetailList} where i_pono= #{i_pono} ")
    public int updateOne(Purchorder purchorder);
}
