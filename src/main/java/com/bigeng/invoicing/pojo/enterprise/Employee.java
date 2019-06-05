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
    //工号 长度8 是主键
    private String c_number;

    //名称 10
    private String c_name;

    //性别 索引 0女 1男
    private byte i_sex;

    //学历 4
    private String c_education;

    //省份证 18 可以为null
    private String c_id;

    //家庭地址 长度255 null
    private String c_address;

    //手机号 11
    private String c_mobile;

    //家庭联系人 10 null
    private String c_lmmobile;

    //入职时间 null
    private Date dt_join;

    //离职时间 null
    private Date dt_left;

    //状态 索引 0在职 1离职 2退休
    private byte i_status;

    //员工正面照 255 null
    private String c_idpic;

    //员工反面照 255 null
    private  String c_idpicl;

    //员工近照 255 null
    private String c_pic;

    //创建时间
    private Date ts_ctime;

    //职务编码 4
    private String c_dutyid;

    //部门编号 10
    private String c_did;

    public String getC_number() {
        return c_number;
    }

    public void setC_number(String c_number) {
        this.c_number = c_number;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public byte getI_sex() {
        return i_sex;
    }

    public void setI_sex(byte i_sex) {
        this.i_sex = i_sex;
    }

    public String getC_education() {
        return c_education;
    }

    public void setC_education(String c_education) {
        this.c_education = c_education;
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getC_address() {
        return c_address;
    }

    public void setC_address(String c_address) {
        this.c_address = c_address;
    }

    public String getC_mobile() {
        return c_mobile;
    }

    public void setC_mobile(String c_mobile) {
        this.c_mobile = c_mobile;
    }

    public String getC_lmmobile() {
        return c_lmmobile;
    }

    public void setC_lmmobile(String c_lmmobile) {
        this.c_lmmobile = c_lmmobile;
    }

    public Date getDt_join() {
        return dt_join;
    }

    public void setDt_join(Date dt_join) {
        this.dt_join = dt_join;
    }

    public Date getDt_left() {
        return dt_left;
    }

    public void setDt_left(Date dt_left) {
        this.dt_left = dt_left;
    }

    public byte getI_status() {
        return i_status;
    }

    public void setI_status(byte i_status) {
        this.i_status = i_status;
    }

    public String getC_idpic() {
        return c_idpic;
    }

    public void setC_idpic(String c_idpic) {
        this.c_idpic = c_idpic;
    }

    public String getC_idpicl() {
        return c_idpicl;
    }

    public void setC_idpicl(String c_idpicl) {
        this.c_idpicl = c_idpicl;
    }

    public String getC_pic() {
        return c_pic;
    }

    public void setC_pic(String c_pic) {
        this.c_pic = c_pic;
    }

    public Date getTs_ctime() {
        return ts_ctime;
    }

    public void setTs_ctime(Date ts_ctime) {
        this.ts_ctime = ts_ctime;
    }

    public String getC_dutyid() {
        return c_dutyid;
    }

    public void setC_dutyid(String c_dutyid) {
        this.c_dutyid = c_dutyid;
    }

    public String getC_did() {
        return c_did;
    }

    public void setC_did(String c_did) {
        this.c_did = c_did;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "c_number='" + c_number + '\'' +
                ", c_name='" + c_name + '\'' +
                ", i_sex=" + i_sex +
                ", c_education='" + c_education + '\'' +
                ", c_id='" + c_id + '\'' +
                ", c_address='" + c_address + '\'' +
                ", c_mobile='" + c_mobile + '\'' +
                ", c_lmmobile='" + c_lmmobile + '\'' +
                ", dt_join=" + dt_join +
                ", dt_left=" + dt_left +
                ", i_status=" + i_status +
                ", c_idpic='" + c_idpic + '\'' +
                ", c_idpicl='" + c_idpicl + '\'' +
                ", c_pic='" + c_pic + '\'' +
                ", ts_ctime=" + ts_ctime +
                ", c_dutyid='" + c_dutyid + '\'' +
                ", c_did='" + c_did + '\'' +
                '}';
    }
}
