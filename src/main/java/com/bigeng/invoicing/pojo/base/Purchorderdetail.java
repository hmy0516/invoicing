package com.bigeng.invoicing.pojo.base;

import java.math.BigDecimal;

public class Purchorderdetail {
    private Long i_pono;
    private String c_gid;
    private BigDecimal f_pquant;
    private String c_unit;
    private BigDecimal f_price;
    private BigDecimal f_amount;
    private String c_comment;

    public Long getI_pono() {
        return i_pono;
    }

    public void setI_pono(Long i_pono) {
        this.i_pono = i_pono;
    }

    public String getC_gid() {
        return c_gid;
    }

    public void setC_gid(String c_gid) {
        this.c_gid = c_gid;
    }

    public BigDecimal getF_pquant() {
        return f_pquant;
    }

    public void setF_pquant(BigDecimal f_pquant) {
        this.f_pquant = f_pquant;
    }

    public String getC_unit() {
        return c_unit;
    }

    public void setC_unit(String c_unit) {
        this.c_unit = c_unit;
    }

    public BigDecimal getF_price() {
        return f_price;
    }

    public void setF_price(BigDecimal f_price) {
        this.f_price = f_price;
    }

    public BigDecimal getF_amount() {
        return f_amount;
    }

    public void setF_amount(BigDecimal f_amount) {
        this.f_amount = f_amount;
    }

    public String getC_comment() {
        return c_comment;
    }

    public void setC_comment(String c_comment) {
        this.c_comment = c_comment;
    }

    @Override
    public String toString() {
        return "Purchorderdetail{" +
                "i_pono=" + i_pono +
                ", c_gid='" + c_gid + '\'' +
                ", f_pquant=" + f_pquant +
                ", c_unit='" + c_unit + '\'' +
                ", f_price=" + f_price +
                ", f_amount=" + f_amount +
                ", c_comment='" + c_comment + '\'' +
                '}';
    }
}
