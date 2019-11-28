package com.test.eleven.zhouce3_1;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/28 8:56
 */
public class Taxi extends Car{
    String company;//所属公司
    Taxi(){}

    Taxi(String color, String username){
        super(color, username);
    }

    public final void ride(){
        System.out.println(username + "的出租车是属于" +
                company + "公司的。");
    }

    @Override
    public void use(){
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }

//    @Override
    public String toString(){
      String s = "taxi的信息是:" + this.username + "拥有一辆" + this.color + "的出租车。";
      return s;
    }
}
