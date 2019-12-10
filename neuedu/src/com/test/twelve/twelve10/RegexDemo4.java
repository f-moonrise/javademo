package com.test.twelve.twelve10;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 8:51
 */
public class RegexDemo4 {
    public static void main(String[] args) {
        String ages = "18-24";
        String regex = "-";

        String[] strArray = ages.split(regex);
        //分割功能，以regex为分割基准
        int startAge = Integer.parseInt(strArray[0]);
        int endAge = Integer.parseInt(strArray[1]);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄:");
        int age = sc.nextInt();

        if(age>=startAge&&age<=endAge){
            System.out.println("你就是我想找的");
        }else{
            System.out.println("不符合我的要求，gun");
        }
    }
}
