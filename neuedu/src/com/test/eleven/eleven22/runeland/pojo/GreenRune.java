package com.test.eleven.eleven22.runeland.pojo;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/22 16:11
 */
public class GreenRune extends Epigraph{

    private double shengMing;//最大生命
    private double huiXue;//每秒回血
    private double adHurt;//物理攻击
    private double adFang;//物理防御
    private double adChuan;//物理穿透
    private double apHurt;//法术攻击
    private double apXiXue;//法术吸血
    private double apFang;//法术防御
    private double apChuan;//法术穿透
    private double baoJil;//暴击率
    private double adSpeed;//攻击速度
    private double lengQue;//冷却

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

    public double getHuiXue() {
        return huiXue;
    }

    public double getAdHurt() {
        return adHurt;
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

    public double getapXiXue() {
        return apXiXue;
    }

    public double getApFang() {
        return apFang;
    }

    public double getApChuan() {
        return apChuan;
    }

    public double getBaoJil() {
        return baoJil;
    }

    public double getAdSpeed() {
        return adSpeed;
    }

    public double getLengQue() {
        return lengQue;
    }

    public void setShengMing(double shengMing) {
        this.shengMing = shengMing;
    }

    public void setHuiXue(double huiXue) {
        this.huiXue = huiXue;
    }

    public void setAdHurt(double adHurt) {
        this.adHurt = adHurt;
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

    public void setapXiXue(double aXiXue) {
        this.apXiXue = aXiXue;
    }

    public void setApFang(double apFang) {
        this.apFang = apFang;
    }

    public void setApChuan(double apChuan) {
        this.apChuan = apChuan;
    }

    public void setBaoJil(double baoJil) {
        this.baoJil = baoJil;
    }

    public void setAdSpeed(double adSpeed) {
        this.adSpeed = adSpeed;
    }

    public void setLengQue(double lengQue) {
        this.lengQue = lengQue;
    }

    public GreenRune(String fname, String color, int level,double shengMing, double huiXue, double adHurt, double adFang, double adChuan, double apHurt, double apXiXue, double apFang, double apChuan, double baoJil, double adSpeed, double lengQue) {
        this.fname = fname;
        this.color = color;
        this.level = level;
        this.shengMing = shengMing;
        this.huiXue = huiXue;
        this.adHurt = adHurt;
        this.adFang = adFang;
        this.adChuan = adChuan;
        this.apHurt = apHurt;
        this.apXiXue = apXiXue;
        this.apFang = apFang;
        this.apChuan = apChuan;
        this.baoJil = baoJil;
        this.adSpeed = adSpeed;
        this.lengQue = lengQue;
    }

    public GreenRune(){

    }


}
