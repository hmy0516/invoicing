package com.bigeng.invoicing.service.enterprise.impl;

import com.bigeng.invoicing.mapper.enterprise.GroupinfoMapper;
import com.bigeng.invoicing.pojo.enterprise.Groupinfo;
import com.bigeng.invoicing.service.enterprise.GroupinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupinfoServiceImpl implements GroupinfoService {
    @Autowired
    GroupinfoMapper groupinfoMapper;
    @Override
    public List<Groupinfo> findAll() {
        return groupinfoMapper.findAll();
    }

    @Override
    public int deleteOne(String c_groupname) {
        return groupinfoMapper.deleteOne(c_groupname);
    }

    @Override
    public Groupinfo findOne(String c_groupname) {
        return groupinfoMapper.findOne(c_groupname);
    }

    @Override
    public Boolean addOne(Groupinfo groupinfo) {
        return groupinfoMapper.addOne(groupinfo);
    }

    @Override
    public int updateOne(Groupinfo groupinfo) {
        return groupinfoMapper.updateOne(groupinfo);
    }
}
