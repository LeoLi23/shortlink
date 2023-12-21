package com.nageoffer.shortlink.project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.nageoffer.shortlink.project.common.database.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 短链接今日统计
 * 公众号：马丁玩编程，回复：加群，添加马哥微信（备注：link）获取项目资料
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_link_stats_today")
public class LinkStatsTodayDO extends BaseDO {
        /**
         * ID
         */
        private Long id;

        /**
        * 分组标识
        */
        private String gid;

        /**
        * 完整短链接
        */
        private String fullShortUrl;

        /**
        * 日期
        */
        private Date date;

        /**
        * 今日PV
        */
        private Integer todayPv;

        /**
        * 今日UV
        */
        private Integer todayUv;

        /**
        * 今日IP数
        */
        private Integer todayUip;
}