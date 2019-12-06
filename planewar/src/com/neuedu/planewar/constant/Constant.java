package com.neuedu.planewar.constant;

import java.io.IOException;
import java.util.Properties;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/4 14:59
 */
public class Constant {
    public static Properties propr = new Properties();
    static {
        try {
            propr.load(Constant.class.getClassLoader().getResourceAsStream("game.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //窗口的宽度
    public static final int FRAME_WIDTH = Integer.parseInt(propr.getProperty("FRAME_WIDTH"));

    //窗口的高度
    public static final int FRAME_HEIGHT = Integer.parseInt(propr.getProperty("FRAME_HEIGHT"));


    /**
     * 图片的根路径
     */
    public static final String IMG_PATH_PRE = propr.getProperty("IMG_PATH_PRE");
}
