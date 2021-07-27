package com.testproject.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("testtype")
public class UserInfo {

    /**
     * 主键ID
     */
    @TableId(value = "id")
    private String id;
    @TableField("type")
    private String type;
    @TableField("name")
    private String name;
    @TableField("age")
    private String age;
    @TableField("havemoney")
    private BigDecimal havemoney;
}
