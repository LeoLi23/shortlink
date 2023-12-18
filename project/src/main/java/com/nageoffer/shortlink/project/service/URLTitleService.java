package com.nageoffer.shortlink.project.service;

/**
 * URL标题接口层
 */
public interface URLTitleService {
    /**
     * 根据URL获取标题
     * @param url String
     * @return String
     */
    String getTitleByURL(String url);
}
