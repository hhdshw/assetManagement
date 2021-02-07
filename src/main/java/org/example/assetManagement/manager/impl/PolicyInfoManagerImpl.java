package org.example.assetManagement.manager.impl;

import org.example.assetManagement.dao.PolicyInfoDao;
import org.example.assetManagement.entity.PolicyInfo;
import org.example.assetManagement.manager.PolicyInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @author After445
 * @date 2021/1/22 12:54
 */
@Service
public class PolicyInfoManagerImpl implements PolicyInfoManager {

    @Autowired
    private PolicyInfoDao policyInfoDao;

    @Override
    public Page<PolicyInfo> findPage(int page, int size) {
        PageRequest request = PageRequest.of(page, size);
        return policyInfoDao.findAll(request);
    }
}
