package com.test.eleven.eleven22.runeland.pojo;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/22 16:11
 */
public class GreenRune extends Epigraph{

    private int shengMing;//最大生命
    private int huiXue;//每秒回血
    private int adHurt;//物理攻击
    private int adFang;//物理防御
    private int adChuan;//物理穿透
    private int apHurt;//法术攻击
    private int apXiXue;//法术吸血
    private int apFang;//法术防御
    private int apChuan;//法术穿透
    private int baoJil;//暴击率
    private int adSpeed;//攻击速度
    private int lengQue;//冷却

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

    public int getAdHurt() {
        return adHurt;
    }

    public int getAdFang() {
        return adFang;
    }

    public int getAdChuan() {
        return adChuan;
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

    public int getApChuan() {
        return apChuan;
    }

    public int getBaoJil() {
        return baoJil;
    }

    public int getAdSpeed() {
        return adSpeed;
    }

    public int getLengQue() {
        return lengQue;
    }

    public void setShengMing(int shengMing) {
        this.shengMing = shengMing;
    }

    public void setHuiXue(int huiXue) {
        this.huiXue = huiXue;
    }

    public void setAdHurt(int adHurt) {
        this.adHurt = adHurt;
    }

    public void setAdFang(int adFang) {
        this.adFang = adFang;
    }

    public void setAdChuan(int adChuan) {
        this.adChuan = adChuan;
    }

    public void setApHurt(int apHurt) {
        this.apHurt = apHurt;
    }

    public void setapXiXue(int aXiXue) {
        this.apXiXue = aXiXue;
    }

    public void setApFang(int apFang) {
        this.apFang = apFang;
    }

    public void setApChuan(int apChuan) {
        this.apChuan = apChuan;
    }

    public void setBaoJil(int baoJil) {
        this.baoJil = baoJil;
    }

    public void setAdSpeed(int adSpeed) {
        this.adSpeed = adSpeed;
    }

    public void setLengQue(int lengQue) {
        this.lengQue = lengQue;
    }

    public GreenRune(String fname, String color, int level,int shengMing, int huiXue, int adHurt, int adFang, int adChuan, int apHurt, int apXiXue, int apFang, int apChuan, int baoJil, int adSpeed, int lengQue) {
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
