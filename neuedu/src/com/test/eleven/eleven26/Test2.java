package com.test.eleven.eleven26;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/26 14:13
 */
public class Test2 {
    int nus = 10;
    int num;

    public void show()
    {

        int num2 = 20;
        int num3 = 30;
        System.out.println(num2);
        System.out.println(num3);

        int num = 100;
        System.out.println(num);
    }
}

class Dda{
    public static void main(String[] args){
        Test2 v = new Test2();
        System.out.println(v.num);
        v.show();
    }
}
