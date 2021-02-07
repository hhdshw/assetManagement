package org.example.assetManagement.dao;

import org.example.assetManagement.entity.PropertyType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author After445
 * @date 2021/1/24 16:56
 */
public interface PropertyTypeDao extends JpaRepository<PropertyType, Long> {
}
