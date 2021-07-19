package com.testproject.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Slf4j
public class ScheduledTask {

    /**
     * 定时注解。同时在app.java启动类中加上 @EnableScheduling 这个注解
     */
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    private void runTask(){
        log.info(df.format(new Date())+" 定时执行");
    }

}
