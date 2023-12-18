package com.nageoffer.shortlink.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 短链接跳转404控制器
 */
@Controller
public class ShortLinkNotFoundController {
    /**
     * 短链接跳转404
     * @return String
     */
    @RequestMapping("/page/notfound")
    public String notFound() {
        return "notfound";
    }
}
