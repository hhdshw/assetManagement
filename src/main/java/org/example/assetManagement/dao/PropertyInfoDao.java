package org.example.assetManagement.dao;

import org.example.assetManagement.entity.PropertyInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

/**
 * @author After445
 * @date 2021/1/22 21:05
 */
public interface PropertyInfoDao extends JpaRepository<PropertyInfo, Long>, JpaSpecificationExecutor<PropertyInfo> {

    int countByUserIdAndPropertytypeId(String userId, String propertytypeId);
}
