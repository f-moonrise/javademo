package com.test.twelve.twelve03;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/3 11:44
 */
public class Test5 {
    public static void main(String[] args){
        String s1 = "helloworld";
        String s2 = "helloworld";
        String s3 = "HelloWorld";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println(s1.contains("hello"));
        System.out.println(s1.contains("hw"));

        System.out.println(s1.startsWith("h"));
        System.out.println(s1.startsWith("hello"));
        System.out.println(s1.startsWith("world"));

        System.out.println(s1.isEmpty());

        String s4="";
        String s5 = null;
        System.out.println(s4.isEmpty());
        System.out.println(s5.isEmpty());
    }
}
