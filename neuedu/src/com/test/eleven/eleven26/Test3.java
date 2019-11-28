package com.test.eleven.eleven26;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/26 14:17
 */
public class Test3 {
    public static void main(String[] args){
        Demo d = new Demo();
        int result = d.sum(10,20);
        System.out.println("result" + result);
        System.out.println("-------------");
        StudentDemo sd = new StudentDemo();
        Student1 s = new Student1();
        sd.method(s);
    }
}

class Demo{
    public int sum(int a, int b){
        return a+b;
    }
}

class Student1{
    public void show(){
        System.out.println("woaixuexi");
    }
}

class StudentDemo{
    public void method(Student1 s){
        s.show();
    }
}

