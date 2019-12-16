package com.test.twelve.twelve12;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 19:33
 */
public class SystemDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int x=0;x<100000;x++){
            System.out.println("hello"+x);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时:" +(end-start) + "毫秒");
    }
}
