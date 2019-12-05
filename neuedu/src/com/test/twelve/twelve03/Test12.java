package com.test.twelve.twelve03;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/3 16:41
 */
public class Test12 {
    public static void main(String[] args) {
        String maxString = "woaijava";
        String minString = "java";
        int count = getCount(maxString,minString);
        System.out.println("Java在字符串中出现了" +  count + "次");
    }

    public static int getCount(String maxString,String minString){
        int count= 0;
        int index=maxString.indexOf(minString);
        while (index!=-1){
            count++;
            int startIndex = index + minString.length();
            maxString = maxString.substring(startIndex);
            index = maxString.indexOf(minString);
        }
        return count;
    }
}
