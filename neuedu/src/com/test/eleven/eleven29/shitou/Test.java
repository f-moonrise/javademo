package com.test.eleven.eleven29.shitou;

import com.test.eleven.eleven29.shitou.controller.UserController;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 14:39
 */
public class Test {

    public static void main(String[] args){
        UserController uc = new UserController();
        Scanner in = new Scanner(System.in);

        //注册
        System.out.println("请注册");
        System.out.println("姓名:");
        String name = in.next();
        System.out.println("密码:");
        String psd = in.next();
        String fs = uc.register(name,psd);
        System.out.println(fs);

        //登录
        System.out.println("请登录");
        System.out.println("姓名:");
        String name1 = in.next();
        System.out.println("密码:");
        String psd1 = in.next();
        String fs1 = uc.login(name1, psd1);
        System.out.println(fs1);
    }
}
