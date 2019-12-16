package com.test.twelve.twelve12;

import java.math.BigDecimal;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 19:45
 */
public class BigDecimalDemo1 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("0.09");
        BigDecimal bd2 = new BigDecimal("0.01");
        System.out.println("add:" + bd1.add(bd2));
        System.out.println("--------");

        BigDecimal bd3 = new BigDecimal("1.0");
        BigDecimal bd4 = new BigDecimal("0.32");
        System.out.println("subtract:" + bd3.subtract(bd4));
        System.out.println("-----------");

        BigDecimal bd5 = new BigDecimal("1.015");
        BigDecimal bd6 = new BigDecimal("100");
        System.out.println("multiply:" + bd5.multiply(bd6));
        System.out.println("------------");

        BigDecimal bd7 = new BigDecimal("1.301");
        BigDecimal bd8 = new BigDecimal("100");
        System.out.println("divide:" + bd7.divide(bd8));
        System.out.println("divide:" +bd7.divide(bd8,3,BigDecimal.ROUND_HALF_UP));
        System.out.println("divide:" + bd7.divide(bd8,8,BigDecimal.ROUND_HALF_UP));
    }
}
