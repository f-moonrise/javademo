package com.test.twelve.twelve12;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 19:14
 */
public class CharacterTest {
    public static void main(String[] args) {
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String line = sc.nextLine();

        char[] chs = line.toCharArray();

        for(int x=0;x<chs.length;x++){
            char ch = chs[x];
            if(Character.isUpperCase(ch)){
                bigCount++;
            }else if(Character.isLowerCase(ch)){
                smallCount++;
            }else if(Character.isDigit(ch)){
                numberCount++;
            }
        }
        System.out.println("大写字母:" + bigCount + "个");
        System.out.println("小写字母:" + smallCount + "个");
        System.out.println("数字字母:" + numberCount + "个");
    }
}
