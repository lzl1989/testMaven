package com.springfive.impl;

import com.springfive.intf.IPersonInfo;

public class PersonInfoImpl implements IPersonInfo {
    @Override
    public void getPersonName() {
        System.out.print("这是基于bean配置文件的");
    }
}
