package com.test.eleven.eleven26;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/26 14:40
 */
public class Test6 {
    public static void main(String[] args){
        Teacher t= new Teacher();
        t.show();;
        System.out.println("-------------------");
        t.method();
    }



}
class Teacher{
    public int num=10;
    public static  int num2 = 10;

    public void show(){
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(num2);
    }

    public static  void method(){
        System.out.println(num2);
        function2();
    }

    public void function(){

    }

    public static void function2(){

    }
}