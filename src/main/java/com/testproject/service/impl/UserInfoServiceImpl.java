package com.testproject.service.impl;

import com.testproject.dao.UserInfoMapper;
import com.testproject.entity.EntityA;
import com.testproject.entity.EntityB;
import com.testproject.entity.UserInfo;
import com.testproject.entity.UserInfoCustom;
import com.testproject.service.IUserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

//extends ServiceImpl<UserInfoMapper,UserInfo>
@Service
@Slf4j
public class UserInfoServiceImpl implements IUserInfoService {


    /**
     *
     */
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void InsertUser() {
        userInfoMapper.InsertUser();
    }

    @Override
    public String selectUserById(String userId) {
        String result = userInfoMapper.selectUserById(userId);
        log.info("结果：" + result);
        return result;
    }

    @Override
    public List<UserInfo> SelectListUserByUserId(UserInfoCustom userInfoCustom) {
        List<UserInfo> list = userInfoMapper.SelectListUserByUserId(userInfoCustom);
        log.info("返回的实体集合:" + list.toString());
        return list;
    }

    /**
     * 直接把一种集合转换成另一种集合的方法
     * 用函数式接口。map()
     *
     * @param entityAList
     * @return
     */
    @Override
    public List<EntityB> ListEntityAConvertEntityB(List<EntityA> entityAList) {

        //转换实体
        List<EntityB> entityBList;
        entityBList = entityAList.stream().map (x ->
           EntityB.builder().CodeShort(x.getCode())
                    .NameShort(x.getName()).build()
        ).collect(Collectors.toList());
        log.info("输出集合数据：" + entityBList.toString());
        //筛选结果
        List list= entityAList.stream().filter(x->x.getName().equals("lzl")).collect(Collectors.toList());
        log.info("筛选出的结果:"+list.toString());
        /**
         *
         *查看源码
         */
        for (EntityA a : entityAList) {
            EntityA entityA = entityAList.stream().findAny().get();
            log.info("findAny输出的数据:"+entityAList.indexOf(a) + entityA.toString());
        }
        return entityBList;
    }

    @Override
    public void CodeFunctionInterface() {

    }
}
