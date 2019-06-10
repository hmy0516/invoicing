package com.bigeng.invoicing.pojo.enterprise;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;

public class Groupinfo {
    private String c_groupname;

    @Override
    public String toString() {
        return "Groupinfo{" +
                "c_groupname='" + c_groupname + '\'' +
                ", c_alias='" + c_alias + '\'' +
                ", c_addr='" + c_addr + '\'' +
                ", c_coordinates='" + c_coordinates + '\'' +
                ", c_logo='" + c_logo + '\'' +
                ", c_city='" + c_city + '\'' +
                ", ts_ctime=" + ts_ctime +
                '}';
    }

    private String c_alias;
    private String c_addr;
    private String c_coordinates;
    private String c_logo;
    private String c_city;

    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp ts_ctime;


    public String getC_groupname() {
        return c_groupname;
    }

    public void setC_groupname(String c_groupname) {
        this.c_groupname = c_groupname;
    }

    public String getC_alias() {
        return c_alias;
    }

    public void setC_alias(String c_alias) {
        this.c_alias = c_alias;
    }

    public String getC_addr() {
        return c_addr;
    }

    public void setC_addr(String c_addr) {
        this.c_addr = c_addr;
    }

    public String getC_coordinates() {
        return c_coordinates;
    }

    public void setC_coordinates(String c_coordinates) {
        this.c_coordinates = c_coordinates;
    }

    public String getC_logo() {
        return c_logo;
    }

    public void setC_logo(String c_logo) {
        this.c_logo = c_logo;
    }

    public String getC_city() {
        return c_city;
    }

    public void setC_city(String c_city) {
        this.c_city = c_city;
    }

    public Timestamp getTs_ctime() {
        return ts_ctime;
    }

    public void setTs_ctime(Timestamp ts_ctime) {
        this.ts_ctime = ts_ctime;
    }
}

