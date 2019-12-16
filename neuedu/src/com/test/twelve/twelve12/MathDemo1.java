package com.test.twelve.twelve12;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 19:28
 */
public class MathDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始数:");
        int start = sc.nextInt();
        System.out.println("请输入结束数");
        int end = sc.nextInt();

        for(int x=0;x<100;x++){
            int num = getRandmo(start,end);
        }
    }

    public static int getRandmo(int start,int end){
        int number = (int)(Math.random()*(end-start+1))+start;
        return number;
    }
}
