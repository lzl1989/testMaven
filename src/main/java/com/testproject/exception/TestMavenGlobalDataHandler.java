package com.testproject.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * 定义全局数据绑定
 *  这个全局数据的 key 就是返回的数据类型名，value 就是方法返回值，
 *  当然开发者可以通过 @ModelAttribute 注解的 name 属性去重新指定 key
 */
@ControllerAdvice
public class TestMavenGlobalDataHandler {

    @ModelAttribute(name="globalData")
    public Map<Object,Object> getGlobalData(){
       Map<Object,Object> map=new HashMap<>();
       map.put("name","lzl");
       map.put("age",32);
       return map;
    }

    @ModelAttribute(name="globalUser")
    public Map<Object,Object> getGlobalUser(){
        Map<Object,Object> map=new HashMap<>();
        map.put("name","global");
        map.put("age",1000);
        return map;
    }
    @ModelAttribute
    public String getGlobalUnInfo(){
        return "SpringBoot";
    }
}
