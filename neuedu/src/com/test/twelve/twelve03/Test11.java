package com.test.twelve.twelve03;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/3 16:30
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String line = sc.nextLine();
        String s = myReverse(line);
        System.out.println("实现功能后的结果"+s);
    }

    public static String myReverse(String s){
        String result = "";
        char[] chs = s.toCharArray();
        for(int x= chs.length-1;x>=0;x--){
            result += chs[x];
        }
        return result;
    }
}
