package com.testproject.entityreq;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestAssertReq  implements Serializable {

    private String name;

    /**
     * 规范命名
     */
    private String nameShort;
    /**
     * 命名不规范的话，前台的json无法反序列化。都是null
     */
    @JsonProperty("NameLong")
    private String NameLong;
}
