package com.test.eleven.eleven29.shitou.controller;

import com.test.eleven.eleven29.shitou.service.UserService;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 14:43
 */
public class UserController {
    UserService users = new UserService();
    ProductsController pc = new ProductsController();

    //注册
    public String register(String name, String psd){
        String s = users.register(name, psd);
        return s;
    }

    //登录
    public String login(String name, String psd){
        String s = users.login(name,psd);
        return s;
    }

    //排行榜
    public String showInte(){
        String s = users.showInte();
        return s;
    }

    //游戏
    public String youxi(int select){
        String s = users.youxi(select);
        return s;
    }

    //功能
    public void gong(int fs){
        if(fs==1){
            pc.showProducts();
        }else if(fs==2){
//                chaProducts();
        }else if(fs==3){
//                paiMai();
        }else if(fs==4){
//                chong();
        }else if(fs==5){
//                showUser();
        }else if(fs==6){

        }else if(fs==7){

        }else if(fs==0){
//                show();
        }
    }
}
