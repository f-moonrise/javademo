package com.neuedu.planewar.entity;

import com.neuedu.planewar.client.PlaneWarClient;
import com.neuedu.planewar.common.ImageUtil;

import java.awt.*;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/11 15:11
 */
public class Bossex extends PlaneWarObject{
    public static Image[] images = new Image[5];
    static {
        for(int i=0;i<images.length;i++){
            images[i] = ImageUtil.images.get("bossex0_"+(i+1));
        }
    }

    public Bossex(){}

    public Bossex(PlaneWarClient pwc, int x, int y){
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
            this.pwc.bossexes.remove(this);
            this.pwc.bskey=false;
            return;
        }
        g.drawImage(images[count],x,y,null);
        count++;
    }
}
