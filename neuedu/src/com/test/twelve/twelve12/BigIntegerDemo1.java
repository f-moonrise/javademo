package com.test.twelve.twelve12;

import java.math.BigInteger;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 19:39
 */
public class BigIntegerDemo1 {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("100");
        BigInteger bi2 = new BigInteger("50");

        System.out.println("add:" +bi1.add(bi2));
        System.out.println("subtract:" + bi1.subtract(bi2));
        System.out.println("multiply:" + bi1.multiply(bi2));
        System.out.println("divide:" + bi1.divide(bi2));
        BigInteger[] bis = bi1.divideAndRemainder(bi2);
        System.out.println("商:" + bis[0]);
        System.out.println("余数:" + bis[1]);

    }
}
