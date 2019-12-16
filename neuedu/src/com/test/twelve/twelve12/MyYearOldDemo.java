package com.test.twelve.twelve12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 20:01
 */
public class MyYearOldDemo {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生年月日");
        String line = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(line);

        long myTime = d.getTime();
        long nowTime = System.currentTimeMillis();
        long time = nowTime - myTime;
        long day = time/1000/60/60/24;
        System.out.println("你来到这个世界:"+day+"天");
    }
}
