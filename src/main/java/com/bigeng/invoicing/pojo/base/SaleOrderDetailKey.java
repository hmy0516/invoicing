package com.bigeng.invoicing.pojo.base;

public class SaleOrderDetailKey {
    private Long iNo;

    private String cGid;

    public Long getiNo() {
        return iNo;
    }

    public void setiNo(Long iNo) {
        this.iNo = iNo;
    }

    public String getcGid() {
        return cGid;
    }

    public void setcGid(String cGid) {
        this.cGid = cGid == null ? null : cGid.trim();
    }
}