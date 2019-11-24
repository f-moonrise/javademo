package com.test.eleven.eleven22.runeland.pojo;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/22 16:11
 */
public class OrangeRune extends Epigraph{


    private int shengMing;//最大生命
    private int adHurt;//物理攻击
    private int adXiXue;//物理吸血
    private int adFang;//物理防御
    private int adChuan;//物理穿透
    private int apHurt;//法术攻击
    private int apChuan;//法术穿透
    private int baoJil;//暴击率
    private int baoJix;//暴击效果
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

    public int getAdHurt() {
        return adHurt;
    }

    public int getAdXiXue() {
        return adXiXue;
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

    public int getApChuan() {
        return apChuan;
    }

    public int getBaoJil() {
        return baoJil;
    }

    public int getBaoJix() {
        return baoJix;
    }

    public int getAdSpeed() {
        return adSpeed;
    }

    public void setShengMing(int shengMing) {
        this.shengMing = shengMing;
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

    public void setAdChuan(int adChuan) {
        this.adChuan = adChuan;
    }

    public void setApHurt(int apHurt) {
        this.apHurt = apHurt;
    }

    public void setApChuan(int apChuan) {
        this.apChuan = apChuan;
    }

    public void setBaoJil(int baoJil) {
        this.baoJil = baoJil;
    }

    public void setBaoJix(int baoJix) {
        this.baoJix = baoJix;
    }

    public void setAdSpeed(int adSpeed) {
        this.adSpeed = adSpeed;
    }

    public OrangeRune(String fname, String color, int level,int shengMing, int adHurt, int adXiXue, int adFang, int adChuan, int apHurt, int apChuan, int baoJil, int baoJix, int adSpeed) {
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
