package com.testproject.service.impl;

import com.testproject.entity.StudentEntity;
import com.testproject.service.IStudent;
import com.testproject.service.ITeacherCallBack;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LinStudent implements IStudent {


    @Override
    public void responseQueation(ITeacherCallBack callBack) throws InterruptedException {
        StudentEntity studentEntity = StudentEntity.builder().studentName("lzl").studentAge("12").build();
        Thread.sleep(3000);
        log.info("我思考了三分钟");

        //调用老师的回调函数通知老师自己的答案
        callBack.teacherCallBack(studentEntity, "答案是10");
    }
}
