package com.testproject.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInfoCustom {

    private String id;
    private String name;
    private String age;
}
