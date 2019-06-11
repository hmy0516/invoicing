package com.bigeng.invoicing.mapper.resource;

import com.bigeng.invoicing.pojo.resource.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsMapper {
    
    int deleteByPrimaryKey(@Param("cids") String[] cId);

    int insert(Goods record);

    Goods selectByPrimaryKey(String cId);

    List<Goods> selectAll();

    int updateByPrimaryKey(Goods record);

    List<Goods> selectByPage(@Param("start") Integer start,@Param("size") Integer size,@Param("name") String name,@Param("brand") String brand,@Param("comp") String comp,@Param("classs") String classs);

    Long getPageCount(@Param("name") String name,@Param("brand") String brand,@Param("comp") String comp,@Param("classs") String classs);
}