package org.example.assetManagement.dao;

import org.example.assetManagement.entity.NewsInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author After445
 * @date 2021/1/21 20:33
 */
public interface NewsInfoDao extends JpaRepository<NewsInfo, Integer> {

}
