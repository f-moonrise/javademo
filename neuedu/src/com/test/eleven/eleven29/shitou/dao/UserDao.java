package com.test.eleven.eleven29.shitou.dao;

import com.test.eleven.eleven29.shitou.pojo.Products;
import com.test.eleven.eleven29.shitou.pojo.User;

import java.util.Random;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 14:43
 */
public class UserDao {
    public static User[] us = new User[10];

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
                return i+1;
            }
        }
        return 0;
    }

    //用户添加
    public int add(String name, String psd, int integral, Products[] gcar,Products[] bao){
        for(int i=0;i<us.length;i++){
            if(us[i]==null){
                us[i] = new User(name,psd,integral,gcar,bao);
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
            if(us[i]!=null&&us[i].getName()!=null){
                int maxIndex = i;
                int max = us[i].getIntegral();
                for(int j=i+1;j<us.length;j++){
                    if(us[j].getName()!=null&&max<us[j].getIntegral()){
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

    //购物车物品添加
    public void addPro(int asd, Products[] products){
        us[asd].setGcar(products);
    }

    //充值
    public void chong(int asd,int fs){
        us[asd].setIntegral(us[asd].getIntegral() + fs) ;
        System.out.println("充值成功");
    }

    //打印用户信息
    public User showUser(int asd){
        for(int i=0;i<us.length;i++){
            if(us!=null&&us[i]!=null&&us[i].getName()!=null&&i==asd){
                return us[asd];
            }
        }
        return null;
    }

    //排行榜打印
    public void showInte(){
        int count = 0;
        for(int i=0;i<us.length;i++){
            if(us[i].getName()!=null){
                count = count + 1;
                System.out.println("第" + count + "名" +" 姓名:" + us[i].getName()+ "积分:" + us[i].getIntegral());
            }
        }
    }

    public int youxi(int select,int asd){
        //定义1-拳头，2-剪刀，3-布
        Random random=new Random();
        int fs=random.nextInt(3)+1;
        if((select==1&&fs==2)||(select==2&&fs==3)||(select==3&&fs==1)){
            us[asd].setIntegral(us[asd].getIntegral()+10);
            return 1;
        }else if((select==1&&fs==3)||(select==2&&fs==1)||(select==3&&fs==2)){
            us[asd].setIntegral(us[asd].getIntegral()-10);
            return -1;
        }else{
            return 0;
        }
    }

    //清空购物车
    public int cleang(int asd){
        int count=0;
        if(us[asd].getGcar()!=null){
            for(int i=0;i<us[asd].getGcar().length;i++){
                if(us[asd].getGcar()[i]!=null){
                    count = count + us[asd].getGcar()[i].getPrice();
                }
            }
        }else {
            count = 0;
        }

        if (us[asd].getIntegral()>count){
            us[asd].setIntegral(us[asd].getIntegral()-count);
            us[asd].setBao(us[asd].getGcar());
            us[asd].setGcar(null);
            return 1;
        }else {
            return -1;
        }
    }

    //商品的上架
    public int shangjia(int asd) {
        if(us[asd].getIntegral()>500){
            return 1;
        }else {
            return 0;
        }
    }
}
