package com.test.twelve.twelve12;

import java.util.Calendar;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/16 8:30
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONDAY);
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");

        c.add(Calendar.YEAR, -3);
        //add(f, delta)增加delta到现场f 。 这相当于调用set(f, get(f) + delta)进行了两次调整：
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONDAY);
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");

        c.add(Calendar.YEAR, 5);
        c.add(Calendar.DATE,-10);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONDAY);
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");
        System.out.println("-------------------------------");

        c.set(2011,11,11);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONDAY);
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");
    }
}
