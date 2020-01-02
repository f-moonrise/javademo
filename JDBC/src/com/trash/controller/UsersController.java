package com.trash.controller;

import com.trash.service.UsersService;
import com.trash.service.UsersServiceImpl;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/27 15:26
 */
public class UsersController {
    private UsersService us = new UsersServiceImpl();

    //用户注册
    public void register(String uname){
        us.register(uname);
    }

    //更新用户积分
    public int updateSort(Integer num){
        int i = us.updateSort(num);
        return i;
    }
}
