package com.bigeng.invoicing.pojo.enterprise;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="t_hr_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cDid;

    private String cDepartment;
    private  String cComment;

    @Override
    public String toString() {
        return "Department{" +
                "cDid='" + cDid + '\'' +
                ", cDepartment='" + cDepartment + '\'' +
                ", cComment='" + cComment + '\'' +
                '}';
    }

    public String getcDid() {
        return cDid;
    }

    public void setcDid(String cDid) {
        this.cDid = cDid;
    }

    public String getcDepartment() {
        return cDepartment;
    }

    public void setcDepartment(String cDepartment) {
        this.cDepartment = cDepartment;
    }

    public String getcComment() {
        return cComment;
    }

    public void setcComment(String cComment) {
        this.cComment = cComment;
    }
}