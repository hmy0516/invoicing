package com.bigeng.invoicing.pojo.base;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SaleOrderKey {
    private Long iNo;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date dtDt;

    public Long getiNo() {
        return iNo;
    }

    public void setiNo(Long iNo) {
        this.iNo = iNo;
    }

    public Date getDtDt() {
        return dtDt;
    }

    public void setDtDt(Date dtDt) {
        this.dtDt = dtDt;
    }
}