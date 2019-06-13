package com.bigeng.invoicing.pojo.base;

import java.util.Date;
import java.util.List;

public class SaleOrder extends SaleOrderKey {
    private String cUuid;

    private String cCid;

    private String cClerk;

    private String cCheck;

    private Date dtCheck;

    private String cCheckout;

    private Date dtCheckout;

    private String cInvalid;

    private Date dtInvalid;

    private String cComment;

    private Integer iBono;

    private Integer iStatus;

    private List<SaleOrderDetail> detailList;

    public List<SaleOrderDetail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<SaleOrderDetail> detailList) {
        this.detailList = detailList;
    }

    public String getcUuid() {
        return cUuid;
    }

    public void setcUuid(String cUuid) {
        this.cUuid = cUuid == null ? null : cUuid.trim();
    }

    public String getcCid() {
        return cCid;
    }

    public void setcCid(String cCid) {
        this.cCid = cCid == null ? null : cCid.trim();
    }

    public String getcClerk() {
        return cClerk;
    }

    public void setcClerk(String cClerk) {
        this.cClerk = cClerk == null ? null : cClerk.trim();
    }

    public String getcCheck() {
        return cCheck;
    }

    public void setcCheck(String cCheck) {
        this.cCheck = cCheck == null ? null : cCheck.trim();
    }

    public Date getDtCheck() {
        return dtCheck;
    }

    public void setDtCheck(Date dtCheck) {
        this.dtCheck = dtCheck;
    }

    public String getcCheckout() {
        return cCheckout;
    }

    public void setcCheckout(String cCheckout) {
        this.cCheckout = cCheckout == null ? null : cCheckout.trim();
    }

    public Date getDtCheckout() {
        return dtCheckout;
    }

    public void setDtCheckout(Date dtCheckout) {
        this.dtCheckout = dtCheckout;
    }

    public String getcInvalid() {
        return cInvalid;
    }

    public void setcInvalid(String cInvalid) {
        this.cInvalid = cInvalid == null ? null : cInvalid.trim();
    }

    public Date getDtInvalid() {
        return dtInvalid;
    }

    public void setDtInvalid(Date dtInvalid) {
        this.dtInvalid = dtInvalid;
    }

    public String getcComment() {
        return cComment;
    }

    public void setcComment(String cComment) {
        this.cComment = cComment == null ? null : cComment.trim();
    }

    public Integer getiBono() {
        return iBono;
    }

    public void setiBono(Integer iBono) {
        this.iBono = iBono;
    }

    public Integer getiStatus() {
        return iStatus;
    }

    public void setiStatus(Integer iStatus) {
        this.iStatus = iStatus;
    }
}