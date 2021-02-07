package org.example.assetManagement.controller;

import org.example.assetManagement.entity.PolicyInfo;
import org.example.assetManagement.manager.PolicyInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author After445
 * @date 2021/1/22 12:53
 */
@RestController
@RequestMapping("/policyInfo")
public class PolicyInfoController {

    @Autowired
    private PolicyInfoManager policyInfoManager;

    @GetMapping("/findFirstPage")
    public Page<PolicyInfo> findFirstPage(){
        return policyInfoManager.findPage(0,5);
    }
}
