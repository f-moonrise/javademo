package com.test.twelve.twelve16;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/16 11:03
 */
public class StringBufferDemo4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("白白小爱我");
        System.out.println("sb:"+sb);

        sb.reverse();
        //reverse() 方法用于颠倒数组中元素的顺序。
        System.out.println("Sb:" + sb);
    }
}
