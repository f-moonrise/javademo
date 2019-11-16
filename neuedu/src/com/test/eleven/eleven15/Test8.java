package com.test.eleven.eleven15;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/15 16:49
 */
public class Test8 {
    public static void main(String[] args){
        double a=2.5;
        double x=5*a-6;
        int count=0;
        double sum=0;
        for(;sum<100;count++){
            sum=x*count;
        }
        System.out.println(count-2);
        double f=(count-2)*x;
        System.out.println(f);

        System.out.println((count-2)*5+(100-f)/a);

    }
}
