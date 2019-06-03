package com.bigeng.invoicing.pojo.system;

import java.util.Date;

public class Users {
    private String cUid;
    private String cName;
    private String password;
    private String cRoleId;
    private Integer iStatus;
    private Date dtCreate;
    private Date dtClose;
    private String cNumber;

    @Override
    public String toString() {
        return "Users{" +
                "cUid='" + cUid + '\'' +
                ", cName='" + cName + '\'' +
                ", password='" + password + '\'' +
                ", cRoleId='" + cRoleId + '\'' +
                ", iStatus=" + iStatus +
                ", dtCreate=" + dtCreate +
                ", dtClose=" + dtClose +
                ", cNumber='" + cNumber + '\'' +
                '}';
    }

    public String getcUid() {
        return cUid;
    }

    public void setcUid(String cUid) {
        this.cUid = cUid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getcRoleId() {
        return cRoleId;
    }

    public void setcRoleId(String cRoleId) {
        this.cRoleId = cRoleId;
    }

    public Integer getiStatus() {
        return iStatus;
    }

    public void setiStatus(Integer iStatus) {
        this.iStatus = iStatus;
    }

    public Date getDtCreate() {
        return dtCreate;
    }

    public void setDtCreate(Date dtCreate) {
        this.dtCreate = dtCreate;
    }

    public Date getDtClose() {
        return dtClose;
    }

    public void setDtClose(Date dtClose) {
        this.dtClose = dtClose;
    }

    public String getcNumber() {
        return cNumber;
    }

    public void setcNumber(String cNumber) {
        this.cNumber = cNumber;
    }
}
