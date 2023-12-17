package com.nageoffer.shortlink.project.test;

/**
 create table t_link_goto
 (
 id             bigint auto_increment comment 'ID',
 full_short_url varchar(128)                null comment '完整短链接',
 gid            varchar(32) default default null comment '分组标识',
 constraint t_link_goto_pk
 primary key (id)
 );
 */
public class UserTableShardingTest {
    public static final String SQL = "CREATE TABLE `t_link_goto_%d` (\n" +
            "  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',\n" +
            "  `full_short_url` varchar(128) DEFAULT NULL COMMENT '完整短链接',\n" +
            "  `gid` varchar(32) DEFAULT NULL COMMENT '分组标识',\n" +
            "  PRIMARY KEY (`id`)\n" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";
    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.printf((SQL) + "%n", i);
        }
    }
}
