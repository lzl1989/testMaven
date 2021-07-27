package com.testproject.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.testproject.dao.UserInfoMapper;
import com.testproject.entity.UserInfo;
import com.testproject.entity.UserInfoCustom;
import com.testproject.service.IUserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//extends ServiceImpl<UserInfoMapper,UserInfo>
@Service
@Slf4j
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

    @Override
    public String selectUserById(String userId) {
        String result= userInfoMapper.selectUserById(userId);
        log.info("结果："+result);
        return result;
    }

    @Override
    public List<UserInfo> SelectListUserByUserId(UserInfoCustom userInfoCustom) {
          List<UserInfo> list= userInfoMapper.SelectListUserByUserId(userInfoCustom);
          log.info("返回的实体集合:"+list.toString());
          return  list;
    }
}
