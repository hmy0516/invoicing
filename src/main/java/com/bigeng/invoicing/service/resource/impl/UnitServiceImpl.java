package com.bigeng.invoicing.service.resource.impl;

import com.bigeng.invoicing.mapper.resource.UnitMapper;
import com.bigeng.invoicing.pojo.resource.Unit;
import com.bigeng.invoicing.service.resource.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/11 15:51
 */
@Service
@Transactional
public class UnitServiceImpl implements UnitService {
    @Autowired
    private UnitMapper unitMapper;
    @Override
    public Boolean deleteByPrimaryKey(String cId) {
        String[] ids=cId.split(",");
        return unitMapper.deleteByPrimaryKey(ids)==ids.length;
    }

    @Override
    public int insert(Unit record) {
        return unitMapper.insert(record);
    }

    @Override
    public Unit selectByPrimaryKey(String cId) {
        return unitMapper.selectByPrimaryKey(cId);
    }

    @Override
    public List<Unit> selectAll() {
        return unitMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Unit record) {
        return unitMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Unit> selectByPage(Integer page, Integer size, String name) {
        int start=(page-1)*size;
        return unitMapper.selectByPage(start,size,name);
    }

    @Override
    public Long getPageCount(String name) {
        return unitMapper.getPageCount(name);
    }
}
