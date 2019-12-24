package com.test.twelve.zhouce2.Jie.GarbageImpl;

import com.test.twelve.zhouce2.Jie.Garbage;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/19 16:07
 */
public class HarmfulWaste extends Garbage {
    public String Gproperty="有害垃圾";
    public String Gname="电池";
    public int Gtype=1;





    @Override
    public void harm() {
        System.out.println("危害环境，危害地球，危害人类");
    }
}
