package com.nageoffer.shortlink.project.test;

/**
 create table t_link_stats_today
 (
 id             bigint auto_increment comment 'ID'
 primary key,
 gid            varchar(32) default 'default' null comment '分组标识',
 full_short_url varchar(128)                  null comment '短链接',
 date           date                          null comment '日期',
 today_pv       int         default 0         null comment '今日PV',
 today_uv       int         default 0         null comment '今日UV',
 today_uip      int         default 0         null comment '今日IP数',
 create_time    datetime                      null comment '创建时间',
 update_time    datetime                      null comment '修改时间',
 del_flag       tinyint(1)                    null comment '删除标识 0：未删除 1：已删除',
 constraint `idx_unique_full-short-url`
 unique (full_short_url)
 )
 charset = utf8mb4;
 */
public class UserTableShardingTest {
    public static final String SQL = "CREATE TABLE `t_link_%d` (\n" +
            "  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',\n" +
            "  `domain` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '域名',\n" +
            "  `short_uri` varchar(8) COLLATE utf8_bin DEFAULT NULL COMMENT '短链接',\n" +
            "  `full_short_url` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '完整短链接',\n" +
            "  `origin_url` varchar(1024) COLLATE utf8_bin DEFAULT NULL COMMENT '原始链接',\n" +
            "  `click_num` int(11) DEFAULT '0' COMMENT '点击量',\n" +
            "  `gid` varchar(32) COLLATE utf8_bin DEFAULT 'default' COMMENT '分组标识',\n" +
            "  `favicon` varchar(256) COLLATE utf8_bin DEFAULT NULL COMMENT '网站图标',\n" +
            "  `enable_status` tinyint(1) DEFAULT NULL COMMENT '启用标识 0：未启用 1：已启用',\n" +
            "  `created_type` tinyint(1) DEFAULT NULL COMMENT '创建类型 0：控制台 1：接口',\n" +
            "  `valid_date_type` tinyint(1) DEFAULT NULL COMMENT '有效期类型 0：永久有效 1：用户自定义',\n" +
            "  `valid_date` datetime DEFAULT NULL COMMENT '有效期',\n" +
            "  `describe` varchar(1024) COLLATE utf8_bin DEFAULT NULL COMMENT '描述',\n" +
            "  `total_uv` int(11) DEFAULT NULL COMMENT '历史UV',\n" +
            "  `total_pv` int(11) DEFAULT NULL COMMENT '历史PV',\n" +
            "  `total_uip` int(11) DEFAULT NULL COMMENT '历史UIP',\n" +
            "  `create_time` datetime DEFAULT NULL COMMENT '创建时间',\n" +
            "  `update_time` datetime DEFAULT NULL COMMENT '修改时间',\n" +
            "  `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识 0：未删除 1：已删除',\n" +
            "  PRIMARY KEY (`id`),\n" + "  UNIQUE KEY `idx_unique_full_short_url` (`full_short_url`)\n" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='短链接表';";
    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.printf((SQL) + "%n", i);
        }
    }
}
