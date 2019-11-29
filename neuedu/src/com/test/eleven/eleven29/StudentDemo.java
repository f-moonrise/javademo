package com.test.eleven.eleven29;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 9:54
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.hashCode());
        System.out.println(s.getClass().getName());
        System.out.println("---------------------");
        System.out.println(s.toString());
        System.out.println("---------------------");
        System.out.println(s.getClass().getName()+'@'
                + Integer.toHexString(s.hashCode()));
        System.out.println(s.toString());
        System.out.println(s);
    }
}
