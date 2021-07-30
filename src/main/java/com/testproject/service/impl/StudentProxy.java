package com.testproject.service.impl;

import com.testproject.service.IStudentPerson;
import lombok.extern.slf4j.Slf4j;

/**
 * 【静态代理:在编译阶段就已经确认要对象】
 * 学生的代理类。  这是静态代理,因为这个代理类直接持有StudentPersonA的类对象。
 * 静态代理的条件:
 * 一个动作接口，实现类和代理类同时实现这个接口，同时代理类持有这个实现类的对象
 */
@Slf4j
public class StudentProxy implements IStudentPerson {

    private StudentPersonA studentPersonA;

    /**
     * 学生代理类持有StudentPersonA 的类对象
     * @param studentPersonA1
     */
    public StudentProxy(StudentPersonA studentPersonA1){
         this.studentPersonA= studentPersonA1;
    }

    /**
     * 代理实现学生的上交学费动作，
     * 我可以在这个实现当中添加一些自己的动作。
     *
     */
    @Override
    public void giveMoneyToSchool() {

        log.info(studentPersonA.studentName+"同学最近学习还是挺不错的。");
        log.info("我打算帮同学["+studentPersonA.studentName+"]"+"干点事情");
       studentPersonA.giveMoneyToSchool();
    }
}
