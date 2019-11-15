package com.test.eleven.eleven14;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/14 14:35
 */
public class Test4 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();

        if(i%12==3||i%12==4||i%12==5){
            System.out.println("春季");
        }else if(i%12==6||i%12==7||i%12==8){
            System.out.println("夏季");
        }else if(i%12==9||i%12==10||i%12==11){
            System.out.println("秋季");
        }else if(i%12==12||i%12==1||i%12==2){
            System.out.println("冬季");
        }
    }
}
