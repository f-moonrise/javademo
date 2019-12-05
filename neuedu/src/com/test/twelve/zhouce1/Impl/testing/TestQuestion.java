package com.test.twelve.zhouce1.Impl.testing;

import com.test.twelve.zhouce1.Reward;
import com.test.twelve.zhouce1.Util.Checkout;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/5 14:14
 */
public class TestQuestion extends Checkout {
    @Override
    public void checkp() {
        System.out.println("问题试炼关卡");
    }

    public void quest(){
        Scanner in = new Scanner(System.in);
        int x = (int)(Math.random()*10);
        int y = (int)(Math.random()*10);
        System.out.println("请问" + x + "+" + y + "等于多少？");
        int fs = in.nextInt();
        if(fs==(x+y)){
            System.out.println("试炼成功");
            new Reward().show();
        }else {
            System.out.println("试炼失败");
        }
    }
}
