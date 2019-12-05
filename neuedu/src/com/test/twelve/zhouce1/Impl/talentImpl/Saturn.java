package com.test.twelve.zhouce1.Impl.talentImpl;

import com.test.twelve.zhouce1.Util.Property;

/**
 * &#x571f;
 * @author zangye03@gmail.com
 * @date 2019/12/5 13:42
 */
public class Saturn implements Property {
    private String property = "土";

    @Override
    public void element() {
        System.out.println("土元素亲和");
    }

    @Override
    public String pname() {
        return property;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

}
