package org.example.assetManagement.controller;

import org.example.assetManagement.entity.UserInfo;
import org.example.assetManagement.manager.UserInfoManager;
import org.example.assetManagement.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * @author After445
 * @date 2021/1/21 20:49
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserInfoManager userInfoManager;

    @RequestMapping("/register")
    public R register(UserInfo userInfo){
        try {
            userInfoManager.save(userInfo);
            return R.success("注册成功！");
        } catch (Exception e){
            return R.error("系统错误！");
        }
    }

    @RequestMapping("/userLogin")
    public R login(@RequestBody UserInfo userInfo, HttpServletRequest request){
        boolean bool = userInfoManager.findOneTrue(userInfo);
        if(bool){
            request.getSession().setAttribute("userInfo",userInfo);
//			System.out.println(request.getSession(true).getAttribute("admin"));
            return R.success("登录成功");
        }else {
            return R.error(500,"用户名或密码错误");
        }
    }

    @RequestMapping("/userLoginout")
    public void userLoginout(String userId, HttpServletRequest request){
        HttpSession session = request.getSession(false);//防止创建Session
        if (session != null) {
            session.removeAttribute("userInfo");
        }
    }

    @RequestMapping("/checkLogin")
    public boolean checkLogin(HttpServletRequest request){
        Enumeration em = request.getSession().getAttributeNames();
        //获取用户名
        HttpSession session = request.getSession(false);
        UserInfo userInfo = new UserInfo();

        if (session.getAttribute("userInfo") == null
                || session.getAttribute("userInfo").equals("")){
            return false;
        } else {
            return true;
        }
    }
}
