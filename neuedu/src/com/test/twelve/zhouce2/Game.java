package com.test.twelve.zhouce2;

import com.test.twelve.zhouce2.Jie.Bin;
import com.test.twelve.zhouce2.Jie.BinImpl.*;
import com.test.twelve.zhouce2.Jie.Garbage;
import com.test.twelve.zhouce2.Jie.GarbageImpl.HarmfulWaste;
import com.test.twelve.zhouce2.Jie.GarbageImpl.KitchenWaste;
import com.test.twelve.zhouce2.Jie.GarbageImpl.OtherWaste;
import com.test.twelve.zhouce2.Jie.GarbageImpl.RecyclableWaste;

import java.util.Random;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/19 16:33
 */
public class Game {

    Random r = new Random();

    //随机发放垃圾
    public Garbage grant(){
        int fs = r.nextInt(4)+1;

        switch (fs){
            case 1:
                return new HarmfulWaste();
            case 2:
                return new KitchenWaste();
            case 3:
                return new OtherWaste();
            case 4:
                return new RecyclableWaste();
            default:
                return null;
        }
    }

    //垃圾匹配
    public void mate(String Gproperty, String Bproperty, User user){
        if(Gproperty.equals(Bproperty)){
            user.integrate = user.integrate + 1*user.uproperty;
            System.out.println("挑战成功，积分加" + 1*user.uproperty);
            System.out.println(user.integrate);
        }else {
            user.integrate = user.integrate - 1;
            System.out.println("挑战失败，积分减1");
        }
    }



    //类型转化
    public String transform(Garbage garbage){
        if(garbage instanceof HarmfulWaste){
            HarmfulWaste harmfulWaste = (HarmfulWaste)garbage;
            System.out.print(harmfulWaste.Gname + " ");
//            System.out.println(harmfulWaste.Gproperty);
            System.out.print("等级" + harmfulWaste.Gtype + " ");
            harmfulWaste.harm();
            return harmfulWaste.Gproperty;
        }else if(garbage instanceof KitchenWaste){
            KitchenWaste kitchenWaste = (KitchenWaste)garbage;
            System.out.print(kitchenWaste.Gname + " ");
//            System.out.println(kitchenWaste.Gproperty);
            System.out.print("等级" +kitchenWaste.Gtype + " ");
            kitchenWaste.harm();
            return kitchenWaste.Gproperty;
        }else if(garbage instanceof OtherWaste){
            OtherWaste otherWaste = (OtherWaste)garbage;
            System.out.print(otherWaste.Gname + " ");
//            System.out.println(otherWaste.Gproperty);
            System.out.print("等级" +otherWaste.Gtype + " ");
            otherWaste.harm();
            return otherWaste.Gproperty;
        }else if(garbage instanceof RecyclableWaste){
            RecyclableWaste recyclableWaste = (RecyclableWaste)garbage;
            System.out.print(recyclableWaste.Gname + " ");
//            System.out.println(recyclableWaste.Gproperty);
            System.out.print("等级" +recyclableWaste.Gtype + " ");
            recyclableWaste.harm();
            return recyclableWaste.Gproperty;
        }
        return null;
    }

    //展示垃圾桶
    public void showBin(){
        System.out.print("有害垃圾桶" + " ");
        System.out.print("厨房垃圾桶" + " ");
        System.out.print("可回收垃圾桶" + " ");
        System.out.println("其他垃圾桶" + " ");
    }

    //查看垃圾桶
    public void seshowBin(String trash){
        if(trash.equals("有害垃圾")){
            HarmfulBin harmfulBin = new HarmfulBin();
            System.out.println(harmfulBin.Bname);
            System.out.println(harmfulBin.Bproperty);
            System.out.println("等级" + harmfulBin.Bvolume);
            harmfulBin.handle();
        }else if(trash.equals("厨房垃圾")){
            KitchenBin kitchenBin = new KitchenBin();
            System.out.println(kitchenBin.Bname);
            System.out.println(kitchenBin.Bproperty);
            System.out.println("等级" +kitchenBin.Bvolume);
            kitchenBin.handle();
        }else if(trash.equals("其他垃圾")){
            OtherBin otherBin = new OtherBin();
            System.out.println(otherBin.Bname);
            System.out.println(otherBin.Bproperty);
            System.out.println("等级" +otherBin.Bvolume);
            otherBin.handle();
        }else if(trash.equals("可回收垃圾")){
            RecyclableBin recyclableBin = new RecyclableBin();
            System.out.println(recyclableBin.Bname);
            System.out.println(recyclableBin.Bproperty);
            System.out.println("等级" +recyclableBin.Bvolume);
            recyclableBin.handle();
        }else if(trash.equals("智能垃圾回收")){
            RankBin rankBin = new RankBin();
            System.out.println(rankBin.Bname);
            System.out.println(rankBin.Bproperty);
            System.out.println("等级" +rankBin.Bvolume);
            rankBin.handle();
        }
    }

    //查看积分
    public void showIntegrate(User user){
        Util.logo();
        System.out.println("姓名:" + user.uname);
        System.out.println("积分:" + user.integrate);
        System.out.println("奇遇等级:" + user.uproperty);
        System.out.println("恭喜你结束了自己短暂的一生");
    }


    //积分排序
    public void selectInte(User[] users){
        for(int i=0;i<users.length;i++){
            if(users[i]!=null&&users[i].uname!=null){
                int maxIndex = i;
                int max = users[i].integrate;
                for(int j=i+1;j<users.length;j++){
                    if(users[j]!=null&&users[j].uname!=null&&max<users[j].integrate){
                        maxIndex = j;
                    }
                }

                if(maxIndex != i){
                    users[maxIndex] = users[i];
                }
            }
        }
    }


    //排行榜打印
    public void showInte(User[] users){
        int count = 0;
        for(int i=0;i<users.length;i++){
            if(users !=null && users[i]!=null && users[i].uname!=null){
                count = count + 1;
                System.out.println("第" + count + "名" +" 姓名:" + users[i].uname + "积分:" + users[i].integrate);
            }
        }
    }

}
