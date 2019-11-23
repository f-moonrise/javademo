package com.test.eleven.eleven22.runeland.pojo;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/22 16:11
 */
public class OrangeRune extends Epigraph{

    private double shengMing;//最大生命
    private double adHurt;//物理攻击
    private double adXiXue;//物理吸血
    private double adFang;//物理防御
    private double adChuan;//物理穿透
    private double apHurt;//法术攻击
    private double apChuan;//法术穿透
    private double baoJil;//暴击率
    private double baoJix;//暴击效果
    private double adSpeed;//攻击速度

    public String getFname() {
        return fname;
    }

    public String getColor() {
        return color;
    }

    public int getLevel() {
        return level;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getShengMing() {
        return shengMing;
    }

    public double getAdHurt() {
        return adHurt;
    }

    public double getAdXiXue() {
        return adXiXue;
    }

    public double getAdFang() {
        return adFang;
    }

    public double getAdChuan() {
        return adChuan;
    }

    public double getApHurt() {
        return apHurt;
    }

    public double getApChuan() {
        return apChuan;
    }

    public double getBaoJil() {
        return baoJil;
    }

    public double getBaoJix() {
        return baoJix;
    }

    public double getAdSpeed() {
        return adSpeed;
    }

    public void setShengMing(double shengMing) {
        this.shengMing = shengMing;
    }

    public void setAdHurt(double adHurt) {
        this.adHurt = adHurt;
    }

    public void setAdXiXue(double adXiXue) {
        this.adXiXue = adXiXue;
    }

    public void setAdFang(double adFang) {
        this.adFang = adFang;
    }

    public void setAdChuan(double adChuan) {
        this.adChuan = adChuan;
    }

    public void setApHurt(double apHurt) {
        this.apHurt = apHurt;
    }

    public void setApChuan(double apChuan) {
        this.apChuan = apChuan;
    }

    public void setBaoJil(double baoJil) {
        this.baoJil = baoJil;
    }

    public void setBaoJix(double baoJix) {
        this.baoJix = baoJix;
    }

    public void setAdSpeed(double adSpeed) {
        this.adSpeed = adSpeed;
    }

    public OrangeRune(String fname, String color, int level,double shengMing, double adHurt, double adXiXue, double adFang, double adChuan, double apHurt, double apChuan, double baoJil, double baoJix, double adSpeed) {
        this.fname = fname;
        this.color = color;
        this.level = level;
        this.shengMing = shengMing;
        this.adHurt = adHurt;
        this.adXiXue = adXiXue;
        this.adFang = adFang;
        this.adChuan = adChuan;
        this.apHurt = apHurt;
        this.apChuan = apChuan;
        this.baoJil = baoJil;
        this.baoJix = baoJix;
        this.adSpeed = adSpeed;
    }

    public OrangeRune(){

    }

}
