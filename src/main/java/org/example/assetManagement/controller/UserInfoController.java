package org.example.assetManagement.controller;

import org.apache.catalina.User;
import org.example.assetManagement.entity.UserInfo;
import org.example.assetManagement.manager.UserInfoManager;
import org.example.assetManagement.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author After445
 * @date 2021/1/22 18:26
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoManager userInfoManager;

    @RequestMapping("/updatePassword/{userId}/{oldPassword}/{newPassword}")
    public R updatePassword(@PathVariable("userId") String userId, @PathVariable("oldPassword") String oldPassword
            ,@PathVariable("newPassword") String newPassword){
        try {
            return userInfoManager.updatePassword(userId,oldPassword, newPassword);
        } catch (Exception e){
            return R.error(500,"内部错误");
        }
    }

    @RequestMapping("/findOne/{userId}")
    public UserInfo findOne(@PathVariable("userId") String userId){
        return userInfoManager.findOne(userId);
    }

    @RequestMapping("/updateOne")
    public R updateOne(@RequestBody UserInfo userInfo){
        try {
            return userInfoManager.upadteOne(userInfo);
        } catch (Exception e){
            return R.error("系统错误！");
        }
    }

    @RequestMapping("/register")
    public R register(@RequestBody UserInfo userInfo){
        return userInfoManager.register(userInfo);
    }
}
