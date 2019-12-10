package com.neuedu.planewar.common;

import com.neuedu.planewar.constant.Constant;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/4 14:59
 */
public class CommonFrame extends Frame {
    public CommonFrame() { }

    public void loadFrame(String title){
        //1.设置大小
        this.setSize(Constant.FRAME_WIDTH,Constant.FRAME_HEIGHT);
        //2.设置位置
        this.setLocationRelativeTo(null);
        //3.设置可见性
        this.setVisible(true);
        //4.设置关闭方法
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //5.设置是否改变窗口大小
        this.setResizable(true);
        //6.设置题目
        this.setTitle(title);
        //7.设置重绘的多线程
        //游戏线程
        new MyThread().start();
        //开场动画线程
        //new MyThread1().start();
    }

    class MyThread1 extends Thread{
        @Override
        public void run() {
            //无限调用panit()的业务
            for(;;){
                repaint();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * 实现JAVA多线程步骤
     * 1.继承Thread类
     * 2.重写run()方法
     */
    class MyThread extends Thread{
        @Override
        public void run() {
            //无限调用panit()的业务
            for(;;){
                repaint();
                try {
//                    Thread.sleep(1000);
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //解决图片闪烁的问题，用双缓冲方法解决闪烁问题
    Image backImg = null;

    //重写update()方法，在窗口的里层添加一个虚拟的图片
    @Override
    public void update(Graphics g) {
        if(backImg == null){
            //如果虚拟图片不存在，创建一个和窗口一样大小的图片
            backImg = createImage(Constant.FRAME_WIDTH,Constant.FRAME_HEIGHT);
        }
        //获取到虚拟机图片的画笔
        Graphics backg = backImg.getGraphics();
        Color c = backg.getColor();
        backg.setColor(Color.white);
        backg.fillRect(0,0, Constant.FRAME_WIDTH,Constant.FRAME_HEIGHT);
        backg.setColor(c);
        //调用虚拟图片的paint()方法，每50ms刷新一次
        paint(backg);
        g.drawImage(backImg,0,0,null);
    }
}
