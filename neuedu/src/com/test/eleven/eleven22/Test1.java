package com.test.eleven.eleven22;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/22 14:31
 */
public class Test1 {
    public static void main(String[] args){
        User user = new User();
        user.setName("fs");
        user.setPwd("123");

        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的名字:");
        String name = in.next();
        System.out.println("请输入密码");
        String pwd = in.next();

//        登录
        User user1 = login(name,pwd,user);
        if (user1 == user){
            System.out.println(user1.show());
        }else{
            System.out.println("登陆失败");
        }
    }

//    测试登录是否成功
    public static User login(String name, String pwd, User user){
        if(name!=null){
            if(user.getName().equals(name)&&user.getPwd().equals(pwd)){
                return user;
            }
        }
        return null;
    }
}
