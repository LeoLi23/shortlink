package com.nageoffer.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 短链接分组持久层实体
 */
@Data
@TableName("t_group")
public class GroupDO {
    private Long id;
    private String gid;
    private String name;
    private String username;
    private java.util.Date createTime;
    private java.util.Date updateTime;
    private Integer delFlag;
}
