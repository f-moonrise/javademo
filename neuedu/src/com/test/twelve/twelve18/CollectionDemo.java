package com.test.twelve.twelve18;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/18 18:55
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //Collection c = new Collection();
        Collection c = new ArrayList();

        System.out.println("add:" + c.add("hello"));
        c.add("hello");
        c.add("world");
        c.add("java");

//        c.clear();

        System.out.println("remove:"+c.remove("hello"));
        System.out.println("remove:"+c.remove("javaee"));
        System.out.println("contains:"+c.contains("hello"));
        System.out.println("contains:"+c.contains("android"));
        System.out.println("isEmpty:"+c.isEmpty());
        System.out.println("size:"+c.size());
        System.out.println("c:"+c);
    }
}
