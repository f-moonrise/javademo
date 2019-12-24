package com.test.twelve.twelve19;

import java.util.LinkedList;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/20 19:28
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();

        link.add("hello");
        link.add("world");
        link.add("java");

        link.addFirst("javaee");
        link.addLast("android");

        System.out.println("" + link.getFirst());
        System.out.println("" + link.getLast());
        System.out.println("" + link.removeFirst());
        System.out.println("" + link.removeLast());
        System.out.println("" + link);
    }
}
