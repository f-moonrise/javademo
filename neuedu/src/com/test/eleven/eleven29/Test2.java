package com.test.eleven.eleven29;

import com.test.eleven.zhouce3.Products;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 9:54
 */
public  class Test2 {
    public static void main(String[] args) {
        Employee emp = new Programmer();
        emp.setName("小白");
        emp.setId("czbk001");
        emp.setSalary(18000);
        System.out.println(emp.getName() + emp.getId() + emp.getSalary());
        emp.work();
        System.out.println("---------------------");
        emp = new Programmer("小红","czk001",18000);
        System.out.println(emp.getName() + emp.getId() + emp.getSalary());
        emp.work();
        System.out.println("-------------------------");
        Manager m = new Manager();
        m.setName("小兰");
        m.setId("czbk002");
        m.setSalary(8000);
        m.setMoney(2000);
        System.out.println(m.getName() + m.getId() + m.getSalary() + m.getMoney());
        m.work();
        System.out.println("--------------------");
        m = new Manager("小紫","czbk002",8000,2000);
        System.out.println(m.getName() + m.getId() + m.getSalary() + m.getMoney());
        m.work();
    }
}
abstract class Employee{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private String name;
    private String id;
    private int salary;

    public Employee(){}

    public Employee(String name,String id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();
}

class Programmer extends Employee{
    public Programmer(){    }

    public Programmer(String name,String id, int salary){
        super(name, id, salary);
    }

    public void work(){
        System.out.println("按照需求写代码");
    }
}

class Manager extends Employee{
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    private  int money;

    public Manager(){}

    public Manager(String name,String id, int salary, int money){
        super(name, id, salary);
        this.money = money;
    }

    public void work(){
        System.out.println("跟客户谈需求");
    }



}