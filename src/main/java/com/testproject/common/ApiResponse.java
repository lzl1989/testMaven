package com.testproject.common;

import java.io.Serializable;

public class ApiResponse  implements Serializable {

    /**
     * 返回码
     */
    private int statusCode;
    /**
     * 返回信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private Object data;

    public ApiResponse() {
        this(ApiResultCode.SUCCESS, null, null);
    }

    public ApiResponse(Object result) {
        this(ApiResultCode.SUCCESS, null, result);
    }

    public ApiResponse(int statusCode) {
        this(statusCode, null, null);
    }

    public ApiResponse(int statusCode, String msg) {
        this(statusCode, msg, null);
    }

    public ApiResponse(int statusCode, String msg, Object data) {
        this.statusCode = statusCode;
        this.msg = msg;
        this.data = data;
    }

    public static final ApiResponse success(Object result) {
        ApiResponse apiResponse = new ApiResponse(result);
        return apiResponse;
    }

    public static final ApiResponse successMsg(String msg) {
        ApiResponse apiResponse = new ApiResponse(ApiResultCode.SUCCESS, msg);
        return apiResponse;
    }


    public static final ApiResponse fail(int statusCode) {
        return fail(statusCode, null);
    }

    public static final ApiResponse fail(int statusCode, String msg) {
        ApiResponse apiResponse = new ApiResponse(statusCode, msg);
        return apiResponse;
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

    @Override
    public String toString() {
        return "ApiResponse [statusCode=" + statusCode + ", msg=" + msg + ", data=" + data + "]";
    }
}
