package com.neuedu.planewar.entity;

import com.neuedu.planewar.client.PlaneWarClient;
import com.neuedu.planewar.common.ImageUtil;
import com.neuedu.planewar.common.MusicUtil;
import com.neuedu.planewar.constant.Constant;

import java.awt.*;
import java.util.List;
import java.util.Random;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/6 17:39
 */
public class Bullet extends PlaneWarObject{
    public Bullet(){}

    boolean good;

    static Random r = new Random();

    public Bullet(PlaneWarClient pwc,int x, int y,boolean good){
        this.pwc = pwc;
        this.x = x;
        this.y = y;
        this.img = ImageUtil.images.get("bullet0_01");
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
        this.speed = 30;
        if(good){
            this.img = ImageUtil.images.get("bullet0_01");
        }else {
            this.img = ImageUtil.images.get("bullet0_0"+(r.nextInt(5)+1));
        }
        this.good = good;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(img,x,y,null);
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
        if(x<-500||x> Constant.FRAME_WIDTH+300||y<-300||y>Constant.FRAME_HEIGHT){
            this.pwc.bullets.remove(this);
        }
    }

    //敌一号飞机
    private boolean hitEnemyPlane(EnemyPlane enemyPlane){
        if(this.good!=enemyPlane.good&&this.getRectangle().intersects(enemyPlane.getRectangle())){
            if(enemyPlane.getHP()>=0){
                enemyPlane.setHP(enemyPlane.getHP()-this.pwc.myplanes.get(0).getLevel());
            }else {
                this.pwc.enemyPlanes.remove(enemyPlane);
                Explode e = new Explode(pwc,enemyPlane.x,enemyPlane.y);
                this.pwc.explodes.add(e);
                new MusicUtil("com/neuedu/planewar/video/炮弹爆炸的声音.mp3",false).start();
                this.pwc.socre += 10;
                //出道具
                if(r.nextInt(100)>90){
                    Item item = new Item(pwc,enemyPlane.x,enemyPlane.y,r.nextInt(2)+1);
                    this.pwc.items.add(item);
                }
            }
            this.pwc.bullets.remove(this);
            return true;
        }
        return false;
    }

    public boolean hitEnemyPlane(List<EnemyPlane> enemyPlanes){
        for(int i=0;i<enemyPlanes.size();i++){
            EnemyPlane ep = enemyPlanes.get(i);
            if(hitEnemyPlane(ep)){
                return true;
            }
        }
        return false;
    }

    //敌二号飞机
    public boolean hitEnemyPlane1(EnemyPlane1 enemyPlane1) {
        if (this.good != enemyPlane1.good && this.getRectangle().intersects(enemyPlane1.getRectangle())) {
            if (enemyPlane1.getHP() >= 0) {
                enemyPlane1.setHP(enemyPlane1.getHP() - this.pwc.myplanes.get(0).getLevel());
            } else {
                this.pwc.enemyPlanes1.remove(enemyPlane1);
                Explode1 e = new Explode1(pwc, enemyPlane1.x, enemyPlane1.y);
                this.pwc.explodes1.add(e);
                new MusicUtil("com/neuedu/planewar/video/炮弹爆炸的声音.mp3", false).start();
                this.pwc.socre += 20;
                //出道具
                if (r.nextInt(100) > 90) {
                    Item item = new Item(pwc, enemyPlane1.x, enemyPlane1.y, r.nextInt(2) + 1);
                    this.pwc.items.add(item);
                }
            }
            this.pwc.bullets.remove(this);
            return true;
        }
        return false;
    }

    public boolean hitEnemyPlane1(List<EnemyPlane1> enemyPlanes1){
        for(int i=0;i<enemyPlanes1.size();i++){
            EnemyPlane1 ep = enemyPlanes1.get(i);
            if(hitEnemyPlane1(ep)){
                return true;
            }
        }
        return false;
    }

    //敌三号飞机
    public boolean hitEnemyPlane2(EnemyPlane2 enemyPlane2) {
        if (this.good != enemyPlane2.good && this.getRectangle().intersects(enemyPlane2.getRectangle())) {
            if (enemyPlane2.getHP() >= 0) {
                enemyPlane2.setHP(enemyPlane2.getHP() - this.pwc.myplanes.get(0).getLevel());
            } else {
                this.pwc.enemyPlanes2.remove(enemyPlane2);
                Explode2 e = new Explode2(pwc, enemyPlane2.x, enemyPlane2.y);
                this.pwc.explodes2.add(e);
                new MusicUtil("com/neuedu/planewar/video/炮弹爆炸的声音.mp3", false).start();
                this.pwc.socre += 20;
                //出道具
                if (r.nextInt(100) > 90) {
                    Item item = new Item(pwc, enemyPlane2.x, enemyPlane2.y, r.nextInt(2) + 1);
                    this.pwc.items.add(item);
                }
            }
            this.pwc.bullets.remove(this);
            return true;
        }
        return false;
    }

    //BOSS
    public boolean hitboss(Boss boss) {
        if (this.good != boss.good && this.getRectangle().intersects(boss.getRectangle())) {
            if (boss.getHP() >= 0) {
                boss.setHP(boss.getHP() - this.pwc.myplanes.get(0).getLevel());
//                new MusicUtil("com/neuedu/planewar/video/龙咆哮.mp3", false).start();
            } else {
//                this.pwc.bosses.remove(boss);
                Bossex e = new Bossex(pwc, boss.x, boss.y);
                this.pwc.bossexes.add(e);
                new MusicUtil("com/neuedu/planewar/video/炮弹爆炸的声音.mp3", false).start();
                this.pwc.socre += 2000;
                //出道具
                if (r.nextInt(100) > 50) {
                    Item item = new Item(pwc, boss.x, boss.y, r.nextInt(2) + 1);
                    this.pwc.items.add(item);
                }

            }
            this.pwc.bullets.remove(this);
            return true;
        }
        return false;
    }

    public boolean hitboss(List<Boss> bosses){
        for(int i=0;i<bosses.size();i++){
            Boss ep = bosses.get(i);
            if(hitboss(ep)){
                return true;
            }
        }
        return false;
    }

    public boolean hitEnemyPlane2(List<EnemyPlane2> enemyPlanes2){
        for(int i=0;i<enemyPlanes2.size();i++){
            EnemyPlane2 ep = enemyPlanes2.get(i);
            if(hitEnemyPlane2(ep)){
                return true;
            }
        }
        return false;
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
