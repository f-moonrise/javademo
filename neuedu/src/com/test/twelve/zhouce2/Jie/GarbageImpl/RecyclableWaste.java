package com.test.twelve.zhouce2.Jie.GarbageImpl;

import com.test.twelve.zhouce2.Jie.Garbage;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/19 16:09
 */
public class RecyclableWaste extends Garbage {
    public String Gproperty="可回收垃圾";
    public String Gname="太阳能";
    public int Gtype=4;




    @Override
    public void harm() {
        System.out.println("原谅色，可以多次回收使用");
    }
}
