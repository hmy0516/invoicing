package com.bigeng.invoicing.pojo;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/6/4 15:52
 */
public class RespMsg {
    private int status;
    private String msg;
    private Object data;

    public RespMsg() {
    }

    public RespMsg(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static RespMsg ok(String msg){
        return new RespMsg(200, msg, null);
    }

    public static RespMsg ok(String msg, Object data) {
        return new RespMsg(200, msg, data);
    }

    public static RespMsg error(String msg){
        return new RespMsg(500, msg, null);
    }

    public static RespMsg error(String msg, Object data) {
        return new RespMsg(500, msg, data);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}