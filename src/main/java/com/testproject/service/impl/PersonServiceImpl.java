package com.testproject.service.impl;

import com.testproject.entity.User;
import com.testproject.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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

       User user= User.builder()
                .userAge(32)
                .userName("lzl")
                .build();
       List<User> userList=new ArrayList<>();
       userList.add(user);
       userList.add(user);
      List<User> userListNew=  userList.stream().filter(x->x.getUserName().equals("zl")).collect(Collectors.toList());
      if(null!=userListNew&&userListNew.size()>0){
          log.info("打印数据:"+userListNew.toString());
      }
      else {
          log.info("没有数据");
      }

    }
}
