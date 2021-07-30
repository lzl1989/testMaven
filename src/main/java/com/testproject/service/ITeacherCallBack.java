package com.testproject.service;

import com.testproject.entity.StudentEntity;

public interface ITeacherCallBack {

    /**
     * 老师的回调
     * @param iStudent 学生对象
     * @param message  回答的信息
     */
    void  teacherCallBack(StudentEntity iStudent, String message);
}
