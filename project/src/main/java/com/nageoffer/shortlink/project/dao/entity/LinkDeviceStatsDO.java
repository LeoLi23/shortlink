package com.nageoffer.shortlink.project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.nageoffer.shortlink.project.common.database.BaseDO;
import lombok.*;

/**
 * 短链接设备统计DO
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_link_device_stats")
public class LinkDeviceStatsDO extends BaseDO {
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
    private String date;
    /**
     * 访问量
     */
    private Integer cnt;
    /**
     * 访问设备
     */
    private String device;
}
