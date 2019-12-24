package com.test.twelve.zhouce2.Jie.BinImpl;

import com.test.twelve.zhouce2.Jie.Bin;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/19 16:16
 */
public class HarmfulBin extends Bin {
    public String Bproperty="有害垃圾";
    public String Bname="辐射桶";
    public int Bvolume = 10;

    @Override
    public void handle() {
        System.out.println("送往黑洞处理");
    }


}
