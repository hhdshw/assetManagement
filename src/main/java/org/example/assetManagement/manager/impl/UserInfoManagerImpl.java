package org.example.assetManagement.manager.impl;

import org.apache.catalina.User;
import org.example.assetManagement.dao.UserInfoDao;
import org.example.assetManagement.entity.UserInfo;
import org.example.assetManagement.manager.UserInfoManager;
import org.example.assetManagement.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author After445
 * @date 2021/1/21 20:50
 */
@Service
public class UserInfoManagerImpl implements UserInfoManager {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public void save(UserInfo userInfo) {
        userInfoDao.save(userInfo);
    }

    @Override
    public boolean findOneTrue(UserInfo userInfo) {
        try{
            UserInfo userInfo1 = userInfoDao.findById(userInfo.getUserId()).get();
            if(userInfo1 != null && userInfo.getPassword().equals(userInfo1.getPassword())){
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public R updatePassword(String userId, String oldPassword, String newPassword) {
        UserInfo userInfo = userInfoDao.findById(userId).get();
        if (userInfo == null){
            return R.error(500,"未找到用户!");
        }
        if(!userInfo.getPassword().equals(oldPassword)){
            return R.error(500, "旧密码输入错误");
        }
        userInfo.setPassword(newPassword);
        userInfoDao.saveAndFlush(userInfo);
        return R.success("修改成功");
    }

    @Override
    public UserInfo findOne(String userId) {
        return userInfoDao.findById(userId).get();
    }

    @Override
    public R upadteOne(UserInfo userInfo) {
        try {
            userInfoDao.save(userInfo);
            return R.success("修改成功！");
        } catch (Exception e){
            return R.error("数据异常，请重新登录！");
        }
    }

    @Override
    public R register(UserInfo userInfo) {
        try {
            Optional<UserInfo> u = userInfoDao.findById(userInfo.getUserId());
            System.out.println(u.isPresent());
            if (u.isPresent()){
                return R.error("该身份证已注册，请联系管理员！");
            } else {
                userInfoDao.save(userInfo);
                return R.success("注册成功，请重新登录！");
            }

        } catch (Exception e){
            return R.error("系统错误!");
        }
    }
}
