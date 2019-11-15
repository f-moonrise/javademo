package com.test.eleven.eleven14;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/14 11:34
 */
public class Test1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int x = (a>b)?a:b;
        int y = (x>c)?x:c;
        System.out.println("前两个数中最大的数为："+x);
        System.out.println("前三个数中最大的数为："+y);


    }
}
