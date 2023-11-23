package com.nageoffer.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 短链接分组更新请求数据传输对象
 */
@Data
public class ShortLinkGroupUpdateReqDTO {
    private String gid;
    private String name;
}
