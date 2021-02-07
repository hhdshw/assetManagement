package org.example.assetManagement.controller;

import org.example.assetManagement.entity.NewsInfo;
import org.example.assetManagement.manager.NewsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author After445
 * @date 2021/1/21 20:39
 */
@RestController
@RequestMapping("/newsInfo")
public class NewsController {

    @Autowired
    private NewsManager newsManager;

    @GetMapping("/findFirstPage")
    public Page<NewsInfo> findFirstPage(){
        return newsManager.findPage(0, 5);
    }

}
