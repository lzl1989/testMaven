package com.testproject.service;

public interface IStudent {
    /**
     * 回答老师的问题并调用回调函数通知老师
     * @param callBack
     */
    void  responseQueation(ITeacherCallBack callBack) throws InterruptedException;

}
