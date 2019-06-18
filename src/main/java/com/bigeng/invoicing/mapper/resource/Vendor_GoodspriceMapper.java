package com.bigeng.invoicing.mapper.resource;

import com.bigeng.invoicing.pojo.resource.Vendor_Goodsprice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Vendor_GoodspriceMapper {
    int deleteByPrimaryKey(@Param("cGid") String cGid, @Param("cids") String[] cId);

    int insert(Vendor_Goodsprice record);

    Vendor_Goodsprice selectByPrimaryKey(@Param("cGid") String cGid, @Param("cVid") String cVid);

    List<Vendor_Goodsprice> selectAll();

    int updateByPrimaryKey(Vendor_Goodsprice record);

    List<Vendor_Goodsprice> selectByPrimaryKeyWithC_gid(@Param("start") Integer start,@Param("size") Integer size, @Param("sort") Integer sort,
                                                  @Param("cGid") String cGid,@Param("status") Integer status, @Param("vid") String vid );
    Long  selectByPrimaryKeyWithC_GidCount(@Param("cGid") String cGid,@Param("status") Integer status, @Param("vid") String vid);

}