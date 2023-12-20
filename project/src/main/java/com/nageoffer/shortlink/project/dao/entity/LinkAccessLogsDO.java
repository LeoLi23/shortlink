package com.nageoffer.shortlink.project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.nageoffer.shortlink.project.common.database.BaseDO;
import lombok.*;

/**
 * 短链接访问日志
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_link_access_logs")
public class LinkAccessLogsDO extends BaseDO {
    /**
     * 完整短链接
     */
    private String fullShortUrl;
    /**
     * 分组标识
     */
    private String gid;
    /**
     * 用户信息
     */
    private String user;
    /**
     * 浏览器
     */
    private String browser;
    /**
     * 操作系统
     */
    private String os;
    /**
     * IP
     */
    private String ip;
    /**
     * 网络
     */
    private String network;
    /**
     * 设备
     */
    private String device;
    /**
     * 地区
     */
    private String locale;
}
