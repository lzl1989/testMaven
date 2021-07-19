package com.testproject.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.testproject.dao.UserInfoMapper;
import com.testproject.entity.UserInfo;
import com.testproject.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//extends ServiceImpl<UserInfoMapper,UserInfo>
/**
 * @description:
 * @author: Administrator
 * @date: 2021/7/15
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper,UserInfo> implements IUserInfoService {


    /**
     *
     */
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void InsertUser(){
        userInfoMapper.InsertUser();
    }

    /**
     * @description: 
     * @author: Administrator
     * @date: 2021/7/15
     * @param null: 
     * @return: 
     */
    public void UpdateUser(){

    }
    
    /**
     * @description: 
     * @author: Administrator
     * @date: 2021/7/16
     * @param id
 * @param user
 * @param integer
     * @return: java.lang.String
     */
    public  String GetUserName(String id,String user,Integer integer){
        if(id=="1")
            return "lzl";
        else
            return "小气";
    }
}
