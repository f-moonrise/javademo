package com.test.eleven.zhouce1;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/14 17:23
 */
public class Test15 {
    public static void main(String[] args){
        int age=25;

        if(age>=60){
            System.out.println("老年");
        }else if(age>=40&&age<60){
            System.out.println("中年");
        }else if(age>=18&&age<40){
            System.out.println("少年");
        }else{
            System.out.println("童年");
        }
    }
}
