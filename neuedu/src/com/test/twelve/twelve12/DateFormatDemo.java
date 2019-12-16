package com.test.twelve.twelve12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 19:57
 */
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);

        //??????????????
        String str = "2008-08-08 12:12:12";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(str);
        System.out.println(dd);

    }
}
