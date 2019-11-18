package com.test.eleven.eleven18;

import java.util.Random;
import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/18 15:05
 */
public class Test1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean loop=true;
        int[] arr = new int[10];
        boolean key=false;//检查是否登录
        boolean key1=true;//检查是否继续游戏
        int count=0;


        while (loop){
            System.out.println("石头剪刀布游戏");
            System.out.println("1、注册");
            System.out.println("2、登录");
            System.out.println("3、注销");
            System.out.println("4、排行榜");
            System.out.println("5、游戏");
            System.out.println("6、退出");

            int fs=sc.nextInt();


            switch (fs){
                case 1:
                    System.out.println("请输入注册的用户名：");
                    int um = sc.nextInt();

                    int i = register(um,arr);
                    if(i == 1){
                        System.out.println("用户注册成功！");
                    }else {
                        System.out.println("用户注册失败！");
                    }

                    System.out.println("-------------");
                    break;
                case 2:
                    System.out.println("请输入登录的用户名:");
                    int um1 = sc.nextInt();

                    int j = login(um1,arr);
                    if(j == 1){
                        System.out.println("用户登录成功！");
                    }else {
                        System.out.println("用户登录失败！");
                    }
                    key=true;
                    System.out.println("-------------");
                    break;
                case 3:
                    System.out.println("请输入注销的用户名:");
                    int um2 = sc.nextInt();

                    int k = detory(um2,arr);
                    if(k == 1){
                        System.out.println("用户注销成功！");
                    }else {
                        System.out.println("用户注销失败！");
                    }
                    key=false;
                    System.out.println("-------------");
                    break;
                case 4:
                    dayin(arr);

                    System.out.println("-------------");
                    break;
                case 5:
                    if(key){
                        while (key1){
                            System.out.println("请输入你的选择：//定义1-拳头，2-剪刀，3-布");
                            int fsy=sc.nextInt();
                            int l=game(fsy);
                            if(l == 1){
                                count++;
                                System.out.println("恭喜你赢得这场比赛！");
                            }else if(l == -1){
                                count--;
                                System.out.println("很不幸你输了！");
                            }else{
                                System.out.println("平局");
                            }

                            System.out.println("请确认是否继续游戏：1继续，0退出");
                            int fsz=sc.nextInt();
                            if(fsz==1){
                                key1=true;
                            }else{
                                key1=false;
                            }

                        }

                        System.out.println("你的分数是"+count);

                    }else{
                        System.out.println("请登录！！！");
                    }


                    System.out.println("-------------");
                    break;
                case 6:
                    //退出
                    sc.close();
                    loop=false;
                    break;
                default:
                    break;
            }
        }
    }

    //    1.用户注册
    public static int register(int uname,int[] arr) {
        //判断传来的数据是否合法
        if (uname <= 0){
            return -1;
        }

        //判断用户名是否存在
        for(int i = 0;i<arr.length;i++){
            //跟存在的用户比较
            if(arr[i] != 0){
                if(uname == arr[i]){
                    return -1;
                }
            }else{
                //注册成功把数据保存起来
                arr[i] = uname;
                break;
            }
        }
        return 1;
    }

    //2.用户登录
    public static int login(int uname,int[] arr){
        //判断传来的数据是否合法
        if(uname<=0){
            return -1;
        }

        //判断用户名是否存在
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                if(uname == arr[i]){
                    //登录成功
                    return 1;
                }
            }else{
                //登录失败
                break;
            }
        }
        return -1;
    }

    //3.用户注销
    public static int detory(int uname, int[] arr){
        //判断传来的数据是否合法
        if(uname<=0){
            return -1;
        }

        //判断用户名是否存在
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                if(uname == arr[i]){
                    //注销成功
                    arr[i]=0;
                    return 1;
                }
            }else{
                //登录失败
                break;
            }
        }
        return -1;
    }

    //4.查看排行榜==获取分数最高的前10个用户信息==获取用户信息
    public static int dayin(int[] arr){
        for(int a:arr){
            System.out.print("("+a+")");
        }
        System.out.println();
        return 1;
    }

    //5.游戏
    public static int game(int fsy){
        //定义1-拳头，2-剪刀，3-布
        Random random=new Random();
        int fsx=random.nextInt(3)+1;
        if((fsy==1&&fsx==2)||(fsy==2&&fsx==3)||(fsy==3&&fsx==1)){

            return 1;
        }else if((fsy==1&&fsx==3)||(fsy==2&&fsx==1)||(fsy==3&&fsx==2)){

            return -1;
        }else{
            return 0;
        }
    }
}
