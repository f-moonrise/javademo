package com.test.twelve.twelve10;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 8:35
 */
public class RegexDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的手机号码:");
        String phone = sc.nextLine();

        String regex = "1[38]\\d{9}";
        /**
         * 1表示1
         * [38]3或8
         * \d数字
         * {9}恰好9次
         */

        boolean flag = phone.matches(regex);
        //尝试将整个区域与模式进行匹配。

        System.out.println("flag:" + flag);
    }
}
