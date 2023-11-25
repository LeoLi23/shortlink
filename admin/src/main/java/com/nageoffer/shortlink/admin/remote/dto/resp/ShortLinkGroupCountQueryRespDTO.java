package com.nageoffer.shortlink.admin.remote.dto.resp;

import lombok.Data;

/**
 * 短链接分组查询返回
 */
@Data
public class ShortLinkGroupCountQueryRespDTO {
    private String gid;
    private Integer shortLinkCount;
}
