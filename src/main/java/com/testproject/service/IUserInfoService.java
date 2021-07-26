package com.testproject.service;

import com.baomidou.mybatisplus.service.IService;
import com.testproject.entity.UserInfo;

public interface IUserInfoService extends IService<UserInfo> {
    void  InsertUser();
}
