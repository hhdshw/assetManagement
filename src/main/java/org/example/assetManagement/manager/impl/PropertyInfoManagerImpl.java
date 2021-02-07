package org.example.assetManagement.manager.impl;

import org.example.assetManagement.dao.PropertyInfoDao;
import org.example.assetManagement.entity.PropertyInfo;
import org.example.assetManagement.entity.UserInfo;
import org.example.assetManagement.manager.PropertyInfoManager;
import org.example.assetManagement.util.DateUtil;
import org.example.assetManagement.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
import javax.persistence.criteria.Predicate;

/**
 * @author After445
 * @date 2021/1/22 21:03
 */
@Service
public class PropertyInfoManagerImpl implements PropertyInfoManager {

    @Autowired
    private PropertyInfoDao propertyInfoDao;

    @Override
    public Page<PropertyInfo> findPage(int page, int size) {
        PageRequest request = PageRequest.of(page, size);
        return propertyInfoDao.findAll(request);
    }

    @Override
    public Page<PropertyInfo> findPageByUserId(String userId, int page, int size, PropertyInfo propertyInfo) {
        //条件
        PageRequest request = PageRequest.of(page, size);

        Specification<PropertyInfo> specification =(Root<PropertyInfo> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) -> {
            List<Predicate> conditions = new ArrayList<>();
            conditions.add(criteriaBuilder.equal(root.get("userId"),userId));
            //条件查询
            if (propertyInfo.getPropertyId() != null && propertyInfo.getPropertyId() != ""){
                conditions.add(criteriaBuilder.equal(root.get("propertyId"), propertyInfo.getPropertyId()));
            }
            if (propertyInfo.getPropertytypeId() != null && propertyInfo.getPropertytypeId() != ""){
                conditions.add(criteriaBuilder.equal(root.get("propertytypeId"), propertyInfo.getPropertytypeId()));
            }
            if (propertyInfo.getUpdateTime() != null && propertyInfo.getUpdateTime() != ""){
                conditions.add(criteriaBuilder.like(root.get("updateTime"),"%"+propertyInfo.getUpdateTime().substring(0,10)+"%"));
            }
            if (propertyInfo.getTypeDescId() != null && propertyInfo.getTypeDescId() != ""){
                conditions.add(criteriaBuilder.equal(root.get("typeDescId"), propertyInfo.getTypeDescId()));
            }

            Predicate[] andPredicate = new Predicate[conditions.size()];
            return criteriaBuilder.and(conditions.toArray(andPredicate));
        };
        return propertyInfoDao.findAll(specification, request);

    }

    @Override
    public void update(PropertyInfo propertyInfo) {
        propertyInfoDao.save(propertyInfo);
    }

    @Override
    public void deleteById(Long id) {
        propertyInfoDao.deleteById(id);
    }

    @Override
    public R typeUpdateOrAdd(PropertyInfo propertyInfo) {
        try {
            //更新时间
            propertyInfo.setUpdateTime(DateUtil.formatCurrentDateTime());
            if (propertyInfo.getCreateTime() == null){
                propertyInfo.setCreateTime(DateUtil.formatCurrentDateTime());
                propertyInfoDao.save(propertyInfo);
                return R.success("新增成功");
            } else {
                propertyInfoDao.save(propertyInfo);
                return R.success("修改成功");
            }
        } catch (Exception e){
            return R.error("系统错误");
        }
    }

    @Override
    public Map<String, List<Float>> findPropertyInfoChat(String userId) {
        Map<String, List<Float>> resultMap = new HashMap<>();
        int shejiaoNum = findOnesPropertyInfoNum(userId, "1");
        int licaiNum = findOnesPropertyInfoNum(userId,"2");
        int yuleNum = findOnesPropertyInfoNum(userId, "3");

        //存放
        float num = shejiaoNum + licaiNum + yuleNum;
        //社交
        List<Float> shejiaoList = new ArrayList<>();
        shejiaoList.add((float)shejiaoNum);
        shejiaoList.add(new BigDecimal(shejiaoNum/num*100.00).setScale(1, BigDecimal.ROUND_HALF_UP).floatValue());
        resultMap.put("1",shejiaoList);
        //理财
        List<Float> licaiList = new ArrayList<>();
        licaiList.add((float)licaiNum);
        licaiList.add(new BigDecimal(licaiNum/num*100.00).setScale(1, BigDecimal.ROUND_HALF_UP).floatValue());
        resultMap.put("2", licaiList);
        //娱乐
        List<Float> yuleList = new ArrayList<>();
        yuleList.add((float)yuleNum);
        yuleList.add(new BigDecimal(yuleNum/num*100.00).setScale(1, BigDecimal.ROUND_HALF_UP).floatValue());
        resultMap.put("3", yuleList);
        return resultMap;
    }

    public int findOnesPropertyInfoNum(String userId, String propertytypeId){
        return propertyInfoDao.countByUserIdAndPropertytypeId(userId, propertytypeId);
    }
}
