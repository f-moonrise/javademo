package com.test.twelve.twelve16;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/16 11:05
 */
public class StringBufferDemo5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("hello").append("world").append("java");
        System.out.println("sb:"+sb);

        String s = sb.substring(5);
        System.out.println("s:" + s);
        System.out.println("sb:"+sb);

        String ss = sb.substring(5,10);
        System.out.println("ss:" + ss);
        System.out.println("sb:" + sb);
    }
}
