package com.bigeng.invoicing.pojo.base;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.List;

public class Purchorder {
    private Long i_pono;
    private String c_uuid;
    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp dt_dt;
    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp dt_begin;
    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp dt_end;
    private String c_clerk;
    private String c_vendor;
    private String c_base;
    private String c_sale;
    private String c_check;
    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp dt_check;
    private String c_checkout;
    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp dt_checkout;
    private String c_invalid;
    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp dt_invalid;
    private String c_comment;
    private Long i_bno;
    private int i_status;
    private List<Purchorderdetail> purchorderdetailList;


    @Override
    public String toString() {
        return "Purchorder{" +
                "i_pono=" + i_pono +
                ", c_uuid='" + c_uuid + '\'' +
                ", dt_dt=" + dt_dt +
                ", dt_begin=" + dt_begin +
                ", dt_end=" + dt_end +
                ", c_clerk='" + c_clerk + '\'' +
                ", c_vendor='" + c_vendor + '\'' +
                ", c_base='" + c_base + '\'' +
                ", c_sale='" + c_sale + '\'' +
                ", c_check='" + c_check + '\'' +
                ", dt_check=" + dt_check +
                ", c_checkout='" + c_checkout + '\'' +
                ", dt_checkout=" + dt_checkout +
                ", c_invalid='" + c_invalid + '\'' +
                ", dt_invalid=" + dt_invalid +
                ", c_comment='" + c_comment + '\'' +
                ", i_bno=" + i_bno +
                ", i_status=" + i_status +
                ", purchorderdetailList=" + purchorderdetailList +
                '}';
    }

    public Long getI_pono() {
        return i_pono;
    }

    public void setI_pono(Long i_pono) {
        this.i_pono = i_pono;
    }

    public String getC_uuid() {
        return c_uuid;
    }

    public void setC_uuid(String c_uuid) {
        this.c_uuid = c_uuid;
    }

    public Timestamp getDt_dt() {
        return dt_dt;
    }

    public void setDt_dt(Timestamp dt_dt) {
        this.dt_dt = dt_dt;
    }

    public Timestamp getDt_begin() {
        return dt_begin;
    }

    public void setDt_begin(Timestamp dt_begin) {
        this.dt_begin = dt_begin;
    }

    public Timestamp getDt_end() {
        return dt_end;
    }

    public void setDt_end(Timestamp dt_end) {
        this.dt_end = dt_end;
    }

    public String getC_clerk() {
        return c_clerk;
    }

    public void setC_clerk(String c_clerk) {
        this.c_clerk = c_clerk;
    }

    public String getC_vendor() {
        return c_vendor;
    }

    public void setC_vendor(String c_vendor) {
        this.c_vendor = c_vendor;
    }

    public String getC_base() {
        return c_base;
    }

    public void setC_base(String c_base) {
        this.c_base = c_base;
    }

    public String getC_sale() {
        return c_sale;
    }

    public void setC_sale(String c_sale) {
        this.c_sale = c_sale;
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

    public String getC_invalid() {
        return c_invalid;
    }

    public void setC_invalid(String c_invalid) {
        this.c_invalid = c_invalid;
    }

    public Timestamp getDt_invalid() {
        return dt_invalid;
    }

    public void setDt_invalid(Timestamp dt_invalid) {
        this.dt_invalid = dt_invalid;
    }

    public String getC_comment() {
        return c_comment;
    }

    public void setC_comment(String c_comment) {
        this.c_comment = c_comment;
    }

    public Long getI_bno() {
        return i_bno;
    }

    public void setI_bno(Long i_bno) {
        this.i_bno = i_bno;
    }

    public int getI_status() {
        return i_status;
    }

    public void setI_status(int i_status) {
        this.i_status = i_status;
    }

    public List<Purchorderdetail> getPurchorderdetailList() {
        return purchorderdetailList;
    }

    public void setPurchorderdetailList(List<Purchorderdetail> purchorderdetailList) {
        this.purchorderdetailList = purchorderdetailList;
    }
}
