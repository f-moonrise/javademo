package com.test.twelve.zhouce2.Jie.BinImpl;

import com.test.twelve.zhouce2.Jie.Bin;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/19 16:17
 */
public class OtherBin extends Bin {
    public String Bproperty="其他垃圾";
    public String Bname="异类桶";
    public int Bvolume = 10;

    @Override
    public void handle() {
        System.out.println("没什么鸟用");
    }
}
