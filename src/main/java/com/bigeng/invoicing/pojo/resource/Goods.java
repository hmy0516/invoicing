package com.bigeng.invoicing.pojo.resource;

import java.math.BigDecimal;

public class Goods {
    private String cId;

    private String cDesc;

    private String cFormat;

    private String cBrand;

    private String cComp;

    private String cClass;

    private String cBunit;

    private BigDecimal fExpiration;

    private String cCode;

    private String cQrcode;

    private BigDecimal fPprice;

    private BigDecimal fSprice;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcDesc() {
        return cDesc;
    }

    public void setcDesc(String cDesc) {
        this.cDesc = cDesc;
    }

    public String getcFormat() {
        return cFormat;
    }

    public void setcFormat(String cFormat) {
        this.cFormat = cFormat;
    }

    public String getcBrand() {
        return cBrand;
    }

    public void setcBrand(String cBrand) {
        this.cBrand = cBrand;
    }

    public String getcComp() {
        return cComp;
    }

    public void setcComp(String cComp) {
        this.cComp = cComp;
    }

    public String getcClass() {
        return cClass;
    }

    public void setcClass(String cClass) {
        this.cClass = cClass;
    }

    public String getcBunit() {
        return cBunit;
    }

    public void setcBunit(String cBunit) {
        this.cBunit = cBunit;
    }

    public BigDecimal getfExpiration() {
        return fExpiration;
    }

    public void setfExpiration(BigDecimal fExpiration) {
        this.fExpiration = fExpiration;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    public String getcQrcode() {
        return cQrcode;
    }

    public void setcQrcode(String cQrcode) {
        this.cQrcode = cQrcode;
    }

    public BigDecimal getfPprice() {
        return fPprice;
    }

    public void setfPprice(BigDecimal fPprice) {
        this.fPprice = fPprice;
    }

    public BigDecimal getfSprice() {
        return fSprice;
    }

    public void setfSprice(BigDecimal fSprice) {
        this.fSprice = fSprice;
    }
}