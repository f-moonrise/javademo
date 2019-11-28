package com.test.eleven.zhouce3_1;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/28 9:32
 */
public final class HomeCar extends Car{
    int num;//载客数

    HomeCar(){}

    HomeCar(String color, String username){
        super(color, username);
    }

    public void display(){
        System.out.println(username + "拥有的" + color + "颜色的私家车有"
        + num + "座位");
    }

    public void display(int num){
        System.out.println("家用汽车大多有" + num + "个座位");
    }
}
