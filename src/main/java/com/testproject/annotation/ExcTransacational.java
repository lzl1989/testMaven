package com.testproject.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)//运行时加载
@Inherited
@Target(ElementType.METHOD)//注解作用于方法
public @interface ExcTransacational {
    String ExcNama() default "异常";
}
