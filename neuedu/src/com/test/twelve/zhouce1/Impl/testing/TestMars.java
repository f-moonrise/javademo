package com.test.twelve.zhouce1.Impl.testing;

import com.test.twelve.zhouce1.Util.Checkout;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/5 14:03
 */
public class TestMars extends Checkout {

    private String property = "火";

    @Override
    public void checkp() {
        System.out.println("火属性试炼关卡");
        new TestQuestion().quest();
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

}
