package com.test.eleven.eleven14;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/14 14:39
 */
public class Test5 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("请输入60~100的数据：");
        int i=in.nextInt();

        if (90<=i&&i<=100){
            System.out.println("A");
        }else if(80<=i&&i<90){
            System.out.println("B");
        }else if(70<=i&&i<80){
            System.out.println("C");
        }else if(60<=i&&i<70){
            System.out.println("D");
        }



    }
}
