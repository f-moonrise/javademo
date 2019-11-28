package com.test.eleven.zhouce3_1;

import com.test.eleven.eleven22.runeland.pojo.User;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/28 8:56
 */
public class Car {
    String color;
    String username;

    Car(){}

    Car(String color, String username){
        this.color = color;
        this.username = username;
    }

    public void use(){
        System.out.println("我是机动车！");
    }

    @Override
    public boolean equals(Object obj){
        //传进来的对象地址值是否和当前一样
        if(this == obj){
            return true;
        }

        //传进来的是否为空值
        if(obj == null){
            return false;
        }

        //判断是否是car的类型
        if(obj instanceof Car){
            //强制转换
            Car car = (Car)obj;
            //比较各个属性值
            if(car.color!=null&&car.username!=null){
                if(car.color.equals(color)&&car.username.equals(username)){
                    return true;
                }
                return false;
            }
            return false;
        }
        //因为不是car
        return false;
    }
}
