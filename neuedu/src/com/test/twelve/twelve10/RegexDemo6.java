package com.test.twelve.twelve10;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 10:28
 */
public class RegexDemo6 {
    public static void main(String[] args) {
        String s = "helloqq12345worldkh622112345678java";
        String regex = "\\d+";
        String ss = "";
        String result = s.replaceAll(regex,ss);
        System.out.println(result);
    }
}
