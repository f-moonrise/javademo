package com.test.eleven.eleven14;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/14 14:30
 */
public class Test3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        if(i%7==1){
            System.out.println("星期一");
        }else if(i%7==2){
            System.out.println("星期二");
        }else if(i%7==3){
            System.out.println("星期三");
        }else if(i%7==4){
            System.out.println("星期四");
        }else if(i%7==5){
            System.out.println("星期五");
        }else if(i%7==6){
            System.out.println("星期六");
        }else if(i%7==0){
            System.out.println("星期七");
        }
    }
}
