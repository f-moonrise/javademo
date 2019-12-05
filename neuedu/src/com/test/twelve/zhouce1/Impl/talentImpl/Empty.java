package com.test.twelve.zhouce1.Impl.talentImpl;

import com.test.twelve.zhouce1.Util.Property;

/**
 * 空
 * @author zangye03@gmail.com
 * @date 2019/12/5 13:45
 */
public class Empty implements Property {
    private String property = "空";

    @Override
    public void element() {
        System.out.println("全元素亲和");
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
