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

    public List<Bullet> bullets = new ArrayList<>();

    public List<EnemyPlane> enemyPlanes = new ArrayList<>();
    public List<Explode> explodes = new ArrayList<>();

    public List<EnemyPlane1> enemyPlanes1 = new ArrayList<>();
//    public List<Explode1> explodes1 = new ArrayList<>();


    {
        for(int i=0;i<7;i++){
            EnemyPlane enemyPlane = new EnemyPlane(this, Constant.FRAME_WIDTH+100,100+(i*90),false);
            enemyPlanes.add(enemyPlane);
        }

        for(int i=0;i<5;i++){
            EnemyPlane1 enemyPlane1 = new EnemyPlane1(this, Constant.FRAME_WIDTH+500,100+(i*90),false);
            enemyPlanes1.add(enemyPlane1);
        }
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
        myPlane.draw(g);
        for (int i=0;i<bullets.size();i++){
            Bullet b = bullets.get(i);
            b.draw(g);
            b.hitEnemyPlane(enemyPlanes);

        }
        for(int i=0;i<enemyPlanes.size();i++){
            enemyPlanes.get(i).draw(g);
        }
        for(int i=0;i<explodes.size();i++){
            explodes.get(i).draw(g);
        }
        for(int i=0;i<enemyPlanes1.size();i++){
            enemyPlanes1.get(i).draw(g);
        }

        Font f = g.getFont();
        g.setFont(new Font("微软雅黑",Font.BOLD,30));
        g.drawString("子弹容器大小:"+bullets.size(),100,100);
        g.drawString("飞机的横坐标:"+myPlane.x,100,150);
        g.drawString("飞机的纵坐标:"+myPlane.y,100,180);
        g.drawString("横坐标:"+enemyPlanes.get(0).x,500,150);
        g.drawString("纵坐标:"+enemyPlanes.get(0).y,500,180);
        g.setFont(f);
    }

    public static void main(String[] args) {
        new PlaneWarClient().loadFrame("火柴人联盟");
    }

}
