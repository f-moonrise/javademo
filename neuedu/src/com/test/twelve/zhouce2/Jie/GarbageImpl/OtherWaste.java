package com.test.twelve.zhouce2.Jie.GarbageImpl;

import com.test.twelve.zhouce2.Jie.Garbage;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/19 16:11
 */
public class OtherWaste extends Garbage {
    public String Gproperty="其他垃圾";
    public String Gname="玻璃";
    public int Gtype=3;




    @Override
    public void harm() {
        System.out.println("一碰就碎");
    }
}
