package com.bigeng.invoicing.pojo.base;

import com.bigeng.invoicing.pojo.resource.Goods;

import java.math.BigDecimal;
import java.util.Date;

public class SaleOrderDetail extends SaleOrderDetailKey {
    private BigDecimal fQuant;

    private String cBunit;

    private BigDecimal fPrice;

    private BigDecimal fAmount;

    private String cComment;

    private Date dtDt;

    private Goods goods;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
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