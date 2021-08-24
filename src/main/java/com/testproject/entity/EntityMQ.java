package com.testproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * MQ传输消息实体
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EntityMQ implements Serializable {

    private String NameMQ;
    private String CodeMQ;
    private Integer IndexMQ;
    private String MsgMQ;
}
