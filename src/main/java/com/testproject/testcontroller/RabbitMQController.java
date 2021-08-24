package com.testproject.testcontroller;


import com.testproject.common.ApiResponse;
import com.testproject.rabbitmq.Productor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RabbitMQController {


    @Autowired
    private Productor productor;


    /**
     * 测试发送MQ消息
     * @return
     */
    @RequestMapping("/testRabbitMqMessage")
    public ApiResponse testRabbitMqMessage() {
        log.info("******************开始发送MQ消息*****************");
        productor.sendData();
        log.info("******************结束发送MQ消息*****************");
        return new ApiResponse(200, "success");
    }

}
