package com.test.eleven.eleven22.runeland.pojo;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/22 16:10
 */
public class BlueRune extends Epigraph{

    private int shengMing;//最大生命
    private int huiXue;//每秒回血
    private int moveSpeed;//移速
    private int adHurt;//物理攻击
    private int adXiXue;//物理吸血
    private int adFang;//物理防御
    private int apHurt;//法术攻击
    private int apXiXue;//法术吸血
    private int apFang;//法术防御
    private int baoJil;//暴击率
    private int adSpeed;//攻击速度


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

    public int getShengMing() {
        return shengMing;
    }

    public int getHuiXue() {
        return huiXue;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public int getAdHurt() {
        return adHurt;
    }

    public int getAdXiXue() {
        return adXiXue;
    }

    public int getAdFang() {
        return adFang;
    }

    public int getApHurt() {
        return apHurt;
    }

    public int getapXiXue() {
        return apXiXue;
    }

    public int getApFang() {
        return apFang;
    }

    public int getBaoJil() {
        return baoJil;
    }

    public int getAdSpeed() {
        return adSpeed;
    }

    public void setShengMing(int shengMing) {
        this.shengMing = shengMing;
    }

    public void setHuiXue(int huiXue) {
        this.huiXue = huiXue;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public void setAdHurt(int adHurt) {
        this.adHurt = adHurt;
    }

    public void setAdXiXue(int adXiXue) {
        this.adXiXue = adXiXue;
    }

    public void setAdFang(int adFang) {
        this.adFang = adFang;
    }

    public void setApHurt(int apHurt) {
        this.apHurt = apHurt;
    }

    public void setapXiXue(int apXiXue) {
        this.apXiXue = apXiXue;
    }

    public void setApFang(int apFang) {
        this.apFang = apFang;
    }

    public void setBaoJil(int baoJil) {
        this.baoJil = baoJil;
    }

    public void setAdSpeed(int adSpeed) {
        this.adSpeed = adSpeed;
    }

    public BlueRune(String fname, String color, int level,int shengMing, int huiXue, int moveSpeed, int adHurt, int adXiXue, int adFang, int apHurt, int apXiXue, int apFang, int baoJil, int adSpeed) {
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
