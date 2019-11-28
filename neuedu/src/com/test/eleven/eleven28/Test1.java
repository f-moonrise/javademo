package com.test.eleven.eleven28;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/28 8:11
 */
public class Test1 {
    public static void main(String[] args) {
        int x = 10;
        x = 100;
        System.out.println(x);
        final int y = 10;

//        y = 100;
        System.out.println(y);
        System.out.println("-----------------");

        Student s = new Student();
        System.out.println(s.age);
        s.age = 100;
        System.out.println(s.age);
        System.out.println("-----------");

        final Student ss= new Student();
        System.out.println(ss.age);
        ss.age = 100;
        System.out.println(ss.age);

//        ss = new Student();
    }
}
class Student{
    int age=10;
}
