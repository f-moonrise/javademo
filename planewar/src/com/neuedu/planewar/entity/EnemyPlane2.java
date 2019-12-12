package com.neuedu.planewar.entity;

import com.neuedu.planewar.client.PlaneWarClient;
import com.neuedu.planewar.common.ImageUtil;
import com.neuedu.planewar.common.MusicUtil;

import java.awt.*;
import java.util.Random;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 23:31
 */
public class EnemyPlane2 extends PlaneWarObject{

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    private int HP = 100;

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
        outOfBounds();
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
        if(r.nextInt(1000)>995){
            shoot();
        }
    }

    public void shoot(){
        Bullet bullet = new Bullet(this.pwc,this.x+this.width,this.y+this.height/2,good);
        this.pwc.bullets.add(bullet);
    }

    //飞机与飞机的碰撞
    public boolean hitPlane(Plane myplane){
        if(this.good!=myplane.good&&this.getRectangle().intersects(myplane.getRectangle())){
            //当打到我方飞机时，掉盾掉血
            if(myplane.getDEF()>0){
                myplane.setDEF(myplane.getDEF()-50);
            }else {
                myplane.setDEF(0);
                myplane.setHP(myplane.getHP()-50);
            }

            this.pwc.enemyPlanes2.remove(this);
            new MusicUtil("com/neuedu/planewar/video/炮弹爆炸的声音.mp3", false).start();
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

    private void outOfBounds(){
        if(x<-300){
            this.pwc.enemyPlanes2.remove(this);
        }
    }

}
