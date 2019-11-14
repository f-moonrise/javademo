package com.test.eleven.eleven14;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/14 13:38
 */
public class Test2 {
    public static void main(String[] args){
        for(int i=1; i<11;i++){
            System.out.print("("+i+")");
        }


        int j=0;
        for(int i=1;i<11;i++){
            j=j+i;
        }
        System.out.println("\n"+j);

        int m=0;
        for(int i=1;i<100;i+=2){
            m=m+i;
        }
        System.out.println(m);


    }
}
