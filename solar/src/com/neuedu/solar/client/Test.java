package com.neuedu.solar.client;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/5 18:35
 */
public class Test {
    public static void main(String[] args) {
//        for(int i=0;i<100;i++){
//            System.out.print("["+(int)(Math.random()*6) + "]");
//        }
        mystery(1234);
    }

    public static void mystery (int x)
    {
        System.out.print(x % 10);

        if ((x / 10) != 0)
        {
            mystery(x / 10);
        }
        System.out.print(x % 10);
    }
}
