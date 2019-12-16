package com.test.twelve.twelve16;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/16 12:20
 */
public class StringBufferDemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.nextLine();

        boolean b = isSame(s);
        System.out.println("b:"+b);

        boolean b2 = isSame(s);
        System.out.println("b2:"+b2);

    }

    private static boolean isSame(String s) {
        return false;
    }

}
