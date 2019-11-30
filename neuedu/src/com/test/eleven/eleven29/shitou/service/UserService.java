package com.test.eleven.eleven29.shitou.service;

import com.test.eleven.eleven29.shitou.dao.UserDao;
import com.test.eleven.zhouce3.Util;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 14:44
 */
public class UserService {
    UserDao ud = new UserDao();

    //注册
    public String register(String name, String psd){
        //查找是否有该用户
        int fs = ud.select(name);
        if(fs==1){
            return "该用户以注册！";
        }else {
            int fs1 = ud.add(name,psd,0);
            if (fs1==1){
                return "注册成功";
            }else{
                return "注册失败";
            }
        }
    }

    //登录
    public String login(String name, String psd){
        int fs = ud.selecth(name, psd);
        if(fs==1){
            return "登录成功";

        }else {
            return "登录失败";
        }
    }

    //排行榜
    public String showInte(){
        ud.selectInte();
        String fs = ud.showInte();
        return fs;
    }

    //游戏
    public String youxi(int select){
        int fs = ud.youxi(select);
        if(fs==1){
            return "恭喜你赢了";
        }else if(fs==-1){
            return "很不幸你输了";
        }else {
            return "平局";
        }
    }
}
