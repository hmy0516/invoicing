package com.bigeng.invoicing.pojo.resource;

import java.math.BigDecimal;
import java.util.Date;

public class Vendor_Goodsprice {
    private String cGid;

    private String cVid;

    private BigDecimal fPrice;

    private Date dtBegin;

    private Date dtEnd;

    private Byte iStatus;

    private String cComment;

    public String getcGid() {
        return cGid;
    }

    public void setcGid(String cGid) {
        this.cGid = cGid;
    }

    public String getcVid() {
        return cVid;
    }

    public void setcVid(String cVid) {
        this.cVid = cVid;
    }

    public BigDecimal getfPrice() {
        return fPrice;
    }

    public void setfPrice(BigDecimal fPrice) {
        this.fPrice = fPrice;
    }

    public Date getDtBegin() {
        return dtBegin;
    }

    public void setDtBegin(Date dtBegin) {
        this.dtBegin = dtBegin;
    }

    public Date getDtEnd() {
        return dtEnd;
    }

    public void setDtEnd(Date dtEnd) {
        this.dtEnd = dtEnd;
    }

    public Byte getiStatus() {
        return iStatus;
    }

    public void setiStatus(Byte iStatus) {
        this.iStatus = iStatus;
    }

    public String getcComment() {
        return cComment;
    }

    public void setcComment(String cComment) {
        this.cComment = cComment;
    }
}