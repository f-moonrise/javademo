package com.test.twelve.twelve10;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 8:44
 */
public class RegexTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入邮箱:");
        String email = sc.nextLine();

        String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";
        /**
         * \w单词字符[a-zA-Z_0-9]
         * {2,6}至少2次，之多6次
         */

        boolean flag = email.matches(regex);

        System.out.println("flag:" + flag);
    }
}
