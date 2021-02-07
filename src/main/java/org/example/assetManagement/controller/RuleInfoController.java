package org.example.assetManagement.controller;

import org.example.assetManagement.entity.RuleInfo;
import org.example.assetManagement.manager.RuleInfoManager;
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
@RequestMapping("/ruleInfo")
public class RuleInfoController {

    @Autowired
    private RuleInfoManager ruleInfoManager;

    @GetMapping("/findFirstPage")
    public Page<RuleInfo> findFirstPage(){
        return ruleInfoManager.findPage(0,5);
    }
}
