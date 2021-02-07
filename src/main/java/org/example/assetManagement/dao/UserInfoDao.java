package org.example.assetManagement.dao;

import org.example.assetManagement.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author After445
 * @date 2021/1/21 20:58
 */
public interface UserInfoDao extends JpaRepository<UserInfo, String> {
    @Query("select u from UserInfo u where u.userId=:userId")
    UserInfo selectOne(@Param("userId") String userId);
}
