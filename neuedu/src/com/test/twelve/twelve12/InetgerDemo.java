package com.test.twelve.twelve12;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 18:53
 */
public class InetgerDemo {
    public static void main(String[] args) {
        int number = 100;
        String s1 ="" + number;
        System.out.println("s1:" + s1 );

        String s2 = String.valueOf(number);
        System.out.println("s2" + s2);

        Integer i = new Integer(number);
        String s3 = i.toString();
        System.out.println("s3:" + s3);

        String s4 = Integer.toString(number);
        System.out.println("s4:" + s4);
        System.out.println("--------");

        String s = "100";
        Integer ii = new Integer(s);

        int x = ii.intValue();
        System.out.println("x:" + x);

        int y = Integer.parseInt(s);
        System.out.println("y:" + y);
    }
}
