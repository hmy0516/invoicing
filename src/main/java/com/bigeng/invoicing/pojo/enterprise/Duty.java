package com.bigeng.invoicing.pojo.enterprise;

public class Duty {
    private String cId;
    private String cDuty;
    private String cComment;

    @Override
    public String toString() {
        return "Duty{" +
                "cId='" + cId + '\'' +
                ", cDuty='" + cDuty + '\'' +
                ", cComment='" + cComment + '\'' +
                '}';
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcDuty() {
        return cDuty;
    }

    public void setcDuty(String cDuty) {
        this.cDuty = cDuty;
    }

    public String getcComment() {
        return cComment;
    }

    public void setcComment(String cComment) {
        this.cComment = cComment;
    }
}
