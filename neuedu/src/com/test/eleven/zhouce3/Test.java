package com.test.eleven.zhouce3;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/28 8:47
 */
public class Test {
    static Scanner in = new Scanner(System.in);
    static User[] user = new User[10];

    public static void main(String[] args){
        show();
    }

    public static void show(){
        boolean key = true;
        while (key){
            Util.start();
            int fs = in.nextInt();
            if(fs == 1){
                regist();
            }else if(fs == 2){
                login();
            }else if(fs == 3){
                key = false;
            }
        }
    }

    public static void regist(){
        Util.regist();
        System.out.println("输入名字:");
        String uname = in.next();
        System.out.println("输入密码:");
        String pwd = in.next();
        regist(uname,pwd);
    }

    public static void regist(String uname, String pwd){
        boolean key = true;
        if(uname!=null&&pwd!=null){
            for(int i = 0;i<user.length;i++){
                if(user[i]!=null){
                    if(user[i].uname.equals(uname)){
                        System.out.println("此用户已注册！");
                        key = false;
                    }
                }

                while (key){
                    for(int j = 0;j<user.length;j++) {
                        if(user[j]==null){
                            user[j] = new User(uname, pwd, 0);
                            System.out.println("注册成功！");
                            key=false;
                            show();
                            break;
                        }
                    }
                }
            }
        }else{
            System.out.println("用户名或密码为空，请重新输入。");
            regist();
        }
    }

    public static void login(){
        Util.login();
        System.out.println("输入名字:");
        String uname = in.next();
        System.out.println("输入密码:");
        String pwd = in.next();
        login(uname,pwd);
    }

    public static void login(String uname,String pwd){
        boolean key = false;
        if(uname!=null&&pwd!=null&&user!=null){
            for(int i = 0;i<user.length;i++){
                if(user[i]!=null&&user[i].uname.equals(uname)&&user[i].pwd.equals(pwd)){
                    //登录成功
                    key = true;
                }
            }
        }else{
            System.out.println("登录失败，用户名或密码错误。");
        }

        if(key){
            //选择页面
            System.out.println("登陆成功。");
            login();
        }else {
                System.out.println("登陆失败。");
                show();
        }
    }

    public static void showUser(){
        for(int i=0;i<user.length;i++){
            if(user!=null&&user[i]!=null&&user[i].uname!=null){
                System.out.println(user[i].uname);
            }
        }
    }
}
