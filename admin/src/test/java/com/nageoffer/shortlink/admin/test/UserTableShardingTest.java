package com.nageoffer.shortlink.admin.test;

/**
 * create table t_group
 * (
 *     id          bigint auto_increment comment 'ID'
 *         primary key,
 *     gid         varchar(32)  null comment '分组标识',
 *     name        varchar(64)  null comment '分组名称',
 *     username    varchar(256) null comment '创建分组用户名',
 *     sort_order  int          null comment '分组排序',
 *     create_time datetime     null comment '创建时间',
 *     update_time datetime     null comment '修改时间',
 *     del_flag    tinyint(1)   null comment '删除标识',
 *     constraint idx_unique_username_gid
 *         unique (gid, username)
 * );
 */
public class UserTableShardingTest {
    public static final String SQL = "CREATE TABLE `t_group_%d` (\n" +
            "  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',\n" +
            "  `gid` varchar(32) DEFAULT NULL COMMENT '分组标识',\n" +
            "  `name` varchar(64) DEFAULT NULL COMMENT '分组名称',\n" +
            "  `username` varchar(256) DEFAULT NULL COMMENT '创建分组用户名',\n" +
            "  `sort_order` int(11) DEFAULT NULL COMMENT '分组排序',\n" +
            "  `create_time` datetime DEFAULT NULL COMMENT '创建时间',\n" +
            "  `update_time` datetime DEFAULT NULL COMMENT '修改时间',\n" +
            "  `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识',\n" +
            "  PRIMARY KEY (`id`),\n" +
            "  UNIQUE KEY `idx_unique_username_gid` (`gid`,`username`)\n" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.printf((SQL) + "%n", i);
        }
    }
}
