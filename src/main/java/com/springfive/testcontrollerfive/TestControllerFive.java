package com.springfive.testcontrollerfive;

import com.springfive.intf.IPersonInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerFive {

    @Autowired
    IPersonInfo iPersonInfo;

    @RequestMapping("/getPersonNameFive")
    public String getPersonNameFive(){
        iPersonInfo.getPersonName();
        return "getPersonName";
    }
}
