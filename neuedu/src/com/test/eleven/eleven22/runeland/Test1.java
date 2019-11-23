package com.test.eleven.eleven22.runeland;

import com.test.eleven.eleven22.runeland.pojo.User;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/23 10:39
 */
public class Test1 {
    //    全局资源初始化
    static User[] user = new User[10];


    public static void main(String[] args){
//        初始化模块
        Scanner in = new Scanner(System.in);
        boolean key =true;//界面模块的钥匙


//        界面模块
        while (key){
            System.out.println("欢迎来到符文大陆。");
            System.out.println("输入1，进去注册页面");
            System.out.println("输入2，进去登录页面");
            int fs = in.nextInt();
            if(fs == 1){
                zhuce();
                show();
            }else if(fs == 2){
                System.out.println("欢迎来到登录页面！");
            }else{
                System.out.println("很不辛你被时空裂缝所吞噬");
                System.out.println("GAME OVER!");
                key = false;
            }
        }

//main方底部
    }

    //    用户注册
    public static void zhuce(){
        System.out.println("欢迎来到注册页面！");
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的姓名:");
        String uname = in.next();
        System.out.println("请输入你的密码:");
        String pwd = in.next();
        User us = new User(uname,pwd);

        boolean key1 = true;

        //判断该用户是否存在
        for(int i = 0;i<user.length;i++){
            if(user[i] != null){
                if(user[i].uname.equals(us.uname)){
                    System.out.println("此人已注册，不可以重复注册！");
                    key1 = false;
                    break;
                }
            }

            if(key1){
                //如果不存在就记录下来
                for(int j = 0;j<user.length;j++){
                    if(user[j] == null){
                        user[j] = us;
                        System.out.println("注册成功!");
                        break;
                    }
                }
                break;
            }
        }
    }

    //    打印用户组
    public static void show(){
        for (int i=0;i<user.length;i++){
            if(user[i]!=null){
                if(user[i].uname.equals(null)){
                    break;
                }else{
                    String s = "用户:" + user[i].uname;
                    System.out.println(s);
                }
            }
        }
    }
}
