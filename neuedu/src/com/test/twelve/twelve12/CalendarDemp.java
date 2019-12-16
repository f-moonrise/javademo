package com.test.twelve.twelve12;

import java.util.Calendar;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 20:05
 */
public class CalendarDemp {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();

        int year = rightNow.get(Calendar.YEAR);
        int month = rightNow.get(Calendar.MONDAY);
        int date = rightNow.get(Calendar.DATE);

        System.out.println(year + "年 " + (month+1) + "月" + date + "日");
    }
}
