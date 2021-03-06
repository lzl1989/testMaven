package com;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@Slf4j
//开始定时器
//@EnableScheduling
//@EnableAsync
/**
 *  Mapper扫包，也可以在每个mapper类上加上mapper注解
 */
@MapperScan("com.**.dao")
@EnableRabbit
public class App {

    public static void  main(String[] args){
        SpringApplication.run(App.class);
        log.info("TestMaven is Success!!!");
    }

}
