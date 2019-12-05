package com.test.twelve.zhouce1.Impl.talentImpl;

import com.test.twelve.zhouce1.Util.Property;

/**
 * 金
 * @author zangye03@gmail.com
 * @date 2019/12/5 13:40
 */
public class Venus implements Property {
    private String property = "金";

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public void element() {
        System.out.println("金元素亲和");
    }

    @Override
    public String pname() {
        return property;
    }
}
