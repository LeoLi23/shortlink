package com.nageoffer.shortlink.project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * 短链接地区统计实体
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_link_locale_stats")
public class LinkLocaleStatsDO {
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
     * 省份名称
     */
    private String province;
    /**
     * 市名称
     */
    private String city;
    /**
     * 城市编码
     */
    private String adcode;
    /**
     * 国家标识
     */
    private String country;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改时间
     */
    private String updateTime;
    /**
     * 删除标识 0表示删除 1表示未删除
     */
    private Integer delFlag;

}
