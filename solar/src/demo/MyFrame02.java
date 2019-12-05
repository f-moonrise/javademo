package demo;

import common.CommonFrame;
import common.FrameUtil;

import java.awt.*;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/4 14:59
 */
public class MyFrame02 extends CommonFrame {
    public static void main(String[] args) {
        MyFrame02 myFrame02 = new MyFrame02();
        myFrame02.loadFrame("111");
    }

    int x = 100;
    int y = 100;
    int speed = 10;
    @Override
    public void paint(Graphics g) {
        g.drawImage(FrameUtil.getImage("com/neuedu/solar/img/Earth.png"),x,400,null);
        x += speed;
        y += speed;
    }
}
