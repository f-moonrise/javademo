package com.test.eleven.eleven15;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/15 15:40
 */
public class Test5 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int x=in.nextInt();
        int y=in.nextInt();


        for(int i=1;i<=x;i++){
            for(int k=1;k<=y-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("#");
            }
            System.out.println();
        }


        for(int i=x-1;i>=1;i--){
            for(int k=y-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
