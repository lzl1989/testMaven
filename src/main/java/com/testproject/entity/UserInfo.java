package com.testproject.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("testtype")
public class UserInfo {

    /**
     * 主键ID
     */
    @TableId(value="id")
    private String sId;
    @TableField("type")
    private String type;
}
