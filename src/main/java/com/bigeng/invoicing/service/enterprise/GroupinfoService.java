package com.bigeng.invoicing.service.enterprise;

import com.bigeng.invoicing.pojo.enterprise.Groupinfo;

import java.util.List;

public interface GroupinfoService {
    public List<Groupinfo> findAll();
    public int deleteOne(String c_groupname);
    public Groupinfo findOne(String c_groupname);
    public Boolean addOne(Groupinfo groupinfo);
    public int updateOne(Groupinfo groupinfo);
}
