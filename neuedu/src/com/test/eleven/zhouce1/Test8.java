package com.test.eleven.zhouce1;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/14 16:35
 */
public class Test8 {
    public static void main(String[] args){
        int num=999;
        int count=0;
        for(;num>0;num=num/10){
            count=count+1;
        }
        System.out.println(count);
    }
}
