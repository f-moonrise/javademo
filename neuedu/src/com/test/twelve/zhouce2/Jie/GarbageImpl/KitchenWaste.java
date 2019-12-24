package com.test.twelve.zhouce2.Jie.GarbageImpl;

import com.test.twelve.zhouce2.Jie.Garbage;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/19 16:09
 */
public class KitchenWaste extends Garbage {
    public String Gproperty="厨房垃圾";
    public String Gname="汉堡";
    public int Gtype=2;




    @Override
    public void harm() {
        System.out.println("浪费粮食，可耻，可恨，更可恶");
    }
}
