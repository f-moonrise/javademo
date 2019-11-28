package com.test.eleven.eleven26;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/26 14:29
 */
public class Test5 {
    public static void main(String[] args){
    Student3 s = new Student3();
    s.show();
    System.out.println("-------------");
    s.name="小白";
    s.age=12;
    s.setAge(12);
    s.show();
    System.out.println("-------------");
    s.age=-1234;
    s.setAge(-1234);
    s.show();
    System.out.println("-----------");
    }
}

class Student3{
    String name;
    int age;
    public void setAge(int a){
        if(a<0 || age>120){
            System.out.println("有问题");
        }else{
            age=a;
        }
    }
    public void show(){
        System.out.println("姓名"+name);
        System.out.println("年龄"+age);
    }
}

