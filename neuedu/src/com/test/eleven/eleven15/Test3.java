package com.test.eleven.eleven15;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/15 14:22
 */
public class Test3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int x=in.nextInt();
        int y=in.nextInt();

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<=5;i++){
            for(int k=1;k<=5-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<y;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
