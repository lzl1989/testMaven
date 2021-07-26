package com.springfive.impl;

import com.springfive.intf.IPersonInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service()
public class PersonInfoAno implements IPersonInfo {
    @Override
    public void getPersonName() {
        log.info("---这是基于注解的Java Bean---");
    }

}
