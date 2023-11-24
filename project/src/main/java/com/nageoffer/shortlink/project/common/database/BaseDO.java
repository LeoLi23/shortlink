package com.nageoffer.shortlink.project.common.database;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * 数据库基础持久层实体
 */
@Data
public class BaseDO {
    @TableField(fill = FieldFill.INSERT)
    private java.util.Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private java.util.Date updateTime;

    @TableField(fill = FieldFill.INSERT)
    private Integer delFlag;
}
