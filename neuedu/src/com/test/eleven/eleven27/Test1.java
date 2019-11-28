package com.test.eleven.eleven27;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/27 10:36
 */
public class Test1 {
    public static void main(String[] args){
    Son s = new Son();
    System.out.println("-=---------------------");
    Son ss = new Son("小白");
    }
}

class Father{
    public Father(String name){
        System.out.println("Father的带参构造方法");
    }
}

class Son extends Father{
    public Son(){
        super("随便给");
        System.out.println("Son的无参构造方法");
    }

    public  Son(String name){
        super("随便给");
        System.out.println("Son的带参构造方法");
    }
}