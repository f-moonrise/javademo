package com.test.twelve.zhouce2.Jie.BinImpl;

import com.test.twelve.zhouce2.Jie.Bin;
import com.test.twelve.zhouce2.Jie.Ranklist;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/19 16:56
 */
public class RankBin extends Bin implements Ranklist {
    public String Bproperty="智能垃圾回收";
    public String Bname="智能桶";
    public int Bvolume = 10;

    @Override
    public void mutual() {
        System.out.println("你是什么垃圾，还得我出马");
    }

    @Override
    public void handle() {
        System.out.println("无人工，智能处理");
    }
}
