package com.test.twelve.twelve16;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/16 10:55
 */
public class StringBufferDemo1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("hello").append(true).append(12).append(34.56);
        System.out.println("sb:" + sb);

        sb.insert(5,"world");
        System.out.println("sb:"+sb);
    }
}
