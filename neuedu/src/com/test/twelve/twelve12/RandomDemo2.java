package com.test.twelve.twelve12;

import java.util.Random;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/12 19:31
 */
public class RandomDemo2 {
    public static void main(String[] args) {
        Random r = new Random(1111);
        //使用单个long种子创建新的随机数生成器。 种子是通过方法next(int)维护的伪随机数发生器的内部状态的初始值。
        //????????
        for(int x=0;x<10;x++){
            int num = r.nextInt(100)+1;
            System.out.println(num);
        }
    }
}
