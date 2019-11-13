package com.test.eleven13;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/13 10:47
 */
public class Test1 {
    public static void main(String[] args){
//        int a=900;
//        int b=1250;
//        int q=24;
//        int w=30;
//        int e=32;
        int x=1,y=1;
//        (54x+24y)==900
//        (32x+62y)==1250
        char l;
        for(x=1;x<50;x++)
        {
            for(y=1;y<50;y++){
                if(54*x+24*y==900){
                    if(32*x+62*y==1250){
                        System.out.println("X="+x);
                        System.out.println("Y="+y);
                    }
                }
            }
        }

//        double m=((900-24*l)/54.0);
//        32*m+62*l=1250;
//        (900-24*l)/54.0*32+62*l=1250;



    }
}
