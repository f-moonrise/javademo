package com.test.twelve.twelve12;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 19:03
 */
public class IntegerDemo2 {
    public static void main(String[] args){
        Integer ii = 100;
        ii += 200;
        System.out.println("ii:" + ii);

        Integer iii = null;
        if(iii != null){
            iii += 1000;
            System.out.println(iii);
        }
    }
}
