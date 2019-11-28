package com.test.eleven.eleven28;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/28 8:23
 */
public class Test2 {
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.num);
//        System.out.println(f.num2);
        f.show();
//        f.method();
        f.function();
    }
}

class Fu{
    public int num = 100;
    public void show(){
        System.out.println("show Fu");
    }
    public static void function(){
        System.out.println("function Fu");
    }
}

class Zi extends Fu{
    public int num = 1000;
    public int num2 = 200;
    public void show(){
        System.out.println("show zi");
    }
    public void method(){
        System.out.println("method zi");
    }
    public static void function(){
        System.out.println("function zi");
    }
}