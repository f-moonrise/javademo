package com.test.twelve.zhouce2;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/19 16:19
 */
public class User {

    int uproperty;//属性用于积分加倍
    String uname;
    int integrate;
    int function;//功能用于增加智能回收的概率

    User(){}

    public User(String uname, int integrate, int uproperty, int function) {
        this.uproperty = uproperty;
        this.uname = uname;
        this.integrate = integrate;
        this.function = function;
    }

    public void rule(){
        System.out.println("哇哇哇哇，呜呜呜呜");
        System.out.println("我感动了天感动了地");
        System.out.println("就是感动不了这些垃圾");
    }
}
