package com.neuedu.planewar.entity;

import com.neuedu.planewar.client.PlaneWarClient;
import com.neuedu.planewar.common.FrameUtil;
import com.neuedu.planewar.common.ImageUtil;
import com.neuedu.planewar.constant.Constant;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/6 9:50
 */
public class Plane extends PlaneWarObject{

    public int HP = 100;
    public double maxHP = HP;

    public int DEF = 100;
    public double maxDEF = DEF;

    public BloodBar bb = new BloodBar();

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    boolean good ;
    static Image[] imgs = new Image[100];
    static {
        for(int i=0;i<4;i++){
            imgs[i] = ImageUtil.images.get("myplane1_0"+(i+1));
        }
    }

    public Plane(){}

    public Plane(PlaneWarClient pwc,int x,int y,boolean good){
        this.pwc = pwc;
        this.x = x;
        this.y = y;
        this.width = imgs[0].getWidth(null);
        this.height = imgs[0].getHeight(null);
        this.speed = 10;
        this.good = good;
    }

//    public Plane(int x,int y, Image[] imgs){
//        this(x,y);
////        this.img = FrameUtil.getImage(imgPath);
//        this.imgs = imgs;
//    }

    @Override
    public void move() {
        if(left) x -= speed;
        if(up) y -= speed;
        if(right) x += speed;
        if(down) y += speed;
        outOfBounds();
    }

    int count = 0;

    @Override
    public void draw(Graphics g) {
        //画图组的方法
        if(count > 2){
            count = 0;
        }
        g.drawImage(imgs[count],x,y,null);
        count++;
        move();
        if(shoot){
            shoot();
        }
        bb.draw(g);
    }

    /**
     * 使用开关法创建出4个表示方向的boolean变量
     */
    public boolean left,up,right,down,shoot;

    /**
     * 飞机按键控制
     * @param e
     */
    public void keyPressed(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_A:
                left = true;
                break;
            case KeyEvent.VK_W:
                up = true;
                break;
            case KeyEvent.VK_D:
                right = true;
                break;
            case KeyEvent.VK_S:
                down = true;
                break;
            case KeyEvent.VK_J:
                shoot = true;
                break;
        }
    }

    /**
     * 按键抬起的方法
     */
    public void keyReleased(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_A:
                left = false;
                break;
            case KeyEvent.VK_W:
                up = false;
                break;
            case KeyEvent.VK_D:
                right = false;
                break;
            case KeyEvent.VK_S:
                down = false;
                break;
            case KeyEvent.VK_J:
                shoot = false;
                break;
        }
    }

    /**
     * 飞机出界判断
     */
    private void outOfBounds(){
        if (x <= 3){
            x = 3;
        }
        if(y <= 33){
            y = 33;
        }
        if(x >= Constant.FRAME_WIDTH - this.width - 3){
            x = Constant.FRAME_WIDTH - this.width - 3;
        }
        if(y >= Constant.FRAME_HEIGHT - this.height - 3){
            y = Constant.FRAME_HEIGHT - this.height - 3;
        }
    }

    /**
     * 发射子弹的方法
     */
    public void shoot(){
        Bullet bullet = new Bullet(this.pwc,this.x+this.width, this.y+this.height/2,good);
        this.pwc.bullets.add(bullet);
    }

    //血量颜色变化
    class BloodBar {
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

    //吃道具
    public boolean eatItem(Item item){
        if(this.getRectangle().intersects(item.getRectangle())){
            switch (item.type){
                case 1:
                    //加血
                    this.HP += 20;
                    if(this.HP>=this.maxHP){
                        this.HP = (int)this.maxHP;
                    }
                    break;
                case 2:
                    //加护盾
                    this.DEF += 20;
                    if(this.DEF>=this.maxDEF){
                        this.DEF = (int)this.maxDEF;
                    }
                    break;
                default:
                    break;
            }
            this.pwc.items.remove(item);
            return true;
        }
        return false;
    }

    public boolean eatItem(List<Item> items){
        for(int i=0;i<items.size();i++){
            Item item = items.get(i);
            if(eatItem(item)){
                return true;
            }
        }
        return false;
    }
}
