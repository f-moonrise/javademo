package com.neuedu.planewar.entity;

import com.neuedu.planewar.client.PlaneWarClient;
import com.neuedu.planewar.common.ImageUtil;
import com.neuedu.planewar.constant.Constant;

import java.awt.*;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 12:32
 */
public class Item extends PlaneWarObject{

    double theta = Math.random()*(Math.PI*2);

    int type;

    public Item(){}

    public Item(PlaneWarClient pwc,int x,int y,int type){
        this.pwc = pwc;
        this.x = x;
        this.y = y;
        this.speed = 5;
        this.type = type;
        this.img = confirmByType(type);
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);

    }

    private Image confirmByType(int type){
        switch (type){
            case 1:
                this.img = ImageUtil.images.get("HP");
                break;
            case 2:
                this.img = ImageUtil.images.get("DEF");
                break;
            default:
                break;
        }
        return img;
    }

    @Override
    public void draw(Graphics g) {
        switch (type){
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }

        g.drawImage(img,x,y,null);
        move();
    }

    @Override
    public void move() {
        x += (int)(speed*Math.cos(theta));
        y += (int)(speed*Math.sin(theta));
        //弹上下边
        if(y<=30||y>= Constant.FRAME_HEIGHT){
            theta = -theta;
        }
        if (x<=30||x>=Constant.FRAME_WIDTH){
            theta = Math.PI - theta;
        }
    }
}
