package org.example.assetManagement.manager;

import org.example.assetManagement.entity.PolicyInfo;
import org.springframework.data.domain.Page;

/**
 * @author After445
 * @date 2021/1/22 12:54
 */
public interface PolicyInfoManager {
    Page<PolicyInfo> findPage(int page, int size);
}
