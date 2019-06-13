package com.bigeng.invoicing.pojo.resource;

public class Unit {
    private String cId;

    private String cUnit;

    private Byte iDefault;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcUnit() {
        return cUnit;
    }

    public void setcUnit(String cUnit) {
        this.cUnit = cUnit;
    }

    public Byte getiDefault() {
        return iDefault;
    }

    public void setiDefault(Byte iDefault) {
        this.iDefault = iDefault;
    }
}