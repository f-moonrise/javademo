package com.test.twelve.twelve03;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/3 15:24
 */
public class Test9 {
    public static void main(String[] args) {
        String s = "helloWORLD";

        String s1 = s.substring(0,1);
        String s2 = s.substring(1);
        String s3 = s1.toUpperCase();
        String s4 = s2.toLowerCase();
        String s5 = s3.concat(s4);

        System.out.println(s5);
        String result = s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
        System.out.println(result);
    }
}
