package com.neuedu.solar.common;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/4 12:19
 */
public class FrameUtil {
    /**
     * 用于导入图片
     * @param imgPath
     * @return
     */
    public static Image getImage(String imgPath){
        URL u = FrameUtil.class.getClassLoader().getResource(imgPath);
        BufferedImage img = null;
        try{
            img = ImageIO.read(u);
        }catch (Exception e){
            e.printStackTrace();
        }
        return img;
    }
}
