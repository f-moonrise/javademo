package com.neuedu.solar.entity;



import com.neuedu.solar.common.FrameUtil;
import com.neuedu.solar.constant.Constant;

import java.awt.*;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/5 12:21
 */
public class Sun {
    Image img;
    int x;
    int y;
    int width;
    int height;

    public Sun(){
        this.img = FrameUtil.getImage("com/neuedu/solar/img/Sun.png");
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
        this.x = Constant.FRAME_WIDTH / 2 - width / 2;
        this.y = Constant.FRAME_HEIGHT / 2 - height / 2;
    }

    public void draw(Graphics g){
        g.drawImage(img,x,y,null);
    }
}
