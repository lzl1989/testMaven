package com.testproject.service.impl;

import com.testproject.service.IStudentPerson;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StudentPersonA implements IStudentPerson {

    public String studentName;

    public StudentPersonA(String name){
     this.studentName=name;
    }
    @Override
    public void giveMoneyToSchool() {
       log.info(studentName+"把学费已经交了...");
    }
}
