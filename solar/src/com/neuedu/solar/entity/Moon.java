package com.neuedu.solar.entity;



import com.neuedu.solar.common.CommonFrame;
import com.neuedu.solar.common.FrameUtil;

import java.awt.*;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/5 19:33
 */
public class Moon extends CommonFrame {
    /**
     * 长半轴
     */
    int longAxis;
    /**
     * 短半轴
     */
    int shortAxis;
    /**
     * 参数theta
     */
    double theta = 0.0;
    /**
     * x坐标
     */
    int x;
    /**
     * y坐标
     */
    int y;
    /**
     * 速度
     */
    double speed;
    /**
     * 图片
     */
    Image img;
    /**
     * 名称
     */
    String name;
    /**
     *
     */
    boolean ni;
    Planet earth;
    int width;
    int height;

    public Moon(){}

    public Moon(Planet earth,String name,double AU,int T,double e,String imgPath,boolean ni){
        //行星名称
        this.earth = earth;
        this.name = name;
        this.longAxis = getLongAxis(AU);
        this.shortAxis = getShortAxis(AU,e);
        this.speed = getSpeed(T);
        this.img = FrameUtil.getImage(imgPath);
        this.ni = ni;
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
    }



    private double getSpeed(int t) {
        return 365.0 / t * 0.1;
    }

    private int getShortAxis(double au, double e) {
        return (int)(this.longAxis * Math.sqrt(1 - Math.pow(e,2))/2);
    }

    private int getLongAxis(double au) {
        return (int)(au * 100);
    }

    public void draw(Graphics g){
        drawTrace(g);
        g.drawImage(img,x,y,null);
        move();
    }





    private void drawTrace(Graphics g) {
        int x = earth.x + earth.width / 2 - longAxis;
        int y = earth.y + earth.height / 2 - shortAxis;
        int width = 2 * longAxis;
        int height = 2 * shortAxis;
        g.drawOval(x,y,width,height);
        g.drawString(name,this.x+width/2,this.y+height);
    }

    /**
     * 运行轨迹
     */
    private void move(){
        x = earth.x + earth.width / 2 - this.width / 2 + (int)(longAxis * Math.cos(theta));
        y = earth.y + earth.height / 2 - this.height / 2 + (int)(shortAxis * Math.sin(theta));
        theta += speed;
    }
}
