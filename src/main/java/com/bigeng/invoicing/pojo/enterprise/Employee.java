package com.bigeng.invoicing.pojo.enterprise;

import java.util.Date;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/4 14:42
 *
 *
 * 该类对应的是t_hr_employee表 员工的基本信息
 */
public class Employee {
    private String cNumber;

    private String cName;

    private Byte iSex;

    private String cEducation;

    private String cId;

    private String cAddress;

    private String cMobile;

    private String cLinkman;

    private String cLmmobile;

    private Date dtJoin;

    private Date dtLeft;

    private Byte iStatus;

    private String cIdpic;

    private String cIdpic1;

    private String cPic;

    private Date tsCtime;

    private String cDutyid;

    private String cDid;

    private  Duty duty;

    private  Department department;

    public Duty getDuty() {
        return duty;
    }

    public void setDuty(Duty duty) {
        this.duty = duty;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getcNumber() {
        return cNumber;
    }

    public void setcNumber(String cNumber) {
        this.cNumber = cNumber;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Byte getiSex() {
        return iSex;
    }

    public void setiSex(Byte iSex) {
        this.iSex = iSex;
    }

    public String getcEducation() {
        return cEducation;
    }

    public void setcEducation(String cEducation) {
        this.cEducation = cEducation;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getcMobile() {
        return cMobile;
    }

    public void setcMobile(String cMobile) {
        this.cMobile = cMobile;
    }

    public String getcLinkman() {
        return cLinkman;
    }

    public void setcLinkman(String cLinkman) {
        this.cLinkman = cLinkman;
    }

    public String getcLmmobile() {
        return cLmmobile;
    }

    public void setcLmmobile(String cLmmobile) {
        this.cLmmobile = cLmmobile;
    }

    public Date getDtJoin() {
        return dtJoin;
    }

    public void setDtJoin(Date dtJoin) {
        this.dtJoin = dtJoin;
    }

    public Date getDtLeft() {
        return dtLeft;
    }

    public void setDtLeft(Date dtLeft) {
        this.dtLeft = dtLeft;
    }

    public Byte getiStatus() {
        return iStatus;
    }

    public void setiStatus(Byte iStatus) {
        this.iStatus = iStatus;
    }

    public String getcIdpic() {
        return cIdpic;
    }

    public void setcIdpic(String cIdpic) {
        this.cIdpic = cIdpic;
    }

    public String getcIdpic1() {
        return cIdpic1;
    }

    public void setcIdpic1(String cIdpic1) {
        this.cIdpic1 = cIdpic1;
    }

    public String getcPic() {
        return cPic;
    }

    public void setcPic(String cPic) {
        this.cPic = cPic;
    }

    public Date getTsCtime() {
        return tsCtime;
    }

    public void setTsCtime(Date tsCtime) {
        this.tsCtime = tsCtime;
    }

    public String getcDutyid() {
        return cDutyid;
    }

    public void setcDutyid(String cDutyid) {
        this.cDutyid = cDutyid;
    }

    public String getcDid() {
        return cDid;
    }

    public void setcDid(String cDid) {
        this.cDid = cDid;
    }
}