package com.testproject.rabbitmq;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.testproject.entity.EntityMQ;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;


/**
 * 消费者
 * 注意RabbltMQ的后台服务器的用户权限问题。
 * Admin 中的Can Access virtual hosts 必须是/ .有权限访问。
 * <p>
 * 一定要先启动生产者。再启动消费者，这样消费者就可以监听到消息队列的消息了。（不一定）
 *
 * @RabbitListener: 如果注解标注在类上，则执行用RabbitHandler标注得方法进行监听。
 * @RabbitHandler : 所以这个注解跟@RabbitListener 标注的地方有关系。
 */


@Component
@Slf4j
public class Consumer {

    /**
     * @param message
     * @RabbitHandler 指定消息的处理方法
     */
    @RabbitListener(queues = "first_queue")
//    @RabbitHandler
    public void processFirst(String message) {
        //接收first_queue队列消息
        log.info("接收的消息为: {}", message);
    }

    @RabbitListener(queues = "second_queue")
//    @RabbitHandler
    public void processSecond(String message) {
        //接收second_queue队列消息
        log.info("2接收的消息为: {}", message);
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "third_queue", durable = "true"),
            exchange = @Exchange(value = "amq.direct")
            ))
    // @RabbitHandler
    public void processThird(String message) {
          if(!StringUtils.isEmpty(message)){
              EntityMQ entityMQ=JSONObject.parseObject(message,EntityMQ.class);
              log.info("第三个监听 接收到的消息:{}",entityMQ);
          }
    }
}
