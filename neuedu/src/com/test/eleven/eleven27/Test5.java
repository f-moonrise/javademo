package com.test.eleven.eleven27;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/27 14:45
 */
public class Test5 {
    public static void main(String[] args) {
        Fu3 f = new Zi3();
        f.show();
//        f.method;
    }
}
class Fu3{
    public void show(){
        System.out.println("show fu");
    }
}
class Zi3 extends Fu3{
    public void show(){
        System.out.println("showzi");
    }
    public void  method(){
        System.out.println("metyhod zi");
    }
}