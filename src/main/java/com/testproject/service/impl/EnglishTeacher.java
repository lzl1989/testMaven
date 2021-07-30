package com.testproject.service.impl;

import com.testproject.entity.StudentEntity;
import com.testproject.service.IStudent;
import com.testproject.service.ITeacher;
import com.testproject.service.ITeacherCallBack;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EnglishTeacher implements ITeacherCallBack,ITeacher {


    @Autowired
    private IStudent iStudent;

    /**
     * 老师的回调函数. 处理响应结果的方法
     * @param message
     */
    @Override
    public void teacherCallBack(StudentEntity studentEntity, String message) {
         log.info("老师得到的回答是:"+ studentEntity.getStudentName()+"同学通过回调函数返回的的答案是:"+message);
    }

    /**
     * 老师请求问题
     */
    @Override
    public void requestQuestion() throws InterruptedException {

        //回调的用法。把回调函数传过去。
        iStudent.responseQueation(this::teacherCallBack);
    }
}
