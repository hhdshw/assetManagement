package org.example.assetManagement.manager;

import org.example.assetManagement.entity.PropertyType;

import java.util.List;
import java.util.Map;

/**
 * @author After445
 * @date 2021/1/24 16:54
 */
public interface PropertyTypeManager {
    Map<String, List<PropertyType>> findSelect();

    List<PropertyType> findAll();

}
