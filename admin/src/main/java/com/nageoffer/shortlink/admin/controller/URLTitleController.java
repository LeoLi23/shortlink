package com.nageoffer.shortlink.admin.controller;

import com.nageoffer.shortlink.admin.common.convention.result.Result;
import com.nageoffer.shortlink.admin.remote.dto.ShortLinkRemoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * URL标题控制层
 */
@RestController
@RequiredArgsConstructor
public class URLTitleController {
    ShortLinkRemoteService shortLinkRemoteService = new ShortLinkRemoteService(){};
    /**
     * 根据URL获取标题
     * @param url String
     * @return Result<String>
     */
    @GetMapping("/api/short-link/admin/v1/title")
    public Result<String> getTitleByURL(@RequestParam("url") String url) {
        return shortLinkRemoteService.getTitleByURL(url);
    }
}
