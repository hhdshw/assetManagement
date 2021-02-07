package org.example.assetManagement.manager.impl;

import org.example.assetManagement.dao.RuleInfoDao;
import org.example.assetManagement.entity.RuleInfo;
import org.example.assetManagement.manager.RuleInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @author After445
 * @date 2021/1/22 12:55
 */
@Service
public class RuleInfoManagerImpl implements RuleInfoManager {

    @Autowired
    private RuleInfoDao ruleInfoDao;

    @Override
    public Page<RuleInfo> findPage(int page, int size) {
        PageRequest request = PageRequest.of(page, size);
        return ruleInfoDao.findAll(request);
    }
}
