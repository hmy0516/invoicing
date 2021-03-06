package com.bigeng.invoicing.pojo.base;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class SaleOrderDetail{
    private BigDecimal fQuant;

    private String cBunit;

    private BigDecimal fPrice;

    private BigDecimal fAmount;

    private String cComment;

    private Long iNo;

    private String cGid;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date dtDt;

    @Override
    public String toString() {
        return "SaleOrderDetail{" +
                "fQuant=" + fQuant +
                ", cBunit='" + cBunit + '\'' +
                ", fPrice=" + fPrice +
                ", fAmount=" + fAmount +
                ", cComment='" + cComment + '\'' +
                ", iNo=" + iNo +
                ", cGid='" + cGid + '\'' +
                ", dtDt=" + dtDt +
                '}';
    }

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
        this.cGid = cGid;
    }

    public BigDecimal getfQuant() {
        return fQuant;
    }

    public void setfQuant(BigDecimal fQuant) {
        this.fQuant = fQuant;
    }

    public String getcBunit() {
        return cBunit;
    }

    public void setcBunit(String cBunit) {
        this.cBunit = cBunit == null ? null : cBunit.trim();
    }

    public BigDecimal getfPrice() {
        return fPrice;
    }

    public void setfPrice(BigDecimal fPrice) {
        this.fPrice = fPrice;
    }

    public BigDecimal getfAmount() {
        return fAmount;
    }

    public void setfAmount(BigDecimal fAmount) {
        this.fAmount = fAmount;
    }

    public String getcComment() {
        return cComment;
    }

    public void setcComment(String cComment) {
        this.cComment = cComment == null ? null : cComment.trim();
    }

    public Date getDtDt() {
        return dtDt;
    }

    public void setDtDt(Date dtDt) {
        this.dtDt = dtDt;
    }
}