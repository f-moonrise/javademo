package com.test.twelve.twelve10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 11:37
 */
public class RegexDemo8 {
    public static void main(String[] args) {
        String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
        String regex = "\\b\\w{3}\\b";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while (m.find()){
            System.out.println(m.group());
        }
    }
}
