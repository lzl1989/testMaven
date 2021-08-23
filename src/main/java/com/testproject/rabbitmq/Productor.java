package com.testproject.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * 消息生产者
 */
@Component
@Slf4j
public class Productor {
    //消息队列
    private RabbitMqOperator rabbitMqOperator;

    @Autowired
    public Productor(RabbitMqOperator operator) {
        this.rabbitMqOperator = operator;
        Assert.notNull(this.rabbitMqOperator, "rabbitmq init fail.");
    }

    /**
     * 数据发送到rabbitMq
     */
    public void sendData() {
        byte[] data = new byte[11];
        // data[10] = ;
        //发送数据到first_queue队列
        rabbitMqOperator.push("first_queue" ,data);

        for (int i = 0; i < 100; i++){
            //发送数据到second_queue队列
            rabbitMqOperator.pushInt("second_queue",i);
            log.info("发送消费内容:{} 到消息队列:first_queue中",i);
        }
    }
}
