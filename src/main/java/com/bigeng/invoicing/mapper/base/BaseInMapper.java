package com.bigeng.invoicing.mapper.base;

import com.bigeng.invoicing.pojo.base.BaseIn;
import com.bigeng.invoicing.pojo.base.BaseInDetail;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseInMapper {
    @Insert("insert into t_lsc_basein(c_uuid,i_no,dt_dt,c_baseid,c_vendor,i_pno,c_check,dt_check,c_checkout,dt_checkout,c_recheck,dt_recheck,dt_inv,c_inv,i_invtype,c_invno,c_payment,c_voucher,c_comment,i_status) values (#{c_uuid},#{i_no},#{dt_dt},#{c_baseid},#{c_vendor},#{i_pno},#{c_check},#{dt_check},#{c_checkout},#{dt_checkout},#{c_recheck},#{dt_recheck},#{dt_inv},#{c_inv},#{i_invtype},#{c_invno},#{c_payment},#{c_voucher},#{c_comment},#{i_status})")
    public Boolean addBaseIn(BaseIn baseIn);
    @Insert("insert into t_lsc_baseindetail(i_no,c_gid,c_bunit,f_price,f_amount,c_comment,dt_dt) values(#{i_no},#{c_gid},#{c_bunit},#{f_price},#{f_amount},#{c_comment},#{dt_dt})")
    public Boolean addBaseInDetail(BaseInDetail baseInDetail);
    public List<BaseIn> findAllBaseIn();
    public BaseIn findOneBaseIn(String c_uuid);
}
