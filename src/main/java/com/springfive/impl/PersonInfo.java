package com.springfive.impl;


import com.springfive.intf.IPersonInfo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonInfo implements IPersonInfo
{

    public String personName;
    public String personId;
    @Override
    public void getPersonName() {
        log.info("---这是基于配置文件的Java Bean---");
    }
}
