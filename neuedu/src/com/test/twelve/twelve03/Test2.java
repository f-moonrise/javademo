package com.test.twelve.twelve03;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/3 10:49
 */
public class Test2 {
    public static void main(String[] args) {
        byte[] bys= { 97, 98, 99, 100, 101};
        String s2 = new String(bys);
        System.out.println(s2);
        System.out.println(s2.length());

        String s3 = new String(bys,1,3);
        System.out.println(s3);
        System.out.println(s3.length());

        System.out.println("==========================");

        char[] chs = {
                'a','b','c','d','e','爱','林','亲'
        };
        String s4 = new String(chs);
        System.out.println(s4);
        System.out.println(s4.length());

        System.out.println("==========================");

        String s5 = new String(chs,2,4);
        System.out.println(s5);
        System.out.println(s5.length());
    }
}