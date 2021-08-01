package com.testproject.service.impl;


import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
@Slf4j
public class DynamicProxy<T> implements InvocationHandler {


    /**
     * 代理的对象
     */
    private T traget;

    public DynamicProxy(T t) {
        this.traget = t;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        log.info("代理执行的方法是:"+method.getName());
        MonitorUtil.start();
        Object object = method.invoke(traget, args);
        MonitorUtil.finish(method.getName());
        return object;
    }
}
