package com.neuedu.planewar.entity;

import com.neuedu.planewar.client.PlaneWarClient;
import com.neuedu.planewar.common.ImageUtil;

import java.awt.*;
import java.util.Random;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 18:50
 */
public class Dackbg extends PlaneWarObject{

    static Image image =  ImageUtil.images.get("bg1_"+(1));

    public Dackbg(){}

    public Dackbg(PlaneWarClient pwc, int x, int y){
        this.pwc = pwc;
        this.x = x;
        this.y = y;
        this.speed = 5;
        this.width = image.getWidth(null);
        this.height = image.getHeight(null);
    }

    @Override
    public void move() {
        this.x -= speed;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(image,x,y,null);
        move();
    }

}
