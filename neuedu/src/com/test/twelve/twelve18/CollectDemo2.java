package com.test.twelve.twelve18;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/18 19:20
 */
public class CollectDemo2 {
    public static void main(String[] args){
        Collection c1 = new ArrayList();
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");

        Collection c2 = new ArrayList();
        c2.add("abc5");
        c2.add("abc6");
        c2.add("ab;kjhg7");

        System.out.println("addAll:"+ c1.addAll(c2));
        System.out.println("removeAll:"+c1.removeAll(c2));
        System.out.println("containsAll:"+c1.containsAll(c2));
        System.out.println("retainAll:"+c1.retainAll(c2));
        System.out.println("c1:"+c1);
        System.out.println("c2"+c2);

    }
}

