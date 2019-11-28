package com.test.eleven.eleven27;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/27 10:37
 */
public class Test2 {
    public static void main(String[] args){
        Zi z = new Zi();
        z.show();
    }
}

class Fu{
    public int num = 10;
    public Fu(){
        System.out.println("fu");
    }
}
class Zi extends Fu{
    public  int num  = 10;
    public  Zi(){
        System.out.println("zi");
    }
    public void  show(){
        int num= 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
