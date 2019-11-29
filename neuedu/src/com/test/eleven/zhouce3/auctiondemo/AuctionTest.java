package com.test.eleven.zhouce3.auctiondemo;

import com.test.eleven.zhouce3.auctiondemo.controller.UserController;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 8:32
 */
public class AuctionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String uname = sc.next();
        System.out.println("请输入密码：");
        String psd = sc.next();

        UserController uc = new UserController();
        String register = uc.register(uname,psd);
        System.out.println(register);
    }
}
