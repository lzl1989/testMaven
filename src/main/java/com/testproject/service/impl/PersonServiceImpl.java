package com.testproject.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.testproject.entity.EntityA;
import com.testproject.entity.User;
import com.testproject.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PersonServiceImpl implements IPersonService {
    @Override
    public void InsertPerson() {
        System.out.print("执行插入成功...");
    }

    @Override
    public void UserBuilder() {

        User user = User.builder()
                .userAge(32)
                .userName("lzl")
                .build();
        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user);
        List<User> userListNew = userList.stream().filter(x -> x.getUserName().equals("zl")).collect(Collectors.toList());
        if (null != userListNew && userListNew.size() > 0) {
            log.info("打印数据:" + userListNew.toString());
        } else {
            log.info("没有数据");
        }

    }

    @Override
    public void testFastJson() {

        List<Map<String, Object>> mapList = new ArrayList<>();
        List<EntityA> entityAList = new ArrayList<>();
        EntityA entityA = EntityA.builder().build();
        entityA.setName("lzl");
        entityA.setAge("18");
        entityAList.add(entityA);
        JSONObject.toJSONString("lzl");
        //把List转换成Map
        entityAList.forEach((x) -> {
            Map<String, Object> map = new HashMap<>();
            map = JSONObject.parseObject(JSONObject.toJSONString(x));
            mapList.add(map);
        });
        /**
         *
         */
        log.info("序列化的值={}", JSONObject.toJSONString(mapList));
        EntityA entityA1 = EntityA.builder()
                .name("lzl")
                .age("18")
                .build();
        log.info(entityA1.toString());
    }
}
