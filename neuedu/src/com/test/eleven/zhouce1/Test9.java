package com.test.eleven.zhouce1;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/14 16:39
 */
public class Test9 {
    public static void main(String[] args){
        new Test9().go();
    }
    public void go(){
        Runnable r=new Runnable(){
            public void run(){
                System.out.print("foo");
            }
        };
        Thread t=new Thread(r);
        t.start();
    }
}
