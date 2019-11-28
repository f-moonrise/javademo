package com.test.eleven.eleven26;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/26 14:40
 */
public class Test7  {
    public static  void main(String[] arge){
        fs s = new fs();
        s.sh();
        s.fs();
    }
 }
 class son extends  fs{

 }
class Gra{
    public void sh(){
        System.out.println("fsdd");
    }
}
class fs extends  Gra{
    public void fs(){
        System.out.println("fsfsdd");

    }
}