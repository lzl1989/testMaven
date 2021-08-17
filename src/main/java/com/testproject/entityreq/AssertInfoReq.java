package com.testproject.entityreq;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AssertInfoReq implements Serializable {

    /**
     * @JsonProperty注解来实现强制要求接受字段，如：
     */
    @JsonProperty("name")
    private String Name;

    @JsonProperty("NameShort")
    private String NameShort;

    private String addressHost;

    private String age;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
//    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date startTime;

}
