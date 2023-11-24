package com.nageoffer.shortlink.project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
/**
 * 短链接分组实体类
 */
@Data
@TableName("t_link")
public class ShortLinkDO {
    /**
     * ID
     */
    private Long id;

    /**
     * 域名
     */
    private String domain;

    /**
     * 短链接
     */
    private String shortUri;

    /**
     * 完整短链接
     */
    private String fullShortUrl;

    /**
     * 原始链接
     */
    private String originUrl;

    /**
     * 点击量
     */
    private Integer clickNum;

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 启用标识 0：未启用 1：已启用
     */
    private Boolean enableStatus;

    /**
     * 创建类型 0：控制台 1：接口
     */
    private Boolean createdType;

    /**
     * 有效期类型 0：永久有效 1：用户自定义
     */
    private Boolean validDateType;

    /**
     * 有效期
     */
    private String validDate;

    /**
     * 描述
     */
    private String describe;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 删除标识 0：未删除 1：已删除
     */
    private Boolean delFlag;
}
