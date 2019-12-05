package com.test.twelve.twelve03;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/3 13:36
 */
public class Test6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int g,s,b;
        int f=0;
        for(int i=100;i<999;i++){
            b=i/100;
            s=i/10%10;
            g=i%10;
            if(i==b*b*b+s*s*s+g*g*g){
                if(i>=m&&i<=n){
                    System.out.print(i+" ");
                    f=1;
                }
            }
        }
        if(f==0){
            System.out.print("no");
        }
    }
}
