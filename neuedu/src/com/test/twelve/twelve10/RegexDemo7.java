package com.test.twelve.twelve10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 11:35
 */
public class RegexDemo7 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaaab");
        boolean b = m.matches();
        System.out.println(b);

        String s = "aaaaab";
        String regex = "a*b";
        boolean bb = s.matches(regex);
        System.out.println(bb);
    }
}
