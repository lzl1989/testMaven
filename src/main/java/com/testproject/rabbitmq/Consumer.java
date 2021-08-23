package com.testproject.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * 消费者
 * 注意RabbltMQ的后台服务器的用户权限问题。
 * Admin 中的Can Access virtual hosts 必须是/ .有权限访问。
 *
 * 一定要先启动生产者。再启动消费者，这样消费者就可以监听到消息队列的消息了。（不一定）
 */

@Component
@Slf4j
public class Consumer {

    /**
     * @RabbitHandler 指定消息的处理方法
     * @param message
     */
    @RabbitListener(queues = "first_queue")
    @RabbitHandler
    public void process(String message) {
        //接收first_queue队列消息
        log.info("接收的消息为: {}", message);
    }

    @RabbitListener(queues = "second_queue")
    @RabbitHandler
    public void process1(String message) {
        //接收second_queue队列消息
        log.info("2接收的消息为: {}", message);
    }
}
