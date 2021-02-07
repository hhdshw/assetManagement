package org.example.assetManagement.controller;

import org.example.assetManagement.entity.PropertyInfo;
import org.example.assetManagement.manager.PropertyInfoManager;
import org.example.assetManagement.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author After445
 * @date 2021/1/20 21:03
 */
@RestController
@RequestMapping("/propertyInfo")
public class PropertyInfoController {

    @Autowired
    private PropertyInfoManager propertyInfoManager;

    @RequestMapping("/findOnesPage/{userId}/{page}/{size}")
    public Page<PropertyInfo> findOnesPage(@PathVariable("userId") String userId, @PathVariable("page") int page
            , @PathVariable("size") int size, @RequestBody PropertyInfo propertyInfo ){
        return propertyInfoManager.findPageByUserId(userId, page, size, propertyInfo);
    }

    @RequestMapping("/update")
    public R update(@RequestBody PropertyInfo propertyInfo){
        try {
            propertyInfoManager.update(propertyInfo);
            return R.success("修改成功");
        } catch (Exception e){
            return R.error(500,"系统错误");
        }
    }

    @RequestMapping("/deleteById/{id}")
    public R deleteById(@PathVariable("id") Long id){
        try {
            propertyInfoManager.deleteById(id);
            return R.success("删除成功!");
        } catch (Exception e){
            return R.error(500,"系统错误!");
        }
    }

    @RequestMapping("/typeUpdateOrAdd")
    public R typeUpdateOrAdd(@RequestBody PropertyInfo propertyInfo){
        return propertyInfoManager.typeUpdateOrAdd(propertyInfo);
    }

    @RequestMapping("/findPropertyInfoChat/{userId}")
    public Map<String, List<Float>> findPropertyInfoChat(@PathVariable("userId") String userId){
        return propertyInfoManager.findPropertyInfoChat(userId);
    }
}
