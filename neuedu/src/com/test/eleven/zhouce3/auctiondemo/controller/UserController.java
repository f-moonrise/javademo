package com.test.eleven.zhouce3.auctiondemo.controller;

import com.test.eleven.zhouce3.auctiondemo.service.UserService;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 8:20
 */
public class UserController {
      private UserService us = new UserService();

      //用户注册，需要两个参数，用户名和密码，注册成功返回用户信息
       public String register(String uname,String psd){
          String s = us.register(uname, psd);
          return s;
        }

        //用户登录

}
