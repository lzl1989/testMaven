package com.testproject.common;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse  implements Serializable {
    /**
     * 返回码
     */
    private int statusCode;
    /**
     * 返回信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private Object data;
}
