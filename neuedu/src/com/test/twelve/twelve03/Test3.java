package com.test.twelve.twelve03;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/3 10:49
 */
public class Test3 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("hello");
        String s4 = "hello";
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));


        String s5 = "hello";
        String s6 = "hello";
        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));
    }
}
