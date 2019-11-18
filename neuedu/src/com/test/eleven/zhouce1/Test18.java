package com.test.eleven.zhouce1;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/14 17:43
 */
public class Test18 {
    public static void main(String[] args){
        int sum=0;
        int num=2;
        do{
            sum=sum+num;
            num=num+2;
        }while(num<49);
        System.out.println("50以内的偶数之和为:"+sum);
    }
}
