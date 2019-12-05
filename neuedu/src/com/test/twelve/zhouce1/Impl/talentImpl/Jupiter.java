package com.test.twelve.zhouce1.Impl.talentImpl;

import com.test.twelve.zhouce1.Util.Property;

/**
 * 木
 * @author zangye03@gmail.com
 * @date 2019/12/5 13:41
 */
public class Jupiter implements Property {
    private String property = "木";

    @Override
    public void element() {
        System.out.println("木元素亲和");
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
