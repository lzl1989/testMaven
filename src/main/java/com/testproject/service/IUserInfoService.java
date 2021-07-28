package com.testproject.service;

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


}
