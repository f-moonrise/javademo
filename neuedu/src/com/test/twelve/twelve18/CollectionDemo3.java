package com.test.twelve.twelve18;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/18 19:40
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");

        Object[] objs = c.toArray();
        for(int x=0;x<objs.length;x++){
            System.out.println(objs[x]);
//            System.out.println(objs[x] + "---                               -" + objs[x].length());

            String s = (String) objs[x];
            System.out.println(s + "----" + s.length());
        }
    }
}
