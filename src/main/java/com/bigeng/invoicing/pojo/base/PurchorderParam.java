package com.bigeng.invoicing.pojo.base;

public class PurchorderParam {
    private Long i_pono;
    private String c_gid;

    public Long getI_pono() {
        return i_pono;
    }

    public void setI_pono(Long i_pono) {
        this.i_pono = i_pono;
    }

    public String getC_gid() {
        return c_gid;
    }

    public void setC_gid(String c_gid) {
        this.c_gid = c_gid;
    }

    @Override
    public String toString() {
        return "PurchorderParam{" +
                "i_pono=" + i_pono +
                ", c_gid='" + c_gid + '\'' +
                '}';
    }
}
