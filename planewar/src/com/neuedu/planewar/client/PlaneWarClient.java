package com.neuedu.planewar.client;

import com.neuedu.planewar.common.CommonFrame;
import com.neuedu.planewar.common.FrameUtil;
import com.neuedu.planewar.entity.Bullet;
import com.neuedu.planewar.entity.Plane;


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
    public Plane myPlane = new Plane(this,400,500);

//    public Bullet bullet = new Bullet(600,700);
    public List<Bullet> bullets = new ArrayList<>();

    @Override
    public void loadFrame(String title) {
        super.loadFrame(title);
//        this.setIconImage(FrameUtil.getImage("myplane/myplane1_01.png"));
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
            bullets.get(i).draw(g);
        }
//        bullet.draw(g);
    }

    public static void main(String[] args) {
        new PlaneWarClient().loadFrame("火柴人联盟");
    }
}
