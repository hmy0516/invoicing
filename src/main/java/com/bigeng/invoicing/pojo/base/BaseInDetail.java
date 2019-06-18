package com.bigeng.invoicing.pojo.base;

import java.math.BigDecimal;
import java.util.Date;

public class BaseInDetail {
    private Long i_no;
    private String c_gid;
    private String c_bunit;
    private BigDecimal f_price;
    private BigDecimal f_amount;
    private String c_comment;
    private Date dt_dt;

    public Long getI_no() {
        return i_no;
    }

    public void setI_no(Long i_no) {
        this.i_no = i_no;
    }

    public String getC_gid() {
        return c_gid;
    }

    public void setC_gid(String c_gid) {
        this.c_gid = c_gid;
    }

    public String getC_bunit() {
        return c_bunit;
    }

    public void setC_bunit(String c_bunit) {
        this.c_bunit = c_bunit;
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


    public Date getDt_dt() {
        return dt_dt;
    }

    public void setDt_dt(Date dt_dt) {
        this.dt_dt = dt_dt;
    }

    @Override
    public String toString() {
        return "BaseInDetail{" +
                "i_no=" + i_no +
                ", c_gid='" + c_gid + '\'' +
                ", c_bunit='" + c_bunit + '\'' +
                ", f_price=" + f_price +
                ", f_amount=" + f_amount +
                ", c_comment='" + c_comment + '\'' +
                ", dt_dt=" + dt_dt +
                '}';
    }
}
