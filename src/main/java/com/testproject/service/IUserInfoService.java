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

}
