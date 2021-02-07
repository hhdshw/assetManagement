package org.example.assetManagement.dao;

import org.example.assetManagement.entity.PolicyInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author After445
 * @date 2021/1/22 12:56
 */
public interface PolicyInfoDao extends JpaRepository<PolicyInfo, Long> {
}
