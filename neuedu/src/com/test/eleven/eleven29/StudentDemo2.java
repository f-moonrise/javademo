package com.test.eleven.eleven29;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 16:02
 */
public class StudentDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s = new Student();
        s.setName("洛璃");
        s.setAge(27);


        Object obj = s.clone();
//        Student s2 = (Student)obj;
        System.out.println("---------");

        System.out.println(s.getName() + "----" + s.getAge());
//        System.out.println(s2.getName() + "-----" + s2.getAge());

        Student s3 = s;
        System.out.println(s3.getName() + "-----" + s3.getAge());
        System.out.println("-----------------");

        s3.setName("秋明");
        s3.setAge(30);
        System.out.println(s.getName() + "---" +s.getAge());
//        System.out.println(s2.getName() + "---" +s2.getAge());
        System.out.println(s3.getName() + "---" +s3.getAge());

    }
}
