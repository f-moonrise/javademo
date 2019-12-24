package com.test.twelve.zhouce2.Jie.BinImpl;

import com.test.twelve.zhouce2.Jie.Bin;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/19 16:17
 */
public class RecyclableBin extends Bin {
    public String Bproperty="可回收垃圾";
    public String Bname="原谅桶";
    public int Bvolume = 10;

    @Override
    public void handle() {
        System.out.println("再次加工，二次出售");
    }
}
