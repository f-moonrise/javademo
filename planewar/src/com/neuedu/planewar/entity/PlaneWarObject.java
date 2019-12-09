package com.neuedu.planewar.entity;

import com.neuedu.planewar.client.PlaneWarClient;

import java.awt.*;

/**
 * 项目中所有类的父类
 * @author zangye03@gmail.com
 * @date 2019/12/6 9:40
 */
public abstract class PlaneWarObject implements Moveable,Drawable{
    public int x;
    public int y;
    public Image img;

    public int width;
    public int height;

    public int speed;

    public PlaneWarClient pwc;

    @Override
    public void move() {

    }

    @Override
    public void draw(Graphics g) {

    }

    public Rectangle getRectangle(){
        return new Rectangle(x,y,width,height);
    }
}
