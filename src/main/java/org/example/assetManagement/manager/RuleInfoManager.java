package org.example.assetManagement.manager;

import org.example.assetManagement.entity.RuleInfo;
import org.springframework.data.domain.Page;

/**
 * @author After445
 * @date 2021/1/22 12:54
 */
public interface RuleInfoManager {
    Page<RuleInfo> findPage(int page, int size);
}
