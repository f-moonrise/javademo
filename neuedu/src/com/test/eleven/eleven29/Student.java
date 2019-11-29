package com.test.eleven.eleven29;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 15:50
 */
public class Student implements Cloneable {
    Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private String name;
    private int age;

}
