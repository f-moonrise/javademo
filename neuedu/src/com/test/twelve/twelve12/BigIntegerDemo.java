package com.test.twelve.twelve12;

import java.math.BigInteger;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 19:37
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        System.out.println(i);
        System.out.println("-----");
        System.out.println(Integer.MIN_VALUE);
        System.out.println("-----");
        Integer ii = new Integer("214783647");
        System.out.println(ii);
        System.out.println("-----");
//        Integer iii = new Integer("2147483648");
//        System.out.println(iii);
//        System.out.println("-----");

        //通过大整数来创建对象
        BigInteger bi = new BigInteger("2147483648");
        System.out.println("bi"+ bi);
    }
}
