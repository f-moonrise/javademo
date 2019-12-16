package com.test.twelve.twelve12;

import java.util.Date;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 19:55
 */
public class DateDemo1 {
    public static void main(String[] args) {
        Date d = new Date();

        long time = d.getTime();
        System.out.println(time);
        System.out.println(System.currentTimeMillis());

        System.out.println("d:" + d);
        d.setTime(1000);
        System.out.println("d:" + d);

    }
}
