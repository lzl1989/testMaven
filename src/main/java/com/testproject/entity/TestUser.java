package com.testproject.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
/**
 * 把配置文件中的testuser信息读取到实体类中的属性当中。
 */
@ConfigurationProperties(prefix ="testuser")
@Data
public class TestUser {
    private String name;
    private String age;
    private String address;
}
