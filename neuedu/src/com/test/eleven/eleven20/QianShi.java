package com.test.eleven.eleven20;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DateTimeDV;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/20 17:32
 */
public class QianShi {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        User[] arr = new User[5];
        DateTest[] datas = new DateTest[36];
//        创建不同类型的数据对象
//        生肖
        DateTest d = new DateTest("生肖","鼠","上官");
        datas[0] = d;
         d = new DateTest("生肖","牛","浴");
        datas[1] = d;
         d = new DateTest("生肖","虎","玉");
        datas[2] = d;
         d = new DateTest("生肖","兔","陌");
        datas[3] = d;
         d = new DateTest("生肖","龙","夜");
        datas[4] = d;
         d = new DateTest("生肖","蛇","陆");
        datas[5] = d;
         d = new DateTest("生肖","马","顾");
        datas[6] = d;
         d = new DateTest("生肖","羊","夏");
        datas[7] = d;
         d = new DateTest("生肖","猴","楚");
        datas[8] = d;
         d = new DateTest("生肖","鸡","苏");
        datas[9] = d;
         d = new DateTest("生肖","狗","程");
        datas[10] = d;
         d = new DateTest("生肖","猪","慕");
        datas[11] = d;
//        月份
         d = new DateTest("月份","1","小");
        datas[12] = d;
         d = new DateTest("月份","2","棂");
        datas[13] = d;
         d = new DateTest("月份","3","玥");
        datas[14] = d;
         d = new DateTest("月份","4","浅");
        datas[15] = d;
         d = new DateTest("月份","5","瑾");
        datas[16] = d;
         d = new DateTest("月份","6","颜");
        datas[17] = d;
         d = new DateTest("月份","7","曦");
        datas[18] = d;
         d = new DateTest("月份","8","夭");
        datas[19] = d;
         d = new DateTest("月份","9","眠");
        datas[20] = d;
         d = new DateTest("月份","10","晴");
        datas[21] = d;
         d = new DateTest("月份","11","莹");
        datas[22] = d;
         d = new DateTest("月份","12","瑶");
        datas[23] = d;
//        星座
         d = new DateTest("星座","白羊座","浅");
        datas[24] = d;
         d = new DateTest("星座","金牛座","姬");
        datas[25] = d;
         d = new DateTest("星座","巨蟹座","盈");
        datas[26] = d;
         d = new DateTest("星座","天蝎座","晞");
        datas[27] = d;
         d = new DateTest("星座","双子座","儿");
        datas[28] = d;
         d = new DateTest("星座","射手座","璃");
        datas[29] = d;
         d = new DateTest("星座","狮子座","衣");
        datas[30] = d;
         d = new DateTest("星座","处女座","仪");
        datas[31] = d;
         d = new DateTest("星座","天枰座","之");
        datas[32] = d;
         d = new DateTest("星座","双鱼座","绯");
        datas[33] = d;
         d = new DateTest("星座","水瓶座","色");
        datas[34] = d;
         d = new DateTest("星座","摩羯座","蓉");
        datas[35] = d;

//        定义key
        boolean key=false;//登录的key
        boolean key1=false;//测试的key

//      注册
        System.out.println("请注册:");
        System.out.println("请输入你的名字字符串类型:");
        String uname=in.next();//名字
        System.out.println("请输入密码int类型:");
        int psw=in.nextInt();//密码
        System.out.println("请输入你的生肖字符串类型:");
        String sx=in.next();//生肖
        System.out.println("请输入月份int类型:");
        int month=in.nextInt();//月份
        System.out.println("请输入你的星座字符串类型:");
        String xz=in.next();//星座

        int fs1 = register(uname,psw,sx,month,xz,arr);
        if(fs1==1){
            key=true;
            System.out.println("注册成功！！！");
        }else{
            System.out.println("注册失败！！！");
        }


        while (key){
//      登录
            System.out.println("请输入登录的名字:");
            String uname1 = in.next();//登录的名字
            System.out.println("请输入登录的密码:");
            int psw1 = in.nextInt();//登录的密码

            int fs2 = login(uname1,psw1,arr);
            if(fs2==1){
                System.out.println("登录成功！！！");
                key1=true;
                while (key1){
                    //    开始测试
                    System.out.println("请输入生肖，月份，星座:");
                    String sx2=in.next();
                    String month2=in.next();
                    String xz2=in.next();
                    String newName=test(sx2,month2,xz2,datas);
                    System.out.println("你前世的名字是:"+newName);

                    System.out.println("请问是否继续测试？1-继续，2-退出测试，返回登录界面，3-退出游戏");
                    int fsa=in.nextInt();
                    if(fsa==1){
                        key1=true;
                    }else if(fsa==2){
                        key1=false;
                    }else if(fsa==3){
                        key1=false;
                        key=false;
                    }else{
                        System.out.println("输入错误，请合理输入！！！");
                    }
                }
            }else{
                System.out.println("登录失败！！！");
                System.out.println("是否继续登录？1-继续，0-退出");
                int fsb=in.nextInt();
                if(fsb==1){
                    key=true;
                }else{
                    key=false;
                }
            }

        }






    }









    //注册
    public static int register(String uname,int psw,String sx,int month,String xz,User[] arr){
        User user = new User();
        user.uname=uname;
        user.psw=psw;
        user.sx=sx;
        user.month=month;
        user.xz=xz;
        //保存对象
        for(int i=0;i<arr.length;i++){
            if(arr[i]==null){
                arr[i]=user;
                return 1;
            }
        }
        return -1;
    }


    //登录
    public static int login(String uname, int psw, User[] arr){
//        判断
        if(uname!=null){
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=null){
                    if(uname.equals(arr[i].uname)&&psw==arr[i].psw){
                        return 1;
                    }
                }
            }
        }
        return -1;
    }

    //测试
    public static String test(String sx, String mon, String sz,DateTest[] dateTests){
        String newName="";
        for(int i=0;i<dateTests.length;i++){
            if(dateTests[i]!=null){
                //生肖
                if(dateTests[i].type.equals("生肖")){
                    if(dateTests[i].first.equals(sx)){
                        newName=newName+dateTests[i].second;
                    }
                }
                //月份
                if(dateTests[i].type.equals("月份")){
                    if(dateTests[i].first.equals(mon)){
                        newName=newName+dateTests[i].second;
                    }
                }
                //星座
                if(dateTests[i].type.equals("星座")){
                    if(dateTests[i].first.equals(sz)){
                        newName=newName+dateTests[i].second;
                    }
                }
            }
        }

//        ///////////////////
//        for(int i=0;i<dateTests.length;i++){
//            if(dateTests[i]!=null){
//                //月份
//                if(dateTests[i].type.equals("月份")){
//                    if(dateTests[i].first.equals(sx)){
//                        newName=newName+dateTests[i].second;
//                    }
//                }
//            }
//        }
//
//        ////////////////////////
//        for(int i=0;i<dateTests.length;i++){
//            if(dateTests[i]!=null){
//                //星座
//                if(dateTests[i].type.equals("星座")){
//                    if(dateTests[i].first.equals(sx)){
//                        newName=newName+dateTests[i].second;
//                    }
//                }
//            }
//        }
        return newName;
    }


}



