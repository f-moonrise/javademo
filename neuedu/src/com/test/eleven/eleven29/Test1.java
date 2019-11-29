package com.test.eleven.eleven29;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 9:54
 */
public class Test1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("旺财");
        d.setAge(3);
        System.out.println(d.getName()+ d.getAge());
        d.eat();
        Dog d2 = new Dog("旺财", 3);
        System.out.println(d.getName()+ d.getAge());
        d.eat();
        Aninmal a = new Dog();
        a.setName("旺财");
        a.setAge(3);
        System.out.println(a.getName()+ a.getAge());
        a.eat();
        Aninmal a2 = new Dog("旺财", 3);
        System.out.println(a2.getName()+ a2.getAge());
        a2.eat();
    }
}
abstract class Aninmal{
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    public Aninmal(){}
    public Aninmal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public abstract void eat();
}

class Dog extends Aninmal{
    public Dog(){}

    public Dog(String name, int age){
        super(name,age);
    }
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}

class Cat extends Aninmal{
    public Cat(){    }

    public Cat(String name, int age){
        super(name, age);
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }
}
