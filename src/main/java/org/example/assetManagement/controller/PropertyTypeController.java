package org.example.assetManagement.controller;

import org.example.assetManagement.entity.PropertyType;
import org.example.assetManagement.manager.PropertyTypeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author After445
 * @date 2021/1/20 16:53
 */
@RestController
@RequestMapping("/propertyType")
public class PropertyTypeController {

    @Autowired
    private PropertyTypeManager propertyTypeManager;

    @RequestMapping("/findSelect")
    private Map<String, List<PropertyType>> findSelect(){
        return propertyTypeManager.findSelect();
    }

    @RequestMapping("/findAll")
    public List<PropertyType> findAll(){
        return propertyTypeManager.findAll();
    }
}
