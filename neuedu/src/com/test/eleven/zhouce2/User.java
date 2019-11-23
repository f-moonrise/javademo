package com.test.eleven.zhouce2;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/21 12:54
 */
public class User {
    String name;//姓名
    String menp;//门派
    String xingb;//性别
    int age;//年龄

    User(){

    }

    User(String name,String menp,String xingb,int age){
        this.name = name;
        this.menp = menp;
        this.xingb = xingb;
        this.age = age;
    }
}
