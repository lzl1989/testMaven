package com.testproject.service;

public interface IStudentPerson {

    /**
     *学生交学费的接口
     */
    void  giveMoneyToSchool();

    /**
     *学生读文章的接口
     */
    void  readInfoToTeacher();

    /**
     * 查询哪个老师的成绩单
     * @param teacherName 查询哪个老师的成绩单
     */
    void  gitTheReport(String teacherName);

    /**
     *
     */
    void selectTheTeacher();
}
