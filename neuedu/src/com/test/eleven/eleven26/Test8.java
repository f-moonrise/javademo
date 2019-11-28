package com.test.eleven.eleven26;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/26 14:41
 */
public class Test8 {
    public static void main(String[] args){
        Son s = new Son();
        s.method();
        s.show();
        s.function();
    }
}

class Father{
    public int num=10;
    public int num2=20;

    public void method(){
        System.out.println(num);
        System.out.println(num2);
    }

    public void show(){
        System.out.println(num);
        System.out.println(num2);
    }
}

class Son extends Father{
    public void function(){
        System.out.println(num);
        System.out.println(num2);
    }

}