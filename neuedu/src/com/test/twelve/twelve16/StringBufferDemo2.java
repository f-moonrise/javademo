package com.test.twelve.twelve16;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/16 10:57
 */
public class StringBufferDemo2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("hello").append("world").append("java");
        System.out.println("sb:" + sb);

        sb.deleteCharAt(1);
        sb.delete(5,10);

        sb.delete(0,sb.length());
        System.out.println("sb:" + sb);
    }
}
