package com.test.twelve.zhouce2;

import com.test.twelve.zhouce2.Jie.Bin;
import com.test.twelve.zhouce2.Jie.BinImpl.RankBin;
import com.test.twelve.zhouce2.Jie.Garbage;
import com.test.twelve.zhouce2.Jie.GarbageImpl.HarmfulWaste;
import com.test.twelve.zhouce2.Jie.GarbageImpl.KitchenWaste;
import com.test.twelve.zhouce2.Jie.GarbageImpl.OtherWaste;
import com.test.twelve.zhouce2.Jie.GarbageImpl.RecyclableWaste;

import java.util.Random;
import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/19 18:13
 */
public class Test {
    static User[] users = new User[10];

    public static void main(String[] args){

        while (true){
            Random r = new Random();
            Scanner in = new Scanner(System.in);
            Util.logo();
            System.out.println("请输入你的名字");
            String uname = in.next();
            int integrate = 0;
            int uproperty = r.nextInt(10)+1;//用于积分加倍
            int function = r.nextInt(10);//用于触发人工智能
            User us = store( uname,  integrate, uproperty,  function);
            panel(us);
        }


    }

    //个人面板
    public static void panel(User us){
        Util.logo();
        System.out.println("孩子很不幸你来到了垃圾大陆");
        System.out.println("你将开始一生的垃圾分类");
        System.out.println("积分加倍:" + us.uproperty);
        System.out.println("奇遇等级:" + us.function);
        select(us);
    }

    //选择模块
    public static void select(User us){
        Util.logo();
        System.out.println("输入1进入一生的垃圾分类");
        System.out.println("输入0进入拾荒者排行榜");
        System.out.println("请输入你的选择");
        Scanner in = new Scanner(System.in);
        int fs = in.nextInt();
        if(fs == 0){
            Game g = new Game();
            g.selectInte(users);
            g.showInte(users);
            select(us);
        }else if(fs == 1){
            life(us);
        }
    }

    //随机发放垃圾
    public static void life(User us){
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        Game g = new Game();
        Garbage garbage;
        Bin bin;
        int fs = r.nextInt(5)+1;
        System.out.println("一生的垃圾数量" + fs);
        Util.logo();
        us.rule();
        Util.logo();
        //概率出现智能垃圾
        int s = r.nextInt(10);
        if (us.function>s){
            System.out.println("很幸运你碰到了传说中的神器");
            RankBin rankBin = new RankBin();
            System.out.println(rankBin.Bname);
            System.out.println(rankBin.Bvolume);
            rankBin.mutual();
            rankBin.handle();
            us.integrate = us.integrate + fs * 1 * us.uproperty;
        }else {
            for(int i=0;i<fs;i++){
                garbage = g.grant();
                String fs1 = g.transform(garbage);
                System.out.println();
                System.out.println("已知的垃圾桶如下:" );
                g.showBin();
                System.out.println("请输入你想具体查看的垃圾桶信息");
                String trash = in.next();
                g.seshowBin(trash);
                System.out.println("请输入你要放入的垃圾桶");
                String fs2=in.next();
                System.out.println("积分:" + us.integrate);
                g.mate(fs1,fs2,us);
            }
        }
        g.showIntegrate(us);
    }



    //用户信息存储
    public static User store(String uname, int integrate,int uproperty, int function){
        for(int i=0;i<users.length;i++){
            if(uname!=null&&users[i]==null){
                users[i] = new User( uname, integrate,uproperty,function);
                return users[i];
            }
        }
        return null;
    }
}
