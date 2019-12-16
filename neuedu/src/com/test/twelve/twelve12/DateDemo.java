package com.test.twelve.twelve12;

import javax.swing.plaf.synth.SynthUI;
import java.util.Date;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 19:53
 */
public class DateDemo {
    public static void main(String[] args) {
        Date d  = new Date();
        System.out.println("d:" +d);

        long time = System.currentTimeMillis();
        System.out.println(time);
        long time2 = 1000*60*60;
        Date d2 = new Date(time);
        System.out.println("d2;"+ d2);
        Date d3 = new Date(time2);
        System.out.println("d3:"+d3);
        //?????
    }
}
