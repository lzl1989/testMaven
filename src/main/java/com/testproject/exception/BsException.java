package com.testproject.exception;

import lombok.Data;

@Data
public class BsException extends RuntimeException {

    /** 错误代码 */
    private int statusCode;

    /** 返回信息 */
    private String msg;

    /** 返回数据 */
    private Object data;
    public BsException( int statusCode, String msg) {
        super(msg);
        this.statusCode = statusCode;
        this.msg = msg;
    }
}
