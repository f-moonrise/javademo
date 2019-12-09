package com.neuedu.planewar.common;

import com.neuedu.planewar.constant.Constant;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 专门加载项目中图片的类
 * @author zangye03@gmail.com
 * @date 2019/12/6 15:31
 */
public class ImageUtil {
    /**
     * 使用Map<KEY,VALUE>容器装图片
     */
    public static Map<String, Image> images = new HashMap<>();
    static {
        //我方飞机的图片
        for (int i=0;i<4;i++){
            images.put("myplane1_0"+(i+1),FrameUtil.getImage(Constant.IMG_PATH_PRE+"myplane/myplane1_0" + (i+1) +".png"));
        }

        //我方飞机01子弹的图片
        for (int i=0;i<6;i++){
            images.put("bullet0_0"+(i+1),FrameUtil.getImage(Constant.IMG_PATH_PRE+"bullet/bullet0_0" + (i+1) +".png"));
        }

        //敌方飞机的图片
        for (int i=0;i<7;i++){
            images.put("enemyplane0_"+(i+1),FrameUtil.getImage(Constant.IMG_PATH_PRE+"enemyplane/enemyplane0_" + (i+1) +".png"));
        }

        //敌方飞机爆炸的图片
        for (int i=0;i<5;i++){
            images.put("explode0_"+(i+1),FrameUtil.getImage(Constant.IMG_PATH_PRE+"explode/explode0_" + (i+1) +".png"));
        }

        //敌方飞机1的图片
        for (int i=0;i<5;i++){
            images.put("enemyplane1_"+(i+1),FrameUtil.getImage(Constant.IMG_PATH_PRE+"enemyplane1/enemyplane1_" + (i+1) +".png"));
        }
//
//        //敌方飞机1爆炸的图片
//        for (int i=0;i<5;i++){
//            images.put("explode1_"+(i+1),FrameUtil.getImage(Constant.IMG_PATH_PRE+"explode1/explode1_" + (i+1) +".png"));
//        }
    }
}
