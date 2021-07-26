package com.testproject.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)//运行时加载
@Inherited
@Target(ElementType.METHOD)//注解作用于方法
public @interface MyAnnotation {
    String name() default "刘宗林";
    int age() default 18;
    String[]  abilityNames() default {"C#","Java","C++"};
}
