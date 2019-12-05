package com.test.twelve.twelve03;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/3 14:08
 */
public class Test7 {
    public static void main(String[] args) {
        String s = "helloworld";
//        System.out.println(s.length());
//        System.out.println(s.charAt(7));
//        System.out.println(s.indexOf('l'));
//        System.out.println(s.indexOf("owo"));
        System.out.println(s.indexOf('l',4));
        System.out.println(s.indexOf('k',4));
        System.out.println(s.indexOf('l',40));
        System.out.println(s.substring(5));
        System.out.println(s.substring(0));
        System.out.println(s.substring(3,8));
        System.out.println(s.substring(0,s.length()));
    }
}
