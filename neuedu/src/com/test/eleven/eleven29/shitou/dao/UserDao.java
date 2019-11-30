package com.test.eleven.eleven29.shitou.dao;

import com.test.eleven.eleven29.shitou.pojo.User;

import java.util.Random;

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
    public int add(String name, String psd, int integral){
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
        for(int i=0;i<us.length;i++){
            if(us[i]!=null){
                return "姓名:" + us[i].getName() + " 积分:" +us[i].getIntegral();
            }
        }
        return null;
    }

    //积分排序
    public void selectInte(){
        for(int i=0;i<us.length;i++){
            if(us[i].getName()!=null){
                int maxIndex = i;
                int max = us[i].getIntegral();
                for(int j=i+1;j<us.length;j++){
                    if(us[i].getName()!=null&&max<us[i].getIntegral()){
//                        max = us[j].getIntegral();
                        maxIndex = j;
                    }
                }

                if(maxIndex != i){
                    us[maxIndex] = us[i];
//                    us[i].getIntegral() = max;
                }
            }
        }
    }

    //排行榜打印
    public String showInte(){
        int count = 0;
        for(int i=0;i<us.length;i++){
            if(us[i].getName()!=null){
                count = count + 1;
                return "第" + count + "名" +" 姓名:" + us[i].getName()+ "积分:" + us[i].getIntegral();
            }
        }
        return null;
    }

    public int youxi(int select){
        //定义1-拳头，2-剪刀，3-布
        Random random=new Random();
        int fs=random.nextInt(3)+1;
        if((select==1&&fs==2)||(select==2&&fs==3)||(select==3&&fs==1)){
            return 1;
        }else if((select==1&&fs==3)||(select==2&&fs==1)||(select==3&&fs==2)){
            return -1;
        }else{
            return 0;
        }
    }

}
