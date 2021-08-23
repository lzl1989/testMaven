package com.testproject.exception;

public class BsException extends RuntimeException {

    /** 错误代码 */
    private int statusCode;

    /** 返回信息 */
    private String msg;

    /** 返回数据 */
    private Object data;

    private Object[] param;

    public BsException(String message, int statusCode, String msg, Object data) {
        super(message);
        this.statusCode = statusCode;
        this.msg = msg;
        this.data = data;
    }

    public BsException(int statusCode, String msg) {
        super(msg);
        this.statusCode = statusCode;
        this.msg = msg;
    }

    public BsException(int statusCode) {
        this.statusCode = statusCode;
    }

    public BsException(String msg) {
        super(msg);
        this.msg = msg;
    }
    public BsException(int statusCode, Object[] param) {
        this.statusCode = statusCode;
        this.param = param;
    }

    public BsException(int statusCode, String msg, Object[] param) {
        super(msg);
        this.statusCode = statusCode;
        this.param = param;
        this.msg = msg;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
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

    public Object[] getParam() {
        return param;
    }

    public void setParam(Object[] param) {
        this.param = param;
    }
}
