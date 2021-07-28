package com.testproject.dao;

import com.testproject.entity.UserInfo;
import com.testproject.entity.UserInfoCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserInfoMapper  {

   void InsertUser();

   /**
    *
    * @return
    */
   String selectUserById(@Param("userId") String userId);

    /**
     *
     * @param userInfoCustom
     * @return
     */
   List<UserInfo> SelectListUserByUserId(UserInfoCustom userInfoCustom);
}
