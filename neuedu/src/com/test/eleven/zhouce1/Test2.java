package com.test.eleven.zhouce1;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/14 16:15
 */
public class Test2 {
    public static void main(String[] args){
        int a=1;
        int b=0;
        System.out.println("1为男性，0为女性，输入你的数据");
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        if(i%2==1){
            System.out.println("男性"+a);
        }else{
            System.out.println("女性"+b);
        }
    }
}
