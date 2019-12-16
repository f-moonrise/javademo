package com.neuedu.planewar.entity;

import com.neuedu.planewar.client.PlaneWarClient;
import com.neuedu.planewar.common.ImageUtil;
import com.neuedu.planewar.constant.Constant;

import java.awt.*;
import java.util.Random;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/16 14:04
 */
public class BulletBo extends PlaneWarObject{
    public BulletBo(){}

    boolean good;

    static Random r = new Random();

    public BulletBo(PlaneWarClient pwc, int x, int y){
        this.pwc = pwc;
        this.x = x;
        this.y = y;
        this.img = ImageUtil.images.get("bossbu");
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
        this.speed = 30;



    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(img,x,y,null);
//        System.out.println("Adsf");
        move();
    }

    @Override
    public void move() {
        if(good){
            x += speed;
        }else {
            x -= speed;
        }
        outOfBounds();
    }

    private void outOfBounds(){
        if(x<-500||x> Constant.FRAME_WIDTH+300||y<-300||y> Constant.FRAME_HEIGHT){
            this.pwc.bullets.remove(this);
        }
    }




    //我方飞机
    public boolean hitPlane(Plane myplane){
        if(this.good!=myplane.good&&this.getRectangle().intersects(myplane.getRectangle())){
            //当打到我方飞机时，掉盾掉血
            if(myplane.getDEF()!=0){
                myplane.setDEF(myplane.getDEF()-10);
            }else {
                myplane.setHP(myplane.getHP()-10);
            }

            this.pwc.bullets.remove(this);

            //如果生命为0游戏结束
            if(myplane.getHP()<=0){
                myplane.setHP(0);
//                this.pwc.myplanes.remove(myplane);
//                System.out.println("游戏结束");
                //我方飞机爆炸
                Planex e = new Planex(pwc,myplane.x,myplane.y);
                this.pwc.planexes.add(e);
                //this.pwc.myPlane.;
            }
            return true;
        }
        return false;
    }
}
