package com.nageoffer.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * 短链接分组响应数据传输对象
 */
@Data
public class ShortLinkGroupRespDTO {
    private String gid;
    private String name;
    private Integer sortOrder;
    private Integer shortLinkCount;
}
