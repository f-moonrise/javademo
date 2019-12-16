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
        //\b
        //匹配一个字边界，即字与空格间的位置。例如，"er\b"匹配"never"中的"er"，但不匹配"verb"中的"er"。

/**
 * Pattern 类：
 * pattern 对象是一个正则表达式的编译表示。Pattern 类没有公共构造方法。要创建一个 Pattern 对象，
 * 你必须首先调用其公共静态编译方法，它返回一个 Pattern 对象。该方法接受一个正则表达式作为它的第一个参数。
 *
 * Matcher 类：
 * Matcher 对象是对输入字符串进行解释和匹配操作的引擎。与Pattern 类一样，Matcher 也没有公共构造方法。
 * 你需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象。
 *
 * PatternSyntaxException：
 * PatternSyntaxException 是一个非强制异常类，它表示一个正则表达式模式中的语法错误。
 */
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while (m.find()){
            System.out.println(m.group());
        }
    }
}
