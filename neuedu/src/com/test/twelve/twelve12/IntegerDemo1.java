package com.test.twelve.twelve12;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 18:51
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        int i = 100;
        Integer ii = new Integer(i);
        System.out.println("ii:" + ii);

        String s = "100";
        String s2 = "abc";
        Integer iii = new Integer(s);
        System.out.println("iii:" + iii);
        Integer iii2 = new Integer(s2);
        System.out.println("iii:" + iii2);
    }
}
