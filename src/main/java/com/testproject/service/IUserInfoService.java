package com.testproject.service;

import com.testproject.entity.EntityA;
import com.testproject.entity.EntityB;
import com.testproject.entity.UserInfo;
import com.testproject.entity.UserInfoCustom;

import java.util.List;

public interface IUserInfoService  {

    /**
     *
     */
    void  InsertUser();

    /**
     *
     * @param userId
     * @return
     */
    String selectUserById(String userId);

    /**
     *
     * @param userInfoCustom
     * @return
     */
    List<UserInfo> SelectListUserByUserId(UserInfoCustom userInfoCustom);


    /**
     * 把实体集合entityA转换成实体集合entityB
     * @param entityAList
     * @return
     */
    List<EntityB> ListEntityAConvertEntityB(List<EntityA> entityAList);

    /**
     * 函数式编程的操作问题
     */
    void CodeFunctionInterface();

    /**
     * 测试断言工具的用法
     */
    void  testAssertUtil();

}
