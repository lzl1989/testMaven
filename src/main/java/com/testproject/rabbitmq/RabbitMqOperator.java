package com.testproject.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqOperator {

    private AmqpTemplate amqpTemplate;

    @Autowired
    public RabbitMqOperator(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    /**
     * 异步发送字节数组到rabbitmq
     *
     * @param data
     */
    public void push(String routingKey, byte[] data) {
        amqpTemplate.convertAndSend(routingKey, data);
    }


    /**
     * 异步发送int类型消息到rabbitmq
     *
     * @param data
     */
    public void pushInt(String routingKey, int data) {
        amqpTemplate.convertAndSend(routingKey, data);
    }

    /**
     * 定义一个名为：first_queue 的队列
     *
     * @return
     */
    @Bean
    public Queue firstQueue() {
        return new Queue("first_queue");
    }

    /**
     * 定义一个名为：second_queue 的队列
     *
     * @return
     */
    @Bean
    public Queue secondQueue() {
        return new Queue("second_queue");
    }
}
