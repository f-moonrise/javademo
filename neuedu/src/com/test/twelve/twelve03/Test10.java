package com.test.twelve.twelve03;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/3 15:56
 */
public class Test10 {
    public static void main(String[] args) {
        String s1 = "helloworld";
        String s2 = s1.replace('l','k');
        String s3 = s1.replace("owo","ak47");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("=========");
        String s4 = " hello world ";
        String s5 = s4.trim();
        System.out.println(s4);
        System.out.println(s5);
        System.out.println("=====");
        String s6 = "hello";
        String s7 = "hello";
        String s8 = "abc";
        String s9 = "xyz";
        System.out.println(s6.compareTo(s7));
        System.out.println(s6.compareTo(s8));
        System.out.println(s6.compareTo(s9));
    }
}
