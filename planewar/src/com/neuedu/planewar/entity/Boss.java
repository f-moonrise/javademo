package com.neuedu.planewar.entity;

import com.neuedu.planewar.client.PlaneWarClient;
import com.neuedu.planewar.common.ImageUtil;
import com.neuedu.planewar.common.MusicUtil;
import com.neuedu.planewar.constant.Constant;

import java.awt.*;
import java.util.Random;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/11 15:10
 */
public class Boss extends PlaneWarObject {

    public BloodBar1 bb1 = new BloodBar1();

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    private int HP = 10000;
    private double maxHP=HP;

    boolean good;
    public static Image[] images = new Image[8];

    static {
        for (int i = 0; i < images.length; i++) {
            images[i] = ImageUtil.images.get("boss0_" + (i + 1));
        }
    }

    public Boss() {
    }

    public Boss(PlaneWarClient pwc, int x, int y, boolean good) {
        this.pwc = pwc;
        this.x = x;
        this.y = y;
        this.speed = 10;
        this.width = images[0].getWidth(null);
        this.height = images[0].getHeight(null);
        this.good = good;
    }

    Random r = new Random();
    double theta = Math.random()*(Math.PI*2);

    @Override
    public void move() {
            x += (int)(speed*Math.cos(theta));
            y += (int)(speed*Math.sin(theta));
            //弹上下边
            if(y<=30||y>= Constant.FRAME_HEIGHT-height){
                theta = -theta;
            }
            if (x<=Constant.FRAME_WIDTH/2||x>=Constant.FRAME_WIDTH-width){
                theta = Math.PI - theta;
            }



    }

    int count = 0;
    int count1 = 0;
    int fs=0;
    @Override
    public void draw(Graphics g) {
        if(this.pwc.bskey){
            fs++;
            if(fs%30==0){
                new MusicUtil("com/neuedu/planewar/video/龙咆哮.mp3", false).start();
            }
            bb1.draw(g);
            move();
            if (r.nextInt(1000) > 900) {
                shoot();

            }
            if(r.nextInt(1000) > 980) {
                zhaohuan();
            }
            if(r.nextInt(1000) > 980) {
                zhaohuan1();
            }
            if(r.nextInt(1000) > 980) {
                zhaohuan2();
            }

            if(fs%10==0){
                fs=0;
            }
            //画图组的方法
            if(fs%10==0){
                count++;
                if(count>7){
                    count=0;
                }
                g.drawImage(images[count],x,y,null);

            }else {
                g.drawImage(images[count],x,y,null);
            }
        }else {
            Font f = g.getFont();
            f = g.getFont();
            g.setFont(new Font("微软雅黑",Font.BOLD,200));
            g.drawString("获得胜利",350,500);
            g.setFont(f);
        }

    }

    private void zhaohuan2() {
        EnemyPlane2 enemyPlane2 = new EnemyPlane2(pwc,x,y,false);
        this.pwc.enemyPlanes2.add(enemyPlane2);
    }

    private void zhaohuan1() {
        EnemyPlane1 enemyPlane1 = new EnemyPlane1(pwc,x,y,false);
        this.pwc.enemyPlanes1.add(enemyPlane1);
    }

    private void zhaohuan() {
        EnemyPlane enemyPlane = new EnemyPlane(pwc,x,y,false);
            this.pwc.enemyPlanes.add(enemyPlane);
    }

    public void shoot() {
        Bullet bullet = new Bullet(this.pwc, this.x , this.y + this.height / 2, good);
        this.pwc.bullets.add(bullet);
    }

    //血量颜色变化
    class BloodBar1 {
        public void draw(Graphics g){
            Color c = g.getColor();
            if(HP>(maxHP*0.7)&&HP<=maxHP){
                g.setColor(Color.GREEN);
            }else if(HP>=(maxHP*0.3)&&HP<=(maxHP*0.7)){
                g.setColor(Color.YELLOW);
            }else {
                g.setColor(Color.RED);
            }
            g.drawRect(x,y-10,width+30,8);
            g.fillRect(x,y-10,(int)((width+30)*(HP/maxHP)),10);
            g.setColor(c);
        }
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

            //如果生命为0游戏结束
            if(myplane.getHP()<=0){
                myplane.setHP(0);
//                System.out.println("游戏结束");
//                this.pwc.myplanes.remove(myplane);
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