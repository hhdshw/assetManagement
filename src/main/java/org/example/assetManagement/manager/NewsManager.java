package org.example.assetManagement.manager;

import org.example.assetManagement.entity.NewsInfo;
import org.springframework.data.domain.Page;

/**
 * @author After445
 * @date 2021/1/21 20:41
 */
public interface NewsManager {

    Page<NewsInfo> findPage(int page, int size);
}
