package com.test.eleven.eleven15;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/15 11:38
 */
public class Test2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();

        System.out.println("两数之和:"+add(a,b));
        System.out.println("两数之差:"+jian(a,b));
        System.out.println("两数之积:"+cheng(a,b));
        System.out.println("两数之商:"+chu(a,b)+"之余:"+yu(a,b));

    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int jian(int a, int b){
        return a-b;
    }

    public static int cheng(int a, int b){
        return a*b;
    }

    public static int chu(int a, int b){
        return a/b;
    }

    public static int yu(int a, int b){
        return a%b;
    }
}
