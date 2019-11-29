package com.test.eleven.zhouce3.auctiondemo.service;

import com.test.eleven.zhouce3.auctiondemo.dao.UserDao;
import com.test.eleven.zhouce3.auctiondemo.pojo.Users;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 8:24
 */
public class UserService {
    private UserDao ud = new UserDao();

    public String register(String uname,String psd){
        //参数非空判断
        //查看当前注册用户是否已经注册
        Users users = ud.selectByUname(uname);
        if(users != null){
            return "用户名已存在";
        }

        //注册用户，把用户信息存储起来
        Users u= new Users();
        u.setUname(uname);
        u.setPassword(psd);
        int i = ud.addOne(u);
        if(i<=0){
            return "用户注册失败";
        }
        //用户注册成功
        return "用户注册成功";
    }
}
