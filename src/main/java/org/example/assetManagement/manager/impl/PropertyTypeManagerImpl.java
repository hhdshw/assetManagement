package org.example.assetManagement.manager.impl;

import org.example.assetManagement.dao.PropertyTypeDao;
import org.example.assetManagement.entity.PropertyType;
import org.example.assetManagement.manager.PropertyTypeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author After445
 * @date 2021/1/24 16:54
 */
@Service
public class PropertyTypeManagerImpl implements PropertyTypeManager {

    @Autowired
    private PropertyTypeDao propertyTypeDao;

    @Override
    public Map<String, List<PropertyType>> findSelect() {
        Map<String, List<PropertyType>> resultMap = new HashMap<>();
        PropertyType propertyType = new PropertyType();
//        System.out.println(propertyType.getId());
        Example<PropertyType> example = Example.of(propertyType);

        propertyType.setPropertyTypeid("1");
        resultMap.put("1", propertyTypeDao.findAll(example));

        propertyType.setPropertyTypeid("2");
        resultMap.put("2", propertyTypeDao.findAll(example));

        propertyType.setPropertyTypeid("3");
        resultMap.put("3", propertyTypeDao.findAll(example));

        return resultMap;
    }

    @Override
    public List<PropertyType> findAll() {
        return propertyTypeDao.findAll();
    }
}
