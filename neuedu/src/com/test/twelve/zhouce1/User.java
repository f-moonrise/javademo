package com.test.twelve.zhouce1;

import com.test.twelve.zhouce1.Util.Property;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/5 13:22
 */
public class User {
    /**
     * 用户名
     */
    private String uname;
    /**
     * 天赋属性
     */
    private Property property;
    /**
     * 通行证
     */
    private String pass;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public User(String uname, Property property, String pass) {
        this.uname = uname;
        this.property = property;
        this.pass = pass;
    }

    public User(){}
}
