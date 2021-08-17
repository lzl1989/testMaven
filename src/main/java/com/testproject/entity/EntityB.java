package com.testproject.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EntityB implements Serializable {

    private String nameShort;
    private String codeShort;
    /**
     * 把时间类型的数据格式化 .前台接收到的是格式化的时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date   createTime;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone ="GMT+8" )
    private Date   shortTime;
}
