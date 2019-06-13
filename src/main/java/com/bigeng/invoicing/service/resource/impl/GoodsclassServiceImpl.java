package com.bigeng.invoicing.service.resource.impl;

import com.bigeng.invoicing.mapper.resource.GoodsclassMapper;
import com.bigeng.invoicing.pojo.resource.Goodsclass;
import com.bigeng.invoicing.service.resource.GoodsclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/11 17:16
 */
@Service
@Transactional
public class GoodsclassServiceImpl implements GoodsclassService {

    @Autowired
    private GoodsclassMapper goodsclassMapper;
    @Override
    public Boolean deleteByPrimaryKey(String cId) {
        String[] ids=cId.split(",");
        return goodsclassMapper.deleteByPrimaryKey(ids)==ids.length;
    }

    @Override
    public int insert(Goodsclass record) {
        return goodsclassMapper.insert(record);
    }

    @Override
    public Goodsclass selectByPrimaryKey(String cId) {
        return goodsclassMapper.selectByPrimaryKey(cId);
    }

    @Override
    public List<Goodsclass> selectAll() {
        return goodsclassMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Goodsclass record) {
        return goodsclassMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Goodsclass> selectByPage(Integer page, Integer size, String name) {
        int start=(page-1)*size;
        return goodsclassMapper.selectByPage(start,size,name);
    }

    @Override
    public Long getPageCount(String name) {
        return goodsclassMapper.getPageCount(name);
    }
}
