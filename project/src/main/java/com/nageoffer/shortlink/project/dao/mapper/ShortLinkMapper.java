package com.nageoffer.shortlink.project.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nageoffer.shortlink.project.dao.entity.ShortLinkDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * 短链接分组 Mapper 接口
 */
public interface ShortLinkMapper extends BaseMapper<ShortLinkDO> {
    /**
     * 增加短链接访问统计
     *
     * @param gid            分组标识
     * @param fullShortUrl   完整短链接
     * @param totalPv        总访问量
     * @param totalUv        总访客数
     * @param totalUip       总独立ip数
     */
    @Update("update t_link set total_pv = total_pv + #{totalPv}, total_uv = total_uv + #{totalUv}, total_uip = total_uip + #{totalUip}" +
            " where gid = #{gid} and full_short_url = #{fullShortUrl}")
    void incrementStats(@Param("gid") String gid,
                        @Param("fullShortUrl") String fullShortUrl,
                        @Param("totalPv") Integer totalPv,
                        @Param("totalUv") Integer totalUv,
                        @Param("totalUip") Integer totalUip);
}
