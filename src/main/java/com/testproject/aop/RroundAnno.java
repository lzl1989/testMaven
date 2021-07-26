package com.testproject.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * AOP技术在方法前后拦截，
 * 前置通知，后置通知，环绕通知，异常通知
 * 下面是环绕通知
 */
@Aspect
@Component
@Slf4j
public class RroundAnno {

    /**
     * 标注哪个方法使用了ExcTransacational这个注解的话就会执行Rround方法
     */
    @Around(value = "@annotation(com.testproject.annotation.ExcTransacational)")
    public Object Rround(ProceedingJoinPoint proceedingJoinPoint){
        try {
             //可以手动添加事务
            //当前的目标方法
            proceedingJoinPoint.proceed();
            log.info("执行环绕成功...");
            return "执行环绕通知成功...";
        }  catch (Throwable throwable) {
            log.info("目标方法异常...");
            log.error(throwable.getMessage());
            return "执行环绕通知异常...";
        }
    }
}
