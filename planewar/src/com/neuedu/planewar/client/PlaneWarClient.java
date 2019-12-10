package com.neuedu.planewar.client;

import com.neuedu.planewar.common.CommonFrame;
import com.neuedu.planewar.common.FrameUtil;
import com.neuedu.planewar.constant.Constant;
import com.neuedu.planewar.entity.*;


import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/6 9:20
 */
public class PlaneWarClient extends CommonFrame {
    public Plane myPlane = new Plane(this,400,500,true);
    public Dackbg dackbg = new Dackbg(this,0,0);
    public Dackbg dackbg1 = new Dackbg(this,dackbg.x+dackbg.width,0);

    public List<Planex> planexes = new ArrayList<>();


    public List<Bullet> bullets = new ArrayList<>();

    public List<EnemyPlane> enemyPlanes = new ArrayList<>();
    public List<Explode> explodes = new ArrayList<>();

    public List<EnemyPlane1> enemyPlanes1 = new ArrayList<>();
    public List<Explode1> explodes1 = new ArrayList<>();

    public List<EnemyPlane2> enemyPlanes2 = new ArrayList<>();
    public List<Explode2> explodes2 = new ArrayList<>();

    public List<Item> items = new ArrayList<>();

    public List<Dackdrop> dackdrops = new ArrayList<>();


    {
        for(int i=0;i<7;i++){
            if(i<4){
                EnemyPlane enemyPlane = new EnemyPlane(this, Constant.FRAME_WIDTH+50*i,100+(i*90),false);
                enemyPlanes.add(enemyPlane);

            }else {
                EnemyPlane enemyPlane = new EnemyPlane(this, Constant.FRAME_WIDTH-+50*i,100+(i*90),false);
                enemyPlanes.add(enemyPlane);
            }
        }

        for(int i=0;i<5;i++){
            EnemyPlane1 enemyPlane1 = new EnemyPlane1(this, Constant.FRAME_WIDTH+500,100+(i*100),false);
            enemyPlanes1.add(enemyPlane1);
        }

        for(int i=0;i<5;i++){
            EnemyPlane1 enemyPlane1 = new EnemyPlane1(this, 800,100+(i*100),false);
            enemyPlanes1.add(enemyPlane1);
        }

        for(int i=0;i<5;i++){
            EnemyPlane2 enemyPlane2 = new EnemyPlane2(this, Constant.FRAME_WIDTH+300*i,100+(i*100),false);
            enemyPlanes2.add(enemyPlane2);
        }

        for(int i=0;i<7;i++){
            if(i<4){
                EnemyPlane enemyPlane = new EnemyPlane(this, Constant.FRAME_WIDTH-50*i+400,100+(i*90),false);
                enemyPlanes.add(enemyPlane);

            }else {
                EnemyPlane enemyPlane = new EnemyPlane(this, Constant.FRAME_WIDTH+50*i+400,100+(i*90),false);
                enemyPlanes.add(enemyPlane);
            }
        }


//            Dackdrop dackdrop = new Dackdrop(this,0,0);
//            dackdrops.add(dackdrop);

    }

    @Override
    public void loadFrame(String title) {
        super.loadFrame(title);
        //添加键盘监听器
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                myPlane.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                myPlane.keyReleased(e);
            }


        });


    }

    @Override
    public void paint(Graphics g) {
        //看场动画
//        for(int i=0;i<dackdrops.size();i++){
//            dackdrops.get(i).draw(g);
//        }

        //游戏背景
        dackbg.draw(g);
        dackbg1.draw(g);
        while (dackbg.x<-dackbg.width){
            dackbg.x=dackbg1.x+dackbg1.width;
            dackbg.draw(g);
        }
        while (dackbg1.x<-dackbg1.width){
            dackbg1.x=dackbg.x+dackbg.width;
            dackbg1.draw(g);
        }



        myPlane.draw(g);
        for (int i=0;i<bullets.size();i++){
            Bullet b = bullets.get(i);
            b.draw(g);
            b.hitEnemyPlane(enemyPlanes);
            b.hitEnemyPlane1(enemyPlanes1);
            b.hitEnemyPlane2(enemyPlanes2);
            b.hitPlane(myPlane);
        }

        for(int i=0;i<enemyPlanes.size();i++){
            enemyPlanes.get(i).draw(g);
        }
        for(int i=0;i<explodes.size();i++){
            explodes.get(i).draw(g);
        }

        for(int i=0;i<items.size();i++){
            items.get(i).draw(g);
        }

        for(int i=0;i<enemyPlanes1.size();i++){
            enemyPlanes1.get(i).draw(g);
        }
        for(int i=0;i<explodes1.size();i++){
            explodes1.get(i).draw(g);
        }
        for(int i=0;i<enemyPlanes2.size();i++){
            enemyPlanes2.get(i).draw(g);
        }
        for(int i=0;i<explodes2.size();i++){
            explodes2.get(i).draw(g);
        }

        for(int i=0;i<planexes.size();i++){
            planexes.get(i).draw(g);
        }

        myPlane.eatItem(items);
        Font f = g.getFont();
        g.setFont(new Font("微软雅黑",Font.BOLD,30));
        g.drawString("子弹容器大小:"+bullets.size(),100,100);
        g.drawString("飞机的横坐标:"+myPlane.x,100,150);
        g.drawString("飞机的纵坐标:"+myPlane.y,100,180);
        g.drawString("敌方飞机容器大小:"+enemyPlanes.size(),100,200);
        g.drawString("主战飞机的血量:"+myPlane.getHP(),100,250);
        g.drawString("主方飞机的护盾:"+myPlane.getDEF(),100,300);
        g.setFont(f);
    }


    public static void main(String[] args) {
        new PlaneWarClient().loadFrame("火柴人联盟");
    }

}
