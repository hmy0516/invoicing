package com.bigeng.invoicing.mapper.enterprise;

import com.bigeng.invoicing.pojo.enterprise.Groupinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GroupinfoMapper {

    @Select("select * from t_sys_groupinfo ")
    List<Groupinfo> findAll();

    @Insert(" insert into t_sys_groupinfo(c_groupname,c_alias,c_addr,c_coordinates,c_logo,c_city,ts_ctime ) values (#{c_groupname},#{c_alias},#{c_addr},#{c_coordinates},#{c_logo},#{c_city},#{ts_ctime})")
    public Boolean addOne(Groupinfo groupinfo);

    @Delete(" delete from t_sys_groupinfo where c_groupname= #{c_groupname} ")
    public  int deleteOne(String name);

    @Select("select * from t_sys_groupinfo where c_groupname = #{c_groupname} ")
    public Groupinfo findOne(String c_groupname);

    @Update("update t_sys_groupinfo set c_alias=#{c_alias},c_addr=#{c_addr},c_coordinates=#{c_coordinates},c_logo=#{c_logo},c_city=#{c_city},ts_ctime=#{ts_ctime} where c_groupname= #{c_groupname} ")
    public int updateOne(Groupinfo groupinfo);



}
