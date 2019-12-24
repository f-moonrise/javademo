package com.test.twelve.zhouce2.Jie.BinImpl;

import com.test.twelve.zhouce2.Jie.Bin;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/19 16:16
 */
public class KitchenBin extends Bin {
    public String Bproperty="厨房垃圾";
    public String Bname="饭桶";
    public int Bvolume = 10;

    @Override
    public void handle() {
        System.out.println("粒粒皆辛苦，赶紧吃了");
    }
}
