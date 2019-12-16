package com.test.twelve.twelve16;

import java.util.Scanner;


/**
 * @author zangye03@gmail.com
 * @date 2019/12/16 12:12
 */
public class StringBufferDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据:");
        String s = sc.nextLine();

        String s1 = myReverse(s);
        System.out.println("s1" + s1);
        String s2 = myReverse2(s);
        System.out.println("s2"+ s2);
    }

    public static String myReverse2(String s){
        return new StringBuffer(s).reverse().toString();
    }

    public static String myReverse(String s){
        String result = "";
        char[] chs = s.toCharArray();
        for(int x=chs.length-1;x>=0;x--){
            result += chs[x];
        }
        return result;
    }
}
