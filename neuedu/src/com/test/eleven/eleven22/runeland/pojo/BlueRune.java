package com.test.eleven.eleven22.runeland.pojo;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/22 16:10
 */
public class BlueRune extends Epigraph{

    private double shengMing;//最大生命
    private double huiXue;//每秒回血
    private double moveSpeed;//移速
    private double adHurt;//物理攻击
    private double adXiXue;//物理吸血
    private double adFang;//物理防御
    private double apHurt;//法术攻击
    private double apXiXue;//法术吸血
    private double apFang;//法术防御
    private double baoJil;//暴击率
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

    public double getHuiXue() {
        return huiXue;
    }

    public double getMoveSpeed() {
        return moveSpeed;
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

    public double getApHurt() {
        return apHurt;
    }

    public double getapXiXue() {
        return apXiXue;
    }

    public double getApFang() {
        return apFang;
    }

    public double getBaoJil() {
        return baoJil;
    }

    public double getAdSpeed() {
        return adSpeed;
    }

    public void setShengMing(double shengMing) {
        this.shengMing = shengMing;
    }

    public void setHuiXue(double huiXue) {
        this.huiXue = huiXue;
    }

    public void setMoveSpeed(double moveSpeed) {
        this.moveSpeed = moveSpeed;
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

    public void setApHurt(double apHurt) {
        this.apHurt = apHurt;
    }

    public void setapXiXue(double apXiXue) {
        this.apXiXue = apXiXue;
    }

    public void setApFang(double apFang) {
        this.apFang = apFang;
    }

    public void setBaoJil(double baoJil) {
        this.baoJil = baoJil;
    }

    public void setAdSpeed(double adSpeed) {
        this.adSpeed = adSpeed;
    }

    public BlueRune(String fname, String color, int level,double shengMing, double huiXue, double moveSpeed, double adHurt, double adXiXue, double adFang, double apHurt, double apXiXue, double apFang, double baoJil, double adSpeed) {
        this.fname = fname;
        this.color = color;
        this.level = level;
        this.shengMing = shengMing;
        this.huiXue = huiXue;
        this.moveSpeed = moveSpeed;
        this.adHurt = adHurt;
        this.adXiXue = adXiXue;
        this.adFang = adFang;
        this.apHurt = apHurt;
        this.apXiXue = apXiXue;
        this.apFang = apFang;
        this.baoJil = baoJil;
        this.adSpeed = adSpeed;
    }

    public BlueRune(){

    }



}
