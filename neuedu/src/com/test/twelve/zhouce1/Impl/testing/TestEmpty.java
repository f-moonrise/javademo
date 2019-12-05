package com.test.twelve.zhouce1.Impl.testing;

import com.test.twelve.zhouce1.Util.Checkout;
import com.test.twelve.zhouce1.Util.SpecialEvent;


/**
 * @author zangye03@gmail.com
 * @date 2019/12/5 14:21
 */
public class TestEmpty extends Checkout implements SpecialEvent {

    private String property = "空";

    @Override
    public void checkp() {
        System.out.println("空属性试炼");

    }

    @Override
    public void checks() {
        int a = (int)(Math.random()*10);
        if(a>6){
            System.out.println("恭喜你触发特殊关卡");
            new TestQuestion().quest();
        }
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
