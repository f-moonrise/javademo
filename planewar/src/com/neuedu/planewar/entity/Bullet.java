package com.neuedu.planewar.entity;

import com.neuedu.planewar.common.ImageUtil;

import java.awt.*;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/6 17:39
 */
public class Bullet extends PlaneWarObject{
    public Bullet(){}

    public Bullet(int x,int y){
        this.x = x;
        this.y = y;
        this.img = ImageUtil.images.get("bullet0_01");
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
        this.speed = 1;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(img,x,y,null);
        move();
    }

    @Override
    public void move() {
        x += speed;
    }
}
