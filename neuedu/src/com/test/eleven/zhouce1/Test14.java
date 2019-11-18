package com.test.eleven.zhouce1;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/14 16:53
 */
public class Test14 {
    public static void main(String[] args){
        int score=94;
        String sex="女";

        if(score>80){
            if(sex=="女"){
                System.out.println("进入女子决赛");
            }else{
                System.out.println("进入男子决赛");
            }
        }else{
            System.out.println("不足以进入决赛");
        }
    }
}