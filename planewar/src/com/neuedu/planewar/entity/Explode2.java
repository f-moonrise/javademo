package com.neuedu.planewar.entity;

import com.neuedu.planewar.client.PlaneWarClient;
import com.neuedu.planewar.common.ImageUtil;

import java.awt.*;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 23:35
 */
public class Explode2 extends PlaneWarObject{
    public static Image[] images = new Image[5];
    static {
        for(int i=0;i<images.length;i++){
            images[i] = ImageUtil.images.get("explode1_"+(i+1));
        }
    }

    public Explode2(){}

    public Explode2(PlaneWarClient pwc, int x, int y){
        this.pwc = pwc;
        this.x = x;
        this.y = y;
        this.width = (images[0].getWidth(null));
        this.height = (images[0].getHeight(null));
    }

    int count = 0;
    @Override
    public void draw(Graphics g) {
        if(count > 4){
            count = 0;
            this.pwc.explodes2.remove(this);
            return;
        }
        g.drawImage(images[count],x,y,null);
        count++;
    }
}
