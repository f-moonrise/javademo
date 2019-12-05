package com.test.twelve.zhouce1;

import com.test.twelve.zhouce1.Impl.talentImpl.*;
import com.test.twelve.zhouce1.Impl.testing.*;
import com.test.twelve.zhouce1.Util.Checkout;
import com.test.twelve.zhouce1.Util.Property;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/5 14:25
 */
public class LoginTest {
    static User[] users = new User[10];
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        while (true){
            login();

        }


    }

    //登录
    public static void login(){
        System.out.println("请输入用户名");
        String name = in.next();
        //用户是否存在
        int fs = login(name);
        //存在与不存在的情况
        login(fs,name);
    }

    //用户是否存在
    public static int login(String name){
        for(int i=0;i<users.length;i++){
            if(users[i]!=null&&users[i].equals(name)){
                return i;
            }
        }
        return -1;
    }

    //用户是否存在后页面的跳转
    public static void login(int fs,String name){
        if(fs!=-1){
            //用户存在
            pass(fs);
        }else {
            //将用户放入用户组
            User us = store(name);
            //用户不存在,直接进入测试
            Checkout ch = che(us);


            resonate(ch.property,us.getProperty(),ch );
        }
    }

    //判断自己属性是否与关卡属性发生共鸣
    public static void resonate(String cp,Property up,Checkout ch ){
        System.out.println("up.pname"+up.pname());
        System.out.println("cp"+cp);
        if(cp!=null&&up!=null){
            if(!(up.pname().equals("空"))&&cp.equals(up.pname())){
                System.out.print("因属性共鸣直接通过");
            }else if(up.pname().equals("空")){
                //空的测试
                tem();
            }else {
                ch.checkp();
            }
        }
    }

    //属性为空是否测试
    public static void tem(){
        System.out.print("请问是否进入试炼");
        int i = in.nextInt();
        if(i==1){
            //返回一个参数，判断是否试炼成功
            TestEmpty tm = new TestEmpty();
            tm.checkp();
            tm.checks();
        }else {
            System.out.print("放弃试炼");
        }
    }

    //判断通行证
    public static void pass(int fs){
        if(users[fs].getPass()!=null){
            //进入测试
        }else {
            System.out.println("拥有祈云山通行证的人，不能参加试炼");
        }
    }

    //用户信息存储
    public static User store(String name){
        for(int i=0;i<users.length;i++){
            if(name!=null&&users[i]==null){
                users[i] = new User(name,pro(),null);
                users[i].getProperty().element();
                return users[i];
            }
        }
        return null;
    }

    //生成随机属性的方法
    public static Property pro(){
        int fs = (int)(Math.random()*6);
        if(fs==0){
            return new Empty();
        }else if(fs==1){
            return new Venus();
        }else if(fs==2){
            return new Jupiter();
        }else if(fs==3){
            return new Mercury();
        }else if(fs==4){
            return new Mars();
        }else if(fs==5){
            return new Saturn();
        }
        return null;
    }

    //生成随机试炼路
    public static Checkout che(User us){
        int fs = (int)(Math.random()*6);
        if(fs==0){
            return new TestEmpty();
        }else if(fs==1){
            return new TestVenus();
        }else if(fs==2){
            return new TestJupiter();
        }else if(fs==3){
            return new TestMercury();
        }else if(fs==4){
            return new TestMars();
        }else if(fs==5){
            return new TestSaturn();
        }
        return null;
    }

    //打印用户组
    public static void show(){
        for(int i=0;i<users.length;i++){
            if(users[i]!=null){
                System.out.print(users[i].getUname()+"="+users[i].getProperty()+"="+users[i].getPass());
            }
        }
    }
}
