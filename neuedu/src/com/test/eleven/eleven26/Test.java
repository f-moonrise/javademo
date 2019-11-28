package com.test.eleven.eleven26;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/26 14:03
 */
public class Test {
    static {
        System.out.println("我喜欢Java");
    }

    public static void main(String[] args){
        System.out.println("我是main()方法");

        Student  s1 = new Student();
        Student s2 = new Student();
    }
}

class Student{
    static {
        System.out.println("Student静态代码块");
    }

    {
        System.out.println("Student静态代码块1");

    }

    public Student(){
        System.out.println("Student静态代2码块");

    }
}