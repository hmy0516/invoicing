package com.bigeng.invoicing.service.base;

import com.bigeng.invoicing.mapper.base.BaseInMapper;
import com.bigeng.invoicing.pojo.base.BaseIn;
import com.bigeng.invoicing.pojo.base.BaseInDetail;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface BaseInService {
    public Boolean addBaseIn(BaseIn baseIn);
    public Boolean addBaseInDetail(BaseInDetail baseInDetail);
    public List<BaseIn> findAllBaseIn();
    public BaseIn findOneBaseIn(String c_uuid);
}
