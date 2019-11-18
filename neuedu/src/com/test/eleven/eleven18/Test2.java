package com.test.eleven.eleven18;

import java.util.Random;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/18 18:25
 */
public class Test2 {
    public static void main(String [] args){
        Random random = new Random();

//        int fs=random.nextInt(2)+1;
        for(int i=0;i<1000;i++) {
            int fs=random.nextInt(3)+1;
            System.out.print("("+fs+")");
        }
    }
}
