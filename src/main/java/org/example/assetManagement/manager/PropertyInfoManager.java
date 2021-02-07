package org.example.assetManagement.manager;

import org.example.assetManagement.entity.PropertyInfo;
import org.example.assetManagement.util.R;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

/**
 * @author After445
 * @date 2021/1/22 21:03
 */
public interface PropertyInfoManager {
    Page<PropertyInfo> findPage(int page, int size);

    Page<PropertyInfo> findPageByUserId(String userId, int page, int size, PropertyInfo propertyInfo);

    void update(PropertyInfo propertyInfo);

    void deleteById(Long id);

    R typeUpdateOrAdd(PropertyInfo propertyInfo);

    Map<String, List<Float>> findPropertyInfoChat(String userId);
}
