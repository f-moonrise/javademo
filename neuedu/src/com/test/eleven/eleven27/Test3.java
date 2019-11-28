package com.test.eleven.eleven27;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/27 10:37
 */
public class Test3 {
    public static void  main(String[] args){
        Zi1 z = new Zi1();
    }
}

class Fu1{
    static {
        System.out.println("静态代码块fu");
    }
    {
        System.out.println("构造代码块fu");
    }
    public Fu1(){
        System.out.println("构造方法Fu");
    }
}
class Zi1 extends  Fu1{
    static {
        System.out.println("静态代码块zi");
    }
    {
        System.out.println("构造代码块zi");
    }
    public Zi1(){
        System.out.println("构造方法zi");
    }
}
