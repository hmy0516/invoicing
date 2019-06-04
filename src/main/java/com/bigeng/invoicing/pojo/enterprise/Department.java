package com.bigeng.invoicing.pojo.enterprise;
public class Department {
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