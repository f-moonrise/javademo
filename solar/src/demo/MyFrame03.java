package demo;

import common.CommonFrame;
import common.FrameUtil;
import constant.Constant;

import java.awt.*;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/4 15:50
 */
public class MyFrame03 extends CommonFrame {
    /**
     * longAxis长半轴
     * shortAxis短半轴
     * theta参数
     * x轴
     * y轴
     * speed线速度改变量(速度)
     */
    int longAxis = 400;
    int shortAxis = 200;
    double theta = 0.0;
    int x;
    int y;
    double speed = 0.015;
    Image image = FrameUtil.getImage("com/neuedu/solar/img/Mars.png");

    @Override
    public void paint(Graphics g) {
        g.drawImage(image,x,y,80,80,null);
        x = Constant.FRAME_WIDTH / 2 + (int)(longAxis * Math.cos(theta));
        y = Constant.FRAME_HEIGHT / 2 + (int)(shortAxis * Math.sin(theta));
        theta += speed;

    }

    public static void main(String[] args) {
        MyFrame03 myFrame03 = new MyFrame03();
        myFrame03.loadFrame("03");
    }
}
