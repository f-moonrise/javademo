package com.test.eleven.eleven29.shitou.controller;

import com.test.eleven.eleven29.shitou.Util;
import com.test.eleven.eleven29.shitou.service.UserService;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 14:43
 */
public class UserController {
    UserService users = new UserService();
    ProductsController pc = new ProductsController();
    int asd = 0 ;
    Scanner in = new Scanner(System.in);

    //注册
    public String register(String name, String psd){
        String s = users.register(name, psd);
        return s;
    }

    //登录
    public int login(String name, String psd){
        asd = users.login(name,psd);
        return asd;
    }

    //打印用户信息
    public void showUser(int asd){
        users.showUser(asd);
    }

    //充值
    public void chong(int asd){
        Util.chong();
        System.out.println("请输入你要充值的金额:");
        int fs=in.nextInt();
        users.chong(asd,fs);
    }

    //排行榜
    public void showInte(){
        String s = users.showInte();
        System.out.println(s);
    }

    //游戏
    public void youxi(int asd){
        Util.youxi();
        System.out.println("请输入你的选择:");
        int select =in.nextInt();
        String s = users.youxi(select,asd);
        System.out.println(s);
    }

    //功能
    public void gong(int fs,int asd){
        if(fs==1){
            pc.showProducts();
        }else if(fs==2){
            pc.chaProducts();
        }else if(fs==3){
            pc.paiMai(asd);
        }else if(fs==4){
            chong(asd);
        }else if(fs==5){
            users.showUser(asd);
        }else if(fs==6){
            youxi(asd);
        }else if(fs==7){
            showInte();
        }else if(fs==0){
//                show();
        }
    }
}
