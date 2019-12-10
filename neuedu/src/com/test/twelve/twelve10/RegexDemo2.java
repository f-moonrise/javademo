package com.test.twelve.twelve10;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 8:30
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的QQ号码:");
        String qq = sc.nextLine();

        System.out.println("checkQQ:" + checkQQ(qq));
    }

    public static boolean checkQQ(String qq){
        return qq.matches("[1-9]\\d{4,14}");
        //1-9的字符都包括
        //\d数字[0-9]
        //{4,14}至少4次，不超过14次
    }
}
