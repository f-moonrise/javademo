package com.test.twelve.twelve12;

import java.util.Arrays;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 19:34
 */
public class SystemDemo1 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {11,22,33,44,55};
        int[] arr2 = {6,7,8,9,10};

        //请大家看这个代码的意思
        System.arraycopy(arr,1,arr2,2,2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
