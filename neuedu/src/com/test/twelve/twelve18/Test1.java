package com.test.twelve.twelve18;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/18 9:16
 */
public class Test1 {
    public static void main(String[] args) {
        Test1 obj = new D();
        System.out.println(obj instanceof B);
        System.out.println(obj instanceof C);
        System.out.println(obj instanceof D);
        System.out.println(obj instanceof Test1);
    }
}

class B extends Test1 {}
class C extends Test1 {}
class D extends B{}
