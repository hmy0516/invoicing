package com.bigeng.invoicing.pojo.base;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.List;

public class BaseIn {
    private String c_uuid;
    private Long i_no;
    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp dt_dt;
    private String c_baseid;
    private String c_vendor;
    private Long i_pno;
    private String c_check;
    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp dt_check;
    private String c_checkout;
    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp dt_checkout;
    private String c_recheck;
    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp dt_recheck;
    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp dt_inv;
    private String c_inv;
    private int i_invtype;
    private String c_invno;
    private String c_payment;
    private String c_voucher;
    private String c_comment;
    private int i_status;
    private List<BaseInDetail> baseInDetail;

    public String getC_uuid() {
        return c_uuid;
    }

    public void setC_uuid(String c_uuid) {
        this.c_uuid = c_uuid;
    }

    public Long getI_no() {
        return i_no;
    }

    public void setI_no(Long i_no) {
        this.i_no = i_no;
    }

    public Timestamp getDt_dt() {
        return dt_dt;
    }

    public void setDt_dt(Timestamp dt_dt) {
        this.dt_dt = dt_dt;
    }

    public String getC_baseid() {
        return c_baseid;
    }

    public void setC_baseid(String c_baseid) {
        this.c_baseid = c_baseid;
    }

    public String getC_vendor() {
        return c_vendor;
    }

    public void setC_vendor(String c_vendor) {
        this.c_vendor = c_vendor;
    }

    public Long getI_pno() {
        return i_pno;
    }

    public void setI_pno(Long i_pno) {
        this.i_pno = i_pno;
    }

    public String getC_check() {
        return c_check;
    }

    public void setC_check(String c_check) {
        this.c_check = c_check;
    }

    public Timestamp getDt_check() {
        return dt_check;
    }

    public void setDt_check(Timestamp dt_check) {
        this.dt_check = dt_check;
    }

    public String getC_checkout() {
        return c_checkout;
    }

    public void setC_checkout(String c_checkout) {
        this.c_checkout = c_checkout;
    }

    public Timestamp getDt_checkout() {
        return dt_checkout;
    }

    public void setDt_checkout(Timestamp dt_checkout) {
        this.dt_checkout = dt_checkout;
    }

    public String getC_recheck() {
        return c_recheck;
    }

    public void setC_recheck(String c_recheck) {
        this.c_recheck = c_recheck;
    }

    public Timestamp getDt_recheck() {
        return dt_recheck;
    }

    public void setDt_recheck(Timestamp dt_recheck) {
        this.dt_recheck = dt_recheck;
    }

    public Timestamp getDt_inv() {
        return dt_inv;
    }

    public void setDt_inv(Timestamp dt_inv) {
        this.dt_inv = dt_inv;
    }

    public String getC_inv() {
        return c_inv;
    }

    public void setC_inv(String c_inv) {
        this.c_inv = c_inv;
    }

    public int getI_invtype() {
        return i_invtype;
    }

    public void setI_invtype(int i_invtype) {
        this.i_invtype = i_invtype;
    }

    public String getC_invno() {
        return c_invno;
    }

    public void setC_invno(String c_invno) {
        this.c_invno = c_invno;
    }

    public String getC_payment() {
        return c_payment;
    }

    public void setC_payment(String c_payment) {
        this.c_payment = c_payment;
    }

    public String getC_voucher() {
        return c_voucher;
    }

    public void setC_voucher(String c_voucher) {
        this.c_voucher = c_voucher;
    }

    public String getC_comment() {
        return c_comment;
    }

    public void setC_comment(String c_comment) {
        this.c_comment = c_comment;
    }

    public int getI_status() {
        return i_status;
    }

    public void setI_status(int i_status) {
        this.i_status = i_status;
    }


    public List<BaseInDetail> getBaseInDetail() {
        return baseInDetail;
    }

    public void setBaseInDetail(List<BaseInDetail> baseInDetail) {
        this.baseInDetail = baseInDetail;
    }


    @Override
    public String toString() {
        return "BaseIn{" +
                "c_uuid='" + c_uuid + '\'' +
                ", i_no=" + i_no +
                ", dt_dt=" + dt_dt +
                ", c_baseid='" + c_baseid + '\'' +
                ", c_vendor='" + c_vendor + '\'' +
                ", i_pno=" + i_pno +
                ", c_check='" + c_check + '\'' +
                ", dt_check=" + dt_check +
                ", c_checkout='" + c_checkout + '\'' +
                ", dt_checkout=" + dt_checkout +
                ", c_recheck='" + c_recheck + '\'' +
                ", dt_recheck=" + dt_recheck +
                ", dt_inv=" + dt_inv +
                ", c_inv='" + c_inv + '\'' +
                ", i_invtype=" + i_invtype +
                ", c_invno='" + c_invno + '\'' +
                ", c_payment='" + c_payment + '\'' +
                ", c_voucher='" + c_voucher + '\'' +
                ", c_comment='" + c_comment + '\'' +
                ", i_status=" + i_status +
                ", baseInDetail=" + baseInDetail +
                '}';
    }
}
