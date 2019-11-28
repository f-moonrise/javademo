package com.test.eleven.eleven26;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/26 16:23
 */
public class Test9 {
    public static void main(String[] args){
        So s= new So();
        s.show();
    }
}

class Fa{
    public int num = 10;
}

class So extends Fa{
    public int num= 20;
    public void show(){
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}