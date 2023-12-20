package com.nageoffer.shortlink.project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.nageoffer.shortlink.project.common.database.BaseDO;
import lombok.*;

import java.util.Date;

/**
 * 短链接网络统计DO
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_link_network_stats")
public class LinkNetworkStatsDO extends BaseDO {
    /**
     * ID
     */
    private Long id;
    /**
     * 完整短链接
     */
    private String fullShortUrl;
    /**
     * 分组标识
     */
    private String gid;
    /**
     * 日期
     */
    private Date date;
    /**
     * 访问量
     */
    private Integer cnt;
    /**
     * 访问网络
     */
    private String network;
}
