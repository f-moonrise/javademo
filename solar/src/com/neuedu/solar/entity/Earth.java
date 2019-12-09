//package com.neuedu.solar.entity;
//
//
//
//import com.neuedu.solar.common.FrameUtil;
//
//import java.awt.*;
//
///**
// * @author zangye03@gmail.com
// * @date 2019/12/5 19:36
// */
//public class Earth extends Planet {
//    Image img;
//    int x;
//    int y;
//    int width;
//    int height;
//
//    public Earth(){
//        this.img = FrameUtil.getImage("img/Earth.png");
//        this.width = img.getWidth(null);
//        this.height = img.getHeight(null);
//    }
//
//    public Earth(Sun sun, String name, double AU, int T, double e, String imgPath, boolean ni){
//        //行星名称
//        this.sun = sun;
//        this.name = name;
//        this.longAxis = getLongAxis(AU);
//        this.shortAxis = getShortAxis(AU,e);
//        this.speed = getSpeed(T);
//        this.img = FrameUtil.getImage(imgPath);
//        this.ni = ni;
//        this.width = img.getWidth(null);
//        this.height = img.getHeight(null);
//    }
//
//    private double getSpeed(int t) {
//        return 365.0 / t * 0.1;
//    }
//
//    private int getShortAxis(double au, double e) {
//        return (int)(this.longAxis * Math.sqrt(1 - Math.pow(e,2))/2);
//    }
//
//    private int getLongAxis(double au) {
//        return (int)(au * 100);
//    }
//
//    public void draw(Graphics g){
//        drawTrace(g);
//        g.drawImage(img,x,y,null);
//        move();
//    }
//
//    private void drawTrace(Graphics g) {
//        int x = sun.x + sun.width / 2 - longAxis;
//        int y = sun.y + sun.height / 2 - shortAxis;
//        int width = 2 * longAxis;
//        int height = 2 * shortAxis;
//        g.drawOval(x,y,width,height);
//        g.drawString(name,this.x,this.y);
//    }
//
//    /**
//     * 运行轨迹
//     */
//    private void move(){
//        x = sun.x + sun.width / 2 - this.width / 2 + (int)(longAxis * Math.cos(theta));
//        y = sun.y + sun.height / 2 - this.height / 2 + (int)(shortAxis * Math.sin(theta));
//        theta += speed;
//    }
//}
