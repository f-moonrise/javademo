package com.test.eleven.eleven15;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/15 11:21
 */
public class Test1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        boolean key=true;
        int x=in.nextInt();

        if(x==1||x==2){
            System.out.println("这是一个素数。");
        }else{
            while (key){
                for(int i=2;i<x-1;i++){
                    if(x%i==0){
                        key=false;
                    }
                }
             break;
            }
        }

        if(key==true){
            System.out.println("这是一个素数");
        }else{
            System.out.println("这不是一个素数");
        }
    }
}
