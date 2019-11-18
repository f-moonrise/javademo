package com.test.eleven.zhouce1;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/14 17:57
 */
public class Test20 {
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+i;
            if(sum>20){
                System.out.println("当前的累加值为:"+sum);
                break;
            }
        }
    }
}
