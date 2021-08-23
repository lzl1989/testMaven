package com.testproject.testcontroller;


import com.testproject.common.ApiResponse;
import com.testproject.rabbitmq.Productor;
import com.testproject.rabbitmq.RabbitMqOperator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RabbitMQController {

    @Autowired
    private RabbitMqOperator rabbitMqOperator;

    @Autowired
    private Productor productor;


    @RequestMapping("/testRabbitMqMessage")
    public ApiResponse testRabbitMqMessage() {
//        rabbitMqOperator.firstQueue();
        productor.sendData();
        return new ApiResponse(200, "success");
    }

}
