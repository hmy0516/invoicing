package com.bigeng.invoicing.pojo.base;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class SaleOrder extends SaleOrderKey {
    private Long iNo;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date dtDt;

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

    @Override
    public String toString() {
        return "SaleOrder{" +
                "iNo=" + iNo +
                ", dtDt=" + dtDt +
                ", cUuid='" + cUuid + '\'' +
                ", cCid='" + cCid + '\'' +
                ", cClerk='" + cClerk + '\'' +
                ", cCheck='" + cCheck + '\'' +
                ", dtCheck=" + dtCheck +
                ", cCheckout='" + cCheckout + '\'' +
                ", dtCheckout=" + dtCheckout +
                ", cInvalid='" + cInvalid + '\'' +
                ", dtInvalid=" + dtInvalid +
                ", cComment='" + cComment + '\'' +
                ", iBono=" + iBono +
                ", iStatus=" + iStatus +
                ", detailList=" + detailList +
                '}';
    }

    @Override
    public Long getiNo() {
        return iNo;
    }

    @Override
    public void setiNo(Long iNo) {
        this.iNo = iNo;
    }

    @Override
    public Date getDtDt() {
        return dtDt;
    }

    @Override
    public void setDtDt(Date dtDt) {
        this.dtDt = dtDt;
    }

    public String getcUuid() {
        return cUuid;
    }

    public void setcUuid(String cUuid) {
        this.cUuid = cUuid;
    }

    public String getcCid() {
        return cCid;
    }

    public void setcCid(String cCid) {
        this.cCid = cCid;
    }

    public String getcClerk() {
        return cClerk;
    }

    public void setcClerk(String cClerk) {
        this.cClerk = cClerk;
    }

    public String getcCheck() {
        return cCheck;
    }

    public void setcCheck(String cCheck) {
        this.cCheck = cCheck;
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
        this.cCheckout = cCheckout;
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
        this.cInvalid = cInvalid;
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
        this.cComment = cComment;
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

    public List<SaleOrderDetail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<SaleOrderDetail> detailList) {
        this.detailList = detailList;
    }
}