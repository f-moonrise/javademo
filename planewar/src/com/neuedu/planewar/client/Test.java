package com.neuedu.planewar.client;

import com.neuedu.planewar.common.CommonFrame;
import com.neuedu.planewar.common.FrameUtil;
import com.neuedu.planewar.common.ImageUtil;
import com.neuedu.planewar.constant.Constant;
import com.neuedu.planewar.entity.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/10 14:32
 */
public class Test extends CommonFrame {

    public static Image[] images = new Image[25];
    static {
        for(int i=0;i<images.length;i++){
            images[i] = ImageUtil.images.get("bg_"+(i+1));
        }
    }





    @Override
    public void paint(Graphics g) {
        g.drawImage(ImageUtil.images.get("bg_"+(0)),0,0, Constant.FRAME_WIDTH,Constant.FRAME_HEIGHT,null);


    }


    public static void main(String[] args) {
        new Test().loadFrame("太阳系八大行星运行图");
    }
}


