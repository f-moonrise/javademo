package com.test.eleven.eleven14;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/14 15:59
 */
public class Test6 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        if(i%2==0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
