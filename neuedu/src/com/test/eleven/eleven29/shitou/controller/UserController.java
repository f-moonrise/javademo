package com.test.eleven.eleven29.shitou.controller;

import com.test.eleven.eleven29.shitou.service.UserService;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 14:43
 */
public class UserController {
    UserService users = new UserService();

    //注册
    public String register(String name, String psd){
        String s = users.register(name, psd);
        return s;
    }

    //登录
    public String login(String name, String psd){
        String s = users.login(name,psd);
        return s;
    }
}
