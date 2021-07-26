package com.testproject.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 系统捕获全局异常
 *
 * 增强的 Controller。使用这个 Controller ，可以实现三个方面的功能：
 * 全局异常处理
 * 全局数据绑定
 * 全局数据预处理
 */
@ControllerAdvice
public class TestMavenExceptionHandler {

    /**
     * @ExceptionHandler 注解用来指明异常的处理类型
     * {DescriptionCstOrderException.class, SpecializationCstOrderException.class, NoUploadFileException.class,
     *                     DeadLineCstOrderException.class, DocumentCstOrderException.class, CommentCstOrderException.class}
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<Object,Object> ExceptionHandlerClass(){
       Map<Object,Object> map=new HashMap<>();
       map.put("code",500);
       map.put("msg","系统异常");
       return map;
    }
}
