package com.test.eleven.eleven20;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/20 11:05
 */

public class Test1 {
    public static void main(String[] args){

//
        Animal animal1 = new Animal();
        animal1.name="狗 ";
        animal1.action="旺旺";
        animal1.features="看家护院";
//
        Animal animal2 = new Animal();
        animal2.name="猫";
        animal2.action="喵喵";
        animal2.features="抓老鼠";
//
        Animal animal3 = new Animal();
        animal3.name="鹅";
        animal3.action="嘎嘎嘎";
        animal3.features="和狗抢活，看家";

//        boolean key = true;
        boolean key1 = true;

//        while (key){
            System.out.println("===========================================");
            System.out.println("========妖精贩卖局========");
            Animal[] arr = new Animal[3];
            arr[0]=animal1;
            arr[1]=animal2;
            arr[2]=animal3;
            System.out.println("商品列表如下:");
            for(int i=0;i<arr.length;i++){
                System.out.println("序号"+i+"种类:"+arr[i].name+"叫声:"+arr[i].action+"用途:"+arr[i].features);
            }

            while (key1){
                System.out.println("请输入你选择的序号:");
                Scanner in = new Scanner(System.in);
                int fs = in.nextInt();
                if(fs<arr.length){
                    System.out.println("以购买！！！");
                }else{
                    System.out.println("购买失败！！！");
                }
                System.out.println("请输入是否要继续购物:(1-继续购物，其他退出)");
                int fs1 = in.nextInt();
                if(fs1==1){
                    key1=true;
                }else{
                    key1=false;
                    System.out.println("退出购物程序");
                }
            }
//        }
    }
}
