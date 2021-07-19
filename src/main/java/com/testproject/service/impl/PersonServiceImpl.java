package com.testproject.service.impl;

import com.testproject.service.IPersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements IPersonService {
    @Override
    public void InsertPerson() {
        System.out.print("执行插入成功...");
    }
}
