package com.test.eleven.zhouce3_1;

import sun.awt.geom.AreaOp;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/28 9:40
 */
public class Test {
    public static void main(String[] args){
        Car car1 = new Car("blue","car");
        Car car2 = new Car("blue","car");

        car1.use();
        System.out.println("car1和car2的引用比较:" + car1.equals(car2));
        System.out.println("========================================");

        Taxi taxi = new Taxi();
        taxi.username = "张小泉";
        taxi.company = "长生";
        taxi.color = "蓝色";
        taxi.ride();
        taxi.use();
        System.out.println(taxi.toString());
        System.out.println("========================================");

        HomeCar homecar = new HomeCar();
        homecar.username = "孙二娘";
        homecar.color = "紫色";
        homecar.num = 7;
        homecar.display();
        homecar.display(5);
    }

    public void fs(){
        Taxi taxi = new Taxi();
        taxi.username = "张小泉";
        taxi.company = "长生";
        taxi.color = "蓝色";
        taxi.ride();
        taxi.use();
        System.out.println(taxi.toString());
        System.out.println("========================================");

        HomeCar homecar = new HomeCar();
        homecar.username = "孙二娘";
        homecar.color = "紫色";
        homecar.num = 7;
        homecar.display();
        homecar.display(5);
    }
}
