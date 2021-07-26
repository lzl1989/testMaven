package com.testproject.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.testproject.dao.UserInfoMapper;
import com.testproject.entity.UserInfo;
import com.testproject.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//extends ServiceImpl<UserInfoMapper,UserInfo>
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
}
