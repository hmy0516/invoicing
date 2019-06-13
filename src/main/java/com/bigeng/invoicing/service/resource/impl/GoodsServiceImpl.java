package com.bigeng.invoicing.service.resource.impl;

import com.bigeng.invoicing.mapper.resource.GoodsMapper;
import com.bigeng.invoicing.pojo.resource.Goods;
import com.bigeng.invoicing.service.resource.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/11 21:19
 */
@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public boolean deleteByPrimaryKey(String cId) {
        String ids[]=cId.split(",");
        return goodsMapper.deleteByPrimaryKey(ids)==ids.length;
    }

    @Override
    public int insert(Goods record) {
        return goodsMapper.insert(record);
    }

    @Override
    public Goods selectByPrimaryKey(String cId) {
        return goodsMapper.selectByPrimaryKey(cId);
    }

    @Override
    public List<Goods> selectAll() {
        return goodsMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Goods record) {
        return goodsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Goods> selectByPage(Integer page, Integer size, String name,String brand,String comp,String classs) {
        int start=(page-1)*size;
        return goodsMapper.selectByPage(start,size,name,brand,comp,classs);
    }

    @Override
    public Long PageCount(String name,String brand,String comp,String classs) {
        return goodsMapper.getPageCount(name,brand,comp,classs);
    }
    
}
