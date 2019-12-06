package com.neuedu.solar.client;

import com.neuedu.solar.common.CommonFrame;
import com.neuedu.solar.common.FrameUtil;
import com.neuedu.solar.constant.Constant;
import com.neuedu.solar.entity.Moon;
import com.neuedu.solar.entity.Planet;
import com.neuedu.solar.entity.Sun;



import java.awt.*;
import java.util.ArrayList;
import java.util.List;


/**
 * @author zangye03@gmail.com
 * @date 2019/12/5 10:07
 */
public class SolarSystem extends CommonFrame {
    Sun sun = new Sun();

    List<Planet> smallPlanets = new ArrayList<Planet>();

    {
        double x,z;
        int y;
        for(int i=0;i<1000;i++){
            x = Math.random()+1.3;
            y = (int)(Math.random()*3643+687);
            z = Math.random()*0.0445+0.0489;
            Planet smallPlanet = new Planet(sun,"",x,y,z,"com/neuedu/solar/img/star.png",false);
            smallPlanets.add(smallPlanet);
        }
    }

    Planet mercury = new Planet(sun,"水星",0.387,88,0.2056,"com/neuedu/solar/img/Mercury.png",false);
    Planet venus = new Planet(sun,"金星",0.72,255,0.0068,"com/neuedu/solar/img/Venus.png",true);
    Planet earth = new Planet(sun,"地球",1,365,0.0167,"com/neuedu/solar/img/Earth.png",false);

    Moon moon = new Moon(earth,"月亮",1,365,0.0167,"com/neuedu/solar/img/Moon.png",false);


    Planet mar = new Planet(sun,"火星",1.3,687,0.0934,"com/neuedu/solar/img/Mars.png",false);

    Planet jupiter = new Planet(sun,"木星",2.3,4330,0.0489,"com/neuedu/solar/img/Jupiter.png",false);
    Planet saturn = new Planet(sun,"土星",2.7,10832,0.0557,"com/neuedu/solar/img/Saturn.png",false);
    Planet uranus = new Planet(sun,"天王星",3.118,30777,0.0444,"com/neuedu/solar/img/Uranus.png",false);
    Planet neptune = new Planet(sun,"海王星",3.66,60328,0.0112,"com/neuedu/solar/img/Neptune.png",false);
    Planet ming = new Planet(sun,"冥王星",4.18,90717,0.249,"com/neuedu/solar/img/冥王星.png",false);

    Planet comet = new Planet(sun,"慧星",4.18,4000,0.149,"com/neuedu/solar/img/comet.png",false);



    @Override
    public void paint(Graphics g) {
        g.drawImage(FrameUtil.getImage("com/neuedu/solar/img/bacg.jpg"),0,0, Constant.FRAME_WIDTH,Constant.FRAME_HEIGHT,null);
        sun.draw(g);
        mercury.draw(g);
        venus.draw(g);
        earth.draw(g);
        moon.draw(g);
        mar.draw(g);
        //小行星
        for(int i=0;i<smallPlanets.size();i++){
            Planet p = smallPlanets.get(i);
            p.drawstar(g);
        }
        jupiter.draw(g);
        saturn.draw(g);
        uranus.draw(g);
        neptune.draw(g);
        ming.draw(g);
        comet.drawcomet(g);
    }

    public void paint(Graphics2D g) {
        comet.drawcomet(g);
    }

    public static void main(String[] args) {
        new SolarSystem().loadFrame("太阳系八大行星运行图");
    }
}
