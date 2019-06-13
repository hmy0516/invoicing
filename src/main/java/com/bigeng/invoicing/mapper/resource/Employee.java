package com.bigeng.invoicing.mapper.resource;

import java.util.Date;

public class Employee {
    private String cGroupname;

    private String cAlias;

    private String cAddr;

    private String cCoordinates;

    private String cLogo;

    private String cCity;

    private Date tsCtime;

    public String getcGroupname() {
        return cGroupname;
    }

    public void setcGroupname(String cGroupname) {
        this.cGroupname = cGroupname;
    }

    public String getcAlias() {
        return cAlias;
    }

    public void setcAlias(String cAlias) {
        this.cAlias = cAlias;
    }

    public String getcAddr() {
        return cAddr;
    }

    public void setcAddr(String cAddr) {
        this.cAddr = cAddr;
    }

    public String getcCoordinates() {
        return cCoordinates;
    }

    public void setcCoordinates(String cCoordinates) {
        this.cCoordinates = cCoordinates;
    }

    public String getcLogo() {
        return cLogo;
    }

    public void setcLogo(String cLogo) {
        this.cLogo = cLogo;
    }

    public String getcCity() {
        return cCity;
    }

    public void setcCity(String cCity) {
        this.cCity = cCity;
    }

    public Date getTsCtime() {
        return tsCtime;
    }

    public void setTsCtime(Date tsCtime) {
        this.tsCtime = tsCtime;
    }
}