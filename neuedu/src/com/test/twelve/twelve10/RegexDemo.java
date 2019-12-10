package com.test.twelve.twelve10;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 8:18
 */
public class RegexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的QQ密码:");
        String qq = sc.nextLine();

        System.out.println("checkQQ:" + checkQQ(qq));
    }

    public static boolean checkQQ(String qq){
        boolean flag = true;

        if(qq.length()>=5 && qq.length()<=15){
            if(!qq.startsWith("0")){
                char[] chs = qq.toCharArray();
                //String.toCharArray 方法 ,作用：将字符串转换为字符数组。
                for(int x=0;x<chs.length;x++){
                    char ch = chs[x];
                    if (!Character.isDigit(ch)){
                        //确定指定的字符是否是数字
                        flag = false;
                        break;
                    }
                }
            }else {
                flag = false;
            }
        }else {
            flag = false;
        }
        return flag;
    }
}
