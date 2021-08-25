package com.testproject.rabbitmq;

import com.alibaba.fastjson.JSONObject;
import com.testproject.entity.EntityMQ;
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

    /**
     * @param operator
     */
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
        //发送数据到first_queue列队中
        rabbitMqOperator.pushByte("first_queue", data);
        log.info("发送byte类型消息内容:{} 到消息队列first_queue中", data);
        for (int i = 0; i < 10; i++) {
            //发送数据到second_queue队列
            rabbitMqOperator.pushInt("second_queue", i);
            log.info("发送int类型消费内容:{} 到消息队列:first_queue中", i);
        }
        //发送实体数据
        EntityMQ entityMQ = EntityMQ.builder().build();
        entityMQ.setNameMQ("MQ名称");
        entityMQ.setCodeMQ("MQ编码");
        entityMQ.setIndexMQ(1);
        entityMQ.setMsgMQ("赶紧去处理MQ消息");
        rabbitMqOperator.pushObject("first_queue", JSONObject.toJSONString(entityMQ));
    }

    /**
     *
     * @param obj
     * @return
     */
    public String sendDataObject(Object obj) {
        return "";
    }
}
