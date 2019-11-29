package com.test.eleven.eleven29;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 15:57
 */
public class StudentDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("洛璃",27);
        Student s2 = new Student("洛璃",27);
        System.out.println(s1==s2);
        Student s3 = s1;
        System.out.println(s1 == s3);
        System.out.println("--------------------------");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s1));
        System.out.println(s1.equals(s3));
        Student s4 = new Student("秋明",30);
        System.out.println(s1.equals(s4));

        Demo d = new Demo();
        System.out.println(s1.equals(d));
    }
}
class Demo{}