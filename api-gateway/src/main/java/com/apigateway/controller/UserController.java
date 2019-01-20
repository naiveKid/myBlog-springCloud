package com.apigateway.controller;

import com.apigateway.service.UserService;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:用户
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 测试登陆JWT授权
     *
     * @return
     */
    @RequestMapping("/login")
    public User login(User user) {
        if (user == null || user.getLoginName() == null) {
            return null;
        }
        return userService.login(user);
    }

    /**
     * 验证token是否有效
     *
     * @param token
     * @return
     */
    @RequestMapping(value = "/verifyToken")
    public boolean verifyToken(String token) {
        if (token == null)
            return false;
        return userService.verifyToken(token);
    }
}
