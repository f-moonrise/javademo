package com.test.eleven.zhouce;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/14 17:54
 */
public class Test19 {
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%3!=0){
                sum=sum+i;
            }
        }
        System.out.println("1到100之间不能被3整除的数之和为:"+sum);
    }
}
