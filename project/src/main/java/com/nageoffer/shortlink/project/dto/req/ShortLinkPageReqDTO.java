package com.nageoffer.shortlink.project.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nageoffer.shortlink.project.dao.entity.ShortLinkDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 短链接分页请求参数
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ShortLinkPageReqDTO extends Page<ShortLinkDO> {
    private String gid;
    private String orderTag;
}
