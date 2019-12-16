package com.test.twelve.twelve12;

import javax.swing.plaf.synth.SynthUI;
import java.util.Map;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 19:19
 */
public class MathDemo {
    public static void main(String[] args) {
        System.out.println("PI:" + Math.PI);
        System.out.println("E:" + Math.E);
        System.out.println("-----------");
        System.out.println("abs:" + Math.abs(10));
        System.out.println("abs:" + Math.abs(-10));
        System.out.println("----------");
        System.out.println("ceil:" + Math.ceil(12.34));
        System.out.println("ceil:" + Math.ceil(12.56));
        System.out.println("-------------");
        System.out.println("ceil:" + Math.floor(12.34));
        System.out.println("ceil:" + Math.floor(12.56));
        System.out.println("-------------");
        System.out.println("max::" + Math.max(12,23));
        System.out.println("max:" + Math.max(Math.max(12,23),18));
        System.out.println("max:" + Math.max(Math.max(12,78),Math.max(34,56)));
        System.out.println("------------");
        System.out.println("pow:" + Math.pow(2,3));
        System.out.println("--------------");
        System.out.println("random:" + Math.random());
        System.out.println("random:" + ((int)(Math.random()*100) + 1));
        System.out.println("-----------");
        System.out.println("random:" + Math.round(12.34f));
        System.out.println("round:" + Math.round(12.56f));
        System.out.println("------------");
        System.out.println("sqrt:" + Math.sqrt(4));
    }
}
