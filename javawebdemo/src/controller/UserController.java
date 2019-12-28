package controller;

import pojo.User;
import services.UserService;
import services.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/26 23:16
 */
public class UserController {
    UserService us = new UserServiceImpl();

    public int register(String username,String password){
        int register = us.register(username,password);
        return register;
    }

    //查询所有用户对象
    public List<User> getAll(){
        List<User> li = us.getAll();
        return li;
    }
}
