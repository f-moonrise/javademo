package com.test.twelve.twelve16;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/16 11:00
 */
public class StringBufferDemo3 {
    public static void main(String[] args) {
        //创建字符串缓冲区
        StringBuffer sb = new StringBuffer();

        //添加数据
        sb.append("hello");
        sb.append("world");
        sb.append("java");
        System.out.println("sb:" + sb);
        sb.replace(5,10,"节日快乐");
        System.out.println("sb:"+sb);
    }
}
