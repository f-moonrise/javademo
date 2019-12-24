package com.test.twelve.twelve19;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/19 9:52
 */
public class Test1 {
    public void add(Byte b){
        b = b++;
    }

    public void test(){
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a + " ");
        add(b);
        System.out.println(b + "");
    }

    public static void main(String[] args) {
        new Test1().test();
    }
}
