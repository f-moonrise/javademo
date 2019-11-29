package com.test.eleven.eleven29.shitou.dao;

import com.test.eleven.eleven29.shitou.pojo.User;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 14:43
 */
public class UserDao {
    User[] us = new User[10];

    //用户查找
    public int select(String name){
        for(int i=0;i<us.length;i++){
            if(us[i]!=null&&us[i].getName().equals(name)){
                return 1;
            }
        }
        return 0;
    }

    //用户登录核实
    public int selecth(String name, String psd){
        for(int i=0;i<us.length;i++){
            if(us[i]!=null&&us[i].getName().equals(name)&&us[i].getPsd().equals(psd)){
                return 1;
            }
        }
        return 0;
    }

    //用户添加
    public int add(String name, String psd){
        for(int i=0;i<us.length;i++){
            if(us[i]==null){
                us[i] = new User(name,psd);
                return 1;
            }
        }
        return 0;
    }

    //打印用户组信息
    public String show(){
        return null;
    }
}
