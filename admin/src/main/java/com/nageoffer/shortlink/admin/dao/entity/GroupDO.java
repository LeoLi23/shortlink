package com.nageoffer.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.nageoffer.shortlink.admin.common.database.BaseDO;
import lombok.*;

/**
 * 短链接分组持久层实体
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_group")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GroupDO extends BaseDO {
    private Long id;
    private String gid;
    private String name;
    private String username;
    private Integer sortOrder;
}
