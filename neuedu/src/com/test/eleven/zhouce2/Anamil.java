package com.test.eleven.zhouce2;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/21 14:07
 */
public class Anamil {
    String name;//名字
    int shux;//属性金-0，木-1，水-2，火-3，土-4    (int)(Math.random()*5)
    int nengl;//能力0-10      (int)(Math.random()*11)
    int level;//等级
    String jin;//技能

    Anamil(){

    }

    Anamil(String name, int shux, int nengl, int level, String jin){
        this.name = name;
        this.shux = shux;
        this.nengl = nengl;
        this.level = level;
        this.jin = jin;
    }



}
