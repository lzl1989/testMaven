package com.testProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
/*@ComponentScan 注解用来定义扫包的范围，然后把包放到springMVC容器当中*/
@ComponentScan("com.testProject")
public class HelloworldService {

    @RequestMapping("/getUser")
    public  String getUser(){
        return "Hello World by lzl";
    }

    public static void  main(String[] args){

        SpringApplication.run(HelloworldService.class,args);
    }
}
