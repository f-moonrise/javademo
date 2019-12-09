package com.neuedu.planewar.entity;

import com.neuedu.planewar.client.PlaneWarClient;
import com.neuedu.planewar.common.ImageUtil;
import com.neuedu.planewar.constant.Constant;

import java.awt.*;
import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/6 17:39
 */
public class Bullet extends PlaneWarObject{
    public Bullet(){}

    boolean good;

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
            this.img = ImageUtil.images.get("bullet0_02");
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

    public boolean hitEnemyPlane(EnemyPlane enemyPlane){
        if(this.good!=enemyPlane.good&&this.getRectangle().intersects(enemyPlane.getRectangle())){
            this.pwc.enemyPlanes.remove(enemyPlane);

            Explode e = new Explode(pwc,enemyPlane.x,enemyPlane.y);
            this.pwc.explodes.add(e);

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
}
