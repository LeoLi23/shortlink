package com.nageoffer.shortlink.project.test;

/**
 create table t_link_0
 (
 id              bigint auto_increment comment 'ID'
 primary key,
 domain          varchar(128)                  null comment '域名',
 short_uri       varchar(8) collate utf8_bin   null comment '短链接',
 full_short_url  varchar(128)                  null comment '完整短链接',
 origin_url      varchar(1024)                 null comment '原始链接',
 click_num       int         default 0         null comment '点击量',
 gid             varchar(32) default 'default' null comment '分组标识',
 enable_status   tinyint(1)                    null comment '启用标识 0：未启用 1：已启用',
 created_type    tinyint(1)                    null comment '创建类型 0：控制台 1：接口',
 valid_date_type tinyint(1)                    null comment '有效期类型 0：永久有效 1：用户自定义',
 valid_date      datetime                      null comment '有效期',
 `describe`      varchar(1024)                 null comment '描述',
 create_time     datetime                      null comment '创建时间',
 update_time     datetime                      null comment '修改时间',
 del_flag        tinyint(1)                    null comment '删除标识 0：未删除 1：已删除',
 favicon         varchar(256)                  null comment '网站图标',
 constraint idx_unique_full_short_uri
 unique (full_short_url)
 );
 */
public class UserTableShardingTest {
    public static final String SQL = "create table t_link_%d\n" +
            "(\n" +
            "    id              bigint auto_increment comment 'ID' primary key,\n" +
            "    domain          varchar(128)                  null comment '域名',\n" +
            "    short_uri       varchar(8) collate utf8_bin   null comment '短链接',\n" +
            "    full_short_url  varchar(128)                  null comment '完整短链接',\n" +
            "    origin_url      varchar(1024)                 null comment '原始链接',\n" +
            "    click_num       int         default 0         null comment '点击量',\n" +
            "    gid             varchar(32) default 'default' null comment '分组标识',\n" +
            "    favicon         varchar(256)                  null comment '网站图标',\n" +
            "    enable_status   tinyint(1)                    null comment '启用标识 0：未启用 1：已启用',\n" +
            "    created_type    tinyint(1)                    null comment '创建类型 0：控制台 1：接口',\n" +
            "    valid_date_type tinyint(1)                    null comment '有效期类型 0：永久有效 1：用户自定义',\n" +
            "    valid_date      datetime                      null comment '有效期',\n" +
            "    `describe`      varchar(1024)                 null comment '描述',\n" +
            "    create_time     datetime                      null comment '创建时间',\n" +
            "    update_time     datetime                      null comment '修改时间',\n" +
            "    del_flag        tinyint(1)                    null comment '删除标识 0：未删除 1：已删除',\n" +
            "    constraint idx_unique_full_short_uri\n" +
            "        unique (full_short_url)\n" +
            ");";
    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.printf((SQL) + "%n", i);
        }
    }
}
