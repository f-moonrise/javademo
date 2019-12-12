package com.neuedu.planewar.client;

import com.neuedu.planewar.common.CommonFrame;
import com.neuedu.planewar.common.FrameUtil;
import com.neuedu.planewar.common.MusicUtil;
import com.neuedu.planewar.constant.Constant;
import com.neuedu.planewar.entity.*;


import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/6 9:20
 */
public class PlaneWarClient extends CommonFrame {
//    public Plane myPlane = new Plane(this,400,500,true);
    public Dackbg dackbg = new Dackbg(this,0,0);
    public Dackbg dackbg1 = new Dackbg(this,dackbg.x+dackbg.width,0);

    public int socre=0;


    public boolean sikey = true;
    public boolean bskey = true;

    public List<Boss> bosses = new ArrayList<>();
    public List<Bossex> bossexes = new ArrayList<>();

    public List<Plane> myplanes = new ArrayList<>();
    public List<Planex> planexes = new ArrayList<>();
    public List<Planej> myplanej = new ArrayList<>();

    public List<Bullet> bullets = new ArrayList<>();

    public List<EnemyPlane> enemyPlanes = new ArrayList<>();
    public List<Explode> explodes = new ArrayList<>();

    public List<EnemyPlane1> enemyPlanes1 = new ArrayList<>();
    public List<Explode1> explodes1 = new ArrayList<>();

    public List<EnemyPlane2> enemyPlanes2 = new ArrayList<>();
    public List<Explode2> explodes2 = new ArrayList<>();

    public List<Item> items = new ArrayList<>();

    public List<Dackdrop> dackdrops = new ArrayList<>();

    Random r = new Random();

    {
        Plane myPlane = new Plane(this,400,500,true);
        myplanes.add(myPlane);

        Planej planej = new Planej(this,myPlane.x-200,myPlane.y+100,true);
        myplanej.add(planej);
        planej = new Planej(this,myPlane.x-200,myPlane.y+200,true);
        myplanej.add(planej);
        planej = new Planej(this,myPlane.x-200,myPlane.y+300,true);
        myplanej.add(planej);
        planej = new Planej(this,myPlane.x-200,myPlane.y-150,true);
        myplanej.add(planej);
        planej = new Planej(this,myPlane.x-200,myPlane.y-250,true);
        myplanej.add(planej);
        planej = new Planej(this,myPlane.x-200,myPlane.y-350,true);
        myplanej.add(planej);
////        System.out.println("myplanej"+myplanej.size());



        Boss boss = new Boss(this,900,100,false);
        bosses.add(boss);

        for (int i = 0; i < 5; i++) {
            EnemyPlane enemyPlane = new EnemyPlane(this, Constant.FRAME_WIDTH - 50, 290 + (i * 100),false);
            EnemyPlane enemyPlane2 = new EnemyPlane(this, Constant.FRAME_WIDTH + 550 - (i * 130), 90 + (i * 100),false);
            EnemyPlane enemyPlane3 = new EnemyPlane(this, Constant.FRAME_WIDTH + 150 + (i * 130), 590 + (i * 100),false);
            EnemyPlane enemyPlane4 = new EnemyPlane(this, Constant.FRAME_WIDTH + 700 + (i * 150), 90,false);
            EnemyPlane enemyPlane5 = new EnemyPlane(this, Constant.FRAME_WIDTH + 700 + (i * 150), 890,false);
            enemyPlanes.add(enemyPlane);
            enemyPlanes.add(enemyPlane2);
            enemyPlanes.add(enemyPlane3);
            enemyPlanes.add(enemyPlane4);
            enemyPlanes.add(enemyPlane5);
        }

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

        for(int i=0;i<100;i++){
            EnemyPlane1 enemyPlane1 = new EnemyPlane1(this, (int)(Constant.FRAME_WIDTH+r.nextDouble()*15000),(int)(r.nextDouble()*800+100),false);
            enemyPlanes1.add(enemyPlane1);
        }

        for(int i=0;i<100;i++){
            EnemyPlane2 enemyPlane2 = new EnemyPlane2(this, (int)(Constant.FRAME_WIDTH+r.nextDouble()*15000),(int)(r.nextDouble()*800+100),false);
            enemyPlanes2.add(enemyPlane2);
        }

        for(int i=0;i<100;i++){
            EnemyPlane enemyPlane = new EnemyPlane(this, (int)(Constant.FRAME_WIDTH+r.nextDouble()*15000),(int)(r.nextDouble()*800+100),false);
            enemyPlanes.add(enemyPlane);
        }

        for(int i=0;i<25;i++){
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


            Dackdrop dackdrop = new Dackdrop(this,0,0);
            dackdrops.add(dackdrop);

    }

    public boolean key = false;
    public boolean key1 = true;

    @Override
    public void loadFrame(String title) {
        super.loadFrame(title);
        //添加键盘监听器
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                myplanes.get(0).keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                myplanes.get(0).keyReleased(e);
            }
        });

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                myplanes.get(0).setDEF(myplanes.get(0).getDEF()+100);
                myplanes.get(0).setHP(myplanes.get(0).getHP()+100);
            }

            @Override
            public void mousePressed(MouseEvent e) {
//                System.out.println("鼠标按下");

            }

            @Override
            public void mouseReleased(MouseEvent e) {
//                System.out.println("鼠标松开");
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static boolean mukey=false;

    public boolean key2 = false;

    @Override
    public void paint(Graphics g) {


        while (key1){
            //开场动画
            for(int j=0;j<dackdrops.size();j++){
                dackdrops.get(j).draw(g);
            }
        }

        if(socre<800){
            myplanes.get(0).setLevel(10);
        }else if(socre>800&&socre<2500){
            myplanes.get(0).setLevel(30);
        }else if(socre>2500){
            myplanes.get(0).setLevel(50);
        }

//        while (key){
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



             myplanes.get(0).draw(g);
            for (int i=0;i<bullets.size();i++){
                Bullet b = bullets.get(i);
                b.draw(g);
                b.hitEnemyPlane(enemyPlanes);
                b.hitEnemyPlane1(enemyPlanes1);
                b.hitEnemyPlane2(enemyPlanes2);
                b.hitPlane(myplanes.get(0));
            }


            for(int i=0;i<enemyPlanes.size();i++){
                EnemyPlane enemyPlane = enemyPlanes.get(i);
                enemyPlane.draw(g);
                if(myplanes!=null&&myplanes.get(0)!=null){
                    enemyPlane.hitPlane(myplanes.get(0));
                }

            }
            for(int i=0;i<explodes.size();i++){
                explodes.get(i).draw(g);
            }

            for(int i=0;i<items.size();i++){
                items.get(i).draw(g);
            }

            for(int i=0;i<enemyPlanes1.size();i++){
                EnemyPlane1 enemyPlane1 =enemyPlanes1.get(i);
                enemyPlane1.draw(g);
                if(myplanes!=null&&myplanes.get(0)!=null){
                    enemyPlane1.hitPlane(myplanes.get(0));
                }
            }
            for(int i=0;i<explodes1.size();i++){
                explodes1.get(i).draw(g);
            }


            for(int i=0;i<enemyPlanes2.size();i++){
                EnemyPlane2 enemyPlane2 = enemyPlanes2.get(i);
                enemyPlane2.draw(g);
                if(myplanes!=null&&myplanes.get(0)!=null){
                    enemyPlane2.hitPlane(myplanes.get(0));
                }
            }
            for(int i=0;i<explodes2.size();i++){
                explodes2.get(i).draw(g);
            }

            if(enemyPlanes2.size()<20){
                for(int i=0;i<bosses.size();i++){
//                    bosses.get(i).draw(g);
                    Boss boss =bosses.get(i);
                    boss.draw(g);
                    for (int j=0;j<bullets.size();j++){
                        Bullet b = bullets.get(j);
                        b.hitboss(bosses);
                    }
                    if(myplanes!=null&&myplanes.get(0)!=null){
                        boss.hitPlane(myplanes.get(0));
                    }
                }
                for(int i=0;i<bossexes.size();i++){
                    bossexes.get(i).draw(g);
                }
            }






            for(int i=0;i<planexes.size();i++){
                planexes.get(i).draw(g);
            }




            if(key2){
                for(int i=0;i<myplanej.size();i++){
                    myplanej.get(i).draw(g);
                }
            }




        myplanes.get(0).eatItem(items);
            Font f = g.getFont();
            g.setFont(new Font("微软雅黑",Font.BOLD,30));
            g.drawString("子弹容器大小:"+bullets.size(),100,100);
            g.drawString("分数:"+socre,100,150);
            g.drawString("敌方飞机容器大小:"+enemyPlanes.size(),100,200);
            g.drawString("敌方飞机容器大小1:"+enemyPlanes1.size(),400,200);
             g.drawString("敌方飞机容器大小2:"+enemyPlanes2.size(),700,200);
            g.drawString("主战飞机的血量:"+myplanes.get(0).getHP(),100,250);
            g.drawString("主方飞机的护盾:"+myplanes.get(0).getDEF(),100,300);
          g.drawString("主方飞机的伤害:"+myplanes.get(0).getLevel(),100,350);
            g.setFont(f);
            if(myplanes.get(0).getHP()<=0){
                sikey = false;

                 f = g.getFont();
                g.setFont(new Font("微软雅黑",Font.BOLD,200));
                g.drawString("游戏结束",350,500);
                g.setFont(f);
            }else{
                sikey = true;
            }

//        if(bosses.get(0).getHP()<=0){
//            f = g.getFont();
//            g.setFont(new Font("微软雅黑",Font.BOLD,200));
//            g.drawString("获得胜利",350,500);
//            g.setFont(f);
//        }
//        }

    }


    public static void main(String[] args) {
        new PlaneWarClient().loadFrame("火柴人联盟");

        new MusicUtil("com/neuedu/planewar/video/背景音乐.mp3", true).start();


    }

}
