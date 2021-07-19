package com.testproject.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
/**
 * 自定义线程异常日志
 */
@Component
@Slf4j
public class MyUncaughtExceptionHandler implements AsyncUncaughtExceptionHandler {
    @Override
    public void handleUncaughtException(Throwable throwable, Method method, Object... obj) {
        log.error("异常原因："+throwable.getMessage()+" 异常方法:"+method.getName());
    }
}
