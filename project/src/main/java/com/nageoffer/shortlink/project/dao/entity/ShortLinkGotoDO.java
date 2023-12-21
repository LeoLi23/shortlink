package com.nageoffer.shortlink.project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.nageoffer.shortlink.project.common.database.BaseDO;
import lombok.*;

/**
 * 短链接跳转实体
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_link_goto")
public class ShortLinkGotoDO extends BaseDO {
    private Long id;
    private String gid;
    private String fullShortUrl;
}
