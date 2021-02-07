package org.example.assetManagement.manager.impl;

import org.example.assetManagement.dao.NewsInfoDao;
import org.example.assetManagement.entity.NewsInfo;
import org.example.assetManagement.manager.NewsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @author After445
 * @date 2021/1/21 20:42
 */
@Service
public class NewsManagerImpl implements NewsManager {

    @Autowired
    private NewsInfoDao newsInfoDao;


    @Override
    public Page<NewsInfo> findPage(int page, int size) {
        PageRequest request = PageRequest.of(page, size);
        return newsInfoDao.findAll(request);
    }
}
