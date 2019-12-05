package com.test.twelve.zhouce1.Impl.testing;

import com.test.twelve.zhouce1.Util.Checkout;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/5 14:02
 */
public class TestVenus extends Checkout {
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    private String property = "金";

    @Override
    public void checkp() {
        System.out.println("金属性试炼关卡");
        new TestQuestion().quest();
    }
}
