package com.test.eleven.eleven27;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/27 16:26
 */
public class Test6 {
    public static void main(String[] args){
        A a = new B();
        a.show();
        B  b = new C();
        b.show();
    }
}

class A{
    public void show(){
        show2();
    }
    public void show2(){
        System.out.println("我");
    }
}
class B extends  A{
    public void show(){
        show2();
    }
    public void show2(){
        System.out.println("爱");
    }
}
class  C extends B{
    public void show(){
        super.show();
    }
    public void show2(){
        System.out.println("你");
    }
}