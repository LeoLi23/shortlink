package com.nageoffer.shortlink.project.service.impl;

import com.nageoffer.shortlink.project.service.URLTitleService;
import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

/**
 * URL标题接口实现层
 */
@Service
public class URLTitleServiceImpl implements URLTitleService {
    /**
     * 根据URL获取标题
     * @param url String
     * @return String
     */
    @SneakyThrows
    @Override
    public String getTitleByURL(String url) {
        Document doc = Jsoup.connect(url).get();
        String title = doc.title();
        return title.isEmpty() ? "Error fetching title" : title;
    }
}
