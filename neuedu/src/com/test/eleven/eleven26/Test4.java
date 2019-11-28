package com.test.eleven.eleven26;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/26 14:17
 */
public class Test4 {
    public static void main(String[] args){
    Student2 s=  new Student2();
    s.show();
    s.show();
    System.out.println("-------------------");
    new Student2() .show();
    new Student2().show();
    System.out.println("------------");
    StudentDemo2 sd = new StudentDemo2();
    sd.method(new Student2());
    new StudentDemo2().method(new Student2());
    }
}

class Student2{
    public void show(){
        System.out.println("我爱学习");
    }
}

class StudentDemo2{
    public  void method(Student2 s){
        s.show();
    }
}