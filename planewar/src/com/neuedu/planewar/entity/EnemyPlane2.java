package com.neuedu.planewar.entity;

import com.neuedu.planewar.client.PlaneWarClient;
import com.neuedu.planewar.common.ImageUtil;

import java.awt.*;
import java.util.Random;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 23:31
 */
public class EnemyPlane2 extends PlaneWarObject{
    boolean good ;
    public static Image[] images = new Image[7];
    static {
        for(int i=0;i<images.length;i++){
            images[i] = ImageUtil.images.get("enemyplane2_"+(i+1));
        }
    }

    public EnemyPlane2(){}

    public EnemyPlane2(PlaneWarClient pwc, int x, int y, boolean good){
        this.pwc = pwc;
        this.x = x;
        this.y = y;
        this.speed = 10;
        this.width = images[0].getWidth(null);
        this.height = images[0].getHeight(null);
        this.good = good;
    }

    @Override
    public void move() {
        this.x -= speed;
    }

    int count = 0;
    static Random r = new Random();

    @Override
    public void draw(Graphics g) {
        //画图组的方法
        if(count > 6){
            count = 0;
        }
        g.drawImage(images[count],x,y,null);
        count++;
        move();
        if(r.nextInt(1000)>990){
            shoot();
        }
    }

    public void shoot(){
        Bullet bullet = new Bullet(this.pwc,this.x+this.width,this.y+this.height/2,good);
        this.pwc.bullets.add(bullet);
    }

}
