package demo;

import common.FrameUtil;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/4 10:24
 */
public class MyFrame extends Frame {
    public MyFrame(){
        //1.设置大小
        this.setSize(1800,1000);
        //2.设置位置
        this.setLocationRelativeTo(null);
//        this.setLocation();
        //3.设置可见性
        this.setVisible(true);
        //4.设置关闭窗口按钮的方法的实现
        //匿名类的使用，以及JDK8.0+lambda表达式函数方程
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //5.设置是否允许改变窗口大小
        this.setResizable(false);
        //6.设置窗口标题
        this.setTitle("第一个窗口程序");
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }

    @Override
    public void paint(Graphics g) {
        //画直线
        g.drawLine(50,50,150,150);
        //画矩形
        g.drawRect(100,100,400,200);
        //画圆
        g.drawOval(100,100,400,200);
        //获得系统颜色
        Color c = g.getColor();
        g.setColor(new Color(255,101,75));
        g.fillRect(200,200,400,200);
        g.setColor(c);
        //画不规则图形
        int[] xPoints = {100,400,500};
        int[] yPoints = {100,100,300};
        int nPoints = 3;
        g.drawPolygon(xPoints,yPoints,nPoints);
        //画图片
        g.drawImage(FrameUtil.getImage("com/neuedu/solar/img/Earth.png"),600,600,null);
    }
}
