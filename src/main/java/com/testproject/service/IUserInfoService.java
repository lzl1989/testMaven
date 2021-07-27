package com.testproject.service;

import com.baomidou.mybatisplus.service.IService;
import com.testproject.entity.UserInfo;
import com.testproject.entity.UserInfoCustom;

import java.util.List;

public interface IUserInfoService extends IService<UserInfo> {

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
