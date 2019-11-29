package com.test.eleven.eleven29;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 9:54
 */
public class Test3 {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        System.out.println(i.num);
        System.out.println(i.num2);
//        i.num = 100;
//        i.num2 = 200;
        System.out.println(i.num);
        System.out.println(i.num2);
        System.out.println(Inter.num);
        System.out.println(Inter.num2);
    }
}
interface Inter{
    public int num = 10;
    public final int num2 = 20;
    public static final int num3 = 30;
    public void show();
}
class InterImpl extends Object implements Inter{
    public InterImpl(){
        super();
    }

    public void show(){

    }
}