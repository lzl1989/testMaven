package com.testproject.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.testproject.entity.UserInfo;

public interface UserInfoMapper extends BaseMapper<UserInfo> {

   void InsertUser();
}
