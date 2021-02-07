package org.example.assetManagement.manager;

import org.example.assetManagement.entity.UserInfo;
import org.example.assetManagement.util.R;

/**
 * @author After445
 * @date 2021/1/21 20:50
 */
public interface UserInfoManager {
    void save(UserInfo userInfo);

    boolean findOneTrue(UserInfo userInfo);

    R updatePassword(String userId, String oldPassword, String newPassword);

    UserInfo findOne(String userId);

    R upadteOne(UserInfo userInfo);

    R register(UserInfo userInfo);
}
