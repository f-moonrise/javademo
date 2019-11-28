package com.test.eleven.eleven27;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/27 10:38
 */
public class Test4 extends X{
    Y y= new Y();
    Test4(){
        System.out.println("z");
    }
    public static void  main(String [] args){
        new Test4();
    }
}

class X{
    Y b = new Y();
    X(){
        System.out.println("X");
    }
}

class Y{
    Y(){
        System.out.println("Y");
    }
}
