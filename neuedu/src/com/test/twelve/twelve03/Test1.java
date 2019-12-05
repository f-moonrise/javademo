package com.test.twelve.twelve03;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/3 10:00
 */
public class Test1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] a =  new String[10];

        System.out.println("输入你想输入的事物:");
        while (in.hasNextLine()){
            System.out.println("输入你想输入的事物:");
            String fs = in.next();
            for(int i=0;i<a.length;i++){
                if(a!=null&&a[i]==null){
                    a[i]=fs;
                    break;
                }
            }
        }

        for(int i=0;i<a.length;i++){
            if(a[i]!=null){
                System.out.println(a[i]);
            }
        }
    }
}
