package com.test.twelve.twelve10;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 10:19
 */
public class RegexTest2 {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] strArray = s.split(" ");
        int[] arr = new int[strArray.length];
        for(int x=0;x<arr.length;x++){
            arr[x] = Integer.parseInt(strArray[x]);
            //parseInt() 方法用于将字符串参数作为有符号的十进制整数进行解析。
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int x=0;x<arr.length;x++){
            sb.append(arr[x]).append(" ");
        }
        String result = sb.toString().trim();
        //trim() 方法用于删除字符串的头尾空白符。
        System.out.println("result:" + result);

    }
}
