package com.test.eleven.eleven29.shitou.pojo;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 14:40
 */
public class User {
    private String name;
    private String psd;
    private int Integral;

    public User(){}

    public User(String name, String psd){
        this.name = name;
        this.psd = psd;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    public int getIntegral() {
        return Integral;
    }

    public void setIntegral(int integral) {
        Integral = integral;
    }

    public User(String name, String psd, int integral) {
        this.name = name;
        this.psd = psd;
        Integral = integral;
    }
}
