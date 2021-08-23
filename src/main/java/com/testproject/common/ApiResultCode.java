package com.testproject.common;

public class ApiResultCode {
    /**
     * 返回错误码
     */
    public static final int RESULT_ERROR=100010;

    public static final String RESP_CODE_KEY = "respcode.%s";
    /**
     * 操作成功
     */
    public static final int SUCCESS = 200;

    /**
     * 操作失败
     */
    public static final int FAIL = -1;
    /**
     * 数据不存在
     */
    public static final int NO_DATA = -2;

    /**
     * 非法参数
     */
    public static final int ILLEGAL_PARAM = -3;
    /**
     * xss校验失败
     */
    public static final int XSS_ERROR = 400;
    /**
     * 系统异常
     */
    public static final int SYSTEM_ERROR = 503;
    /**
     * 用户未登录
     */
    public static final int NO_AUTH = -200;

    /**
     * 请求地址找不到服务
     */
    public static final int NOT_FOUND = 404;

    /**
     * 登录超时
     */
    public static final int LOGIN_EXPIRE = 90001;
    /**
     * 重复提交
     */
    public static final int RESUBMIT_REQUEST = 90002;
}
