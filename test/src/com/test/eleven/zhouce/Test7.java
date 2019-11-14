package com.test.eleven.zhouce;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/14 16:33
 */
public class Test7 {
    public static void main(String[] args){
        boolean a=true;
        boolean b=false;
        boolean c=false;
        boolean d=true;

        System.out.println(a&b);
        System.out.println(!b);
        System.out.println(b||c);
        System.out.println(a||b||c||d);
        System.out.println(a||b&&c||d);

    }
}
