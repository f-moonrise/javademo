package com.neuedu.planewar.entity;

import com.neuedu.planewar.client.PlaneWarClient;
import com.neuedu.planewar.common.ImageUtil;
import com.neuedu.planewar.constant.Constant;

import java.awt.*;
import java.util.Random;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 14:21
 */
public class Dackdrop extends PlaneWarObject{

    int count ;

    public static Image[] images = new Image[25];
    static {
        for(int i=0;i<images.length;i++){
            images[i] = ImageUtil.images.get("bg_"+(i+1));
        }
    }

    public Dackdrop(){}

    public Dackdrop(PlaneWarClient pwc,int x,int y){
        this.pwc = pwc;
        this.x = x;
        this.y = y;
        this.speed = 0;
        this.width = images[0].getWidth(null);
        this.height = images[0].getHeight(null);


    }

    @Override
    public void move() {
        this.x -= speed;
    }


    int fs=0;
    @Override
    public void draw(Graphics g) {
        fs++;
        if(fs%30==0){
            fs=0;
        }
        //画图组的方法
   if(fs%30==0){
       count++;
       if(count==25){
            count=0;
           this.pwc.dackdrops.remove(this);
           this.pwc.key=true;
           this.pwc.key1=false;
           this.pwc.mukey=true;
       }
       g.drawImage(images[count],x,y,null);

   }else {
       g.drawImage(images[count],x,y,null);
     }


    }
}
