package com.test.twelve.twelve16;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/16 11:27
 */
public class StringBufferDemo6 {
    public static void main(String[] args) {
        String s = "hello";
//        StringBuffer sb = "hello";
//        StringBuffer sb = s;

//        String sb = new StringBuffer(s);
        StringBuffer sb2 = new StringBuffer();
        sb2.append(s);
//        System.out.println("sb:" + sb);
        System.out.println("sb2" + sb2);
        System.out.println("-----------");

        StringBuffer buffer  = new StringBuffer("java");

        String str = new String(buffer);
        String str2 = buffer.toString();
        System.out.println("str:" + str);
        System.out.println("str2"+ str2);
    }
}
