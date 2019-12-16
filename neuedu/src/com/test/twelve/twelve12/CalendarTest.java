package com.test.twelve.twelve12;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 20:07
 */
public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(year,2,1);
        System.out.println(c.get(Calendar.DATE));
        c.add(Calendar.DATE,-1);
        System.out.println(c.get(Calendar.DATE));
        //2月有几天
    }
}
