package com.testproject.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class EntityA {

    private String name;
    private String code;
    private String age;
}
