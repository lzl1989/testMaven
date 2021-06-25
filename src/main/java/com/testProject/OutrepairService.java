package com.testProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OutrepairService {

    @RequestMapping("/getNumber")
    public String getOutrepairNumber(){
        return "No.1";
    }

}
