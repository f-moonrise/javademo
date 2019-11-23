package com.test.eleven.eleven22.runeland;

import com.test.eleven.eleven22.runeland.pojo.*;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/22 16:10
 */
public class RunTest {
    //  全局资源初始化
    Scanner in = new Scanner(System.in);
    static User[] user = new User[10];
    static String[][] fw = new String[3][10];
    static BlueRune[] bfw = new BlueRune[31];
    static GreenRune[] gfw = new GreenRune[31];
    static OrangeRune[] ofw = new OrangeRune[31];


    public static void main(String[] args){
    //  初始化模块
        bluec();
        greenc();
        orangec();
    //  开始模块
        kaishi();

    //  main方底部
    }

    //  界面模块
    public static void kaishi(){
        //  初始化模块
        Scanner in = new Scanner(System.in);
        boolean key =true;//界面模块的钥匙
        //  界面模块
        while (key){
            System.out.println("#################################");
            System.out.println("#####    欢迎来到符文大陆     #####");
            System.out.println("#####    输入1进入注册页面    #####");
            System.out.println("#####    输入2进入登录页面    #####");
            System.out.println("#################################");
            int fs = in.nextInt();
            if(fs == 1){
                zhuce();
            }else if(fs == 2){
                System.out.println("欢迎来到登录页面！");
                login();
            }else{
                System.out.println("很不辛你被时空裂缝所吞噬");
                System.out.println("GAME OVER!");
                key = false;
            }
        }

    }

    //  用户注册
    public static void zhuce(){
        System.out.println("##################");
        System.out.println("欢迎来到注册页面！");
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的姓名:");
        String uname = in.next();
        System.out.println("请输入你的密码:");
        String pwd = in.next();
        User us = new User(uname,pwd);

        boolean key1 = true;

        //判断该用户是否存在
        for(int i = 0;i<user.length;i++){
            if(user[i] != null){
                if(user[i].uname.equals(us.uname)){
                    System.out.println("此人已注册，不可以重复注册！");
                    key1 = false;
                    break;
                }
            }

            if(key1){
                //如果不存在就记录下来
                for(int j = 0;j<user.length;j++){
                    if(user[j] == null){
                        user[j] = us;
                        System.out.println("注册成功!");
                        break;
                    }
                }
                break;
            }
        }
        System.out.println();
    }

    //  打印用户组
    public static void show(){
        for (int i=0;i<user.length;i++){
            if(user[i]!=null){
                if(user[i].uname.equals(null)){
                    break;
                }else{
                    String s = "用户:" + user[i].uname;
                    System.out.println(s);
                }
            }
        }
    }

    //  用户登录
    public static void login(){
        System.out.println("##################");
        System.out.println("欢迎来到登录页面！");
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的姓名:");
        String uname = in.next();
        System.out.println("请输入你的密码:");
        String pwd = in.next();
        User us = new User(uname,pwd);

        for(int i=0;i<user.length;i++){
            if(user[i]!=null&&user[i].uname.equals(uname)&&user[i].pwd.equals(pwd)){
                System.out.println("登录成功！");
                option();
                break;
            }else {
                System.out.println("登录失败，退回到初始页面。");
                break;
            }
        }
    }

    //  蓝色符文初始化
    public static void bluec(){
        BlueRune br = new BlueRune("活力", "blue", 1, 15.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00,0.00) ;
        bfw[0] = br;
        br = new BlueRune("治疗", "blue", 1, 0.00, 3.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
        bfw[1] = br;
        br = new BlueRune("疾行", "blue", 1,0.00, 0.00, 3.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
        bfw[2] = br;
        br = new BlueRune("刚毅", "blue", 2,0.00, 0.00, 0.00, 0.30, 0.40, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
        bfw[3] = br;
        br = new BlueRune("吸收", "blue", 2,0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.40, 0.40, 0.00, 0.00, 0.00) ;
        bfw[4] = br;
        br = new BlueRune("生长", "blue", 2,21.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
        bfw[5] = br;
        br = new BlueRune("愈合", "blue", 2,0.00, 4.20, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        bfw[6] = br;
        br = new BlueRune("强健", "blue", 3,24.00, 0.00, 0.00, 0.40, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        bfw[7] = br;
        br = new BlueRune("感应", "blue", 3,0.00, 0.00, 0.00, 0.40, 0.00, 0.00, 0.80, 0.00, 0.00, 0.00, 0.00) ;
        bfw[8] = br;
        br = new BlueRune("绽放", "blue", 3,12.00, 4.20, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        bfw[9] = br;
        br = new BlueRune("神速", "blue", 3,0.00, 0.00, 0.30, 0.00, 0.40, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
        bfw[10] = br;
        br = new BlueRune("饮血", "blue", 3,0.00, 0.00, 0.00, 0.00, 0.60, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
        bfw[11] = br;
        br = new BlueRune("转换", "blue", 3,0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.60, 0.00, 0.00, 0.00) ;
        bfw[12] = br;
        br = new BlueRune("渴血", "blue", 4,0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.40, 0.80, 1.60, 0.00, 0.00) ;
        bfw[13] = br;
        br = new BlueRune("正义", "blue", 4,36.00, 0.00, 0.00, 0.60, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
        bfw[14] = br;
        br = new BlueRune("气数", "blue", 4,45.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
        bfw[15] = br;
        br = new BlueRune("刹那", "blue", 4,13.50, 0.00, 0.70, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
        bfw[16] = br;
        br = new BlueRune("复苏", "blue",  4,9.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
        bfw[17] = br;
        br = new BlueRune("滋生", "blue", 4,36.00, 0.00, 0.00, 0.00, 0.00, 1.60, 0.00, 0.00, 0.00, 0.00, 0.00);
        bfw[18] = br;
        br = new BlueRune("急救", "blue", 4,0.00, 0.00, 0.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.30, 0.40) ;
        bfw[19] = br;
        br = new BlueRune("吞噬", "blue", 4,0.00, 0.00, 0.40, 0.00, 0.80, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        bfw[20] = br;
        br = new BlueRune("轮回", "blue", 5,0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 2.40, 1.00, 0.00, 0.00, 0.00) ;
        bfw[21] = br;
        br = new BlueRune("隐匿", "blue", 5,0.00, 0.00, 1.00, 1.60, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
        bfw[22] = br;
        br = new BlueRune("长生", "blue", 5,75.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
        bfw[23] = br;
        br = new BlueRune("兽痕", "blue", 5,60.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.50, 0.00) ;
        bfw[24] = br;
        br = new BlueRune("冥想", "blue", 5,60.00, 4.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
        bfw[25] = br;
        br = new BlueRune("调和", "blue", 5,45.00, 5.20, 0.40, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
        bfw[26] = br;
        br = new BlueRune("繁荣", "blue", 5,0.00, 0.00, 0.00, 0.00, 1.00, 0.00, 0.00, 0.00, 4.10, 0.00, 0.00) ;
        bfw[27] = br;
        br = new BlueRune("狩猎", "blue", 5,0.00, 0.00, 1.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.00) ;
        bfw[28] = br;
        br = new BlueRune("贪婪", "blue", 5,0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.60, 0.00, 0.00, 0.00) ;
        bfw[29] = br;
        br = new BlueRune("夺萃", "blue", 5,0.00, 0.00, 0.00, 0.00, 1.60, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        bfw[30] = br;
    }

    //  绿色符文初始化
    public static void greenc(){
        GreenRune gr = new GreenRune("应激" , "green" , 1, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.20);
        gfw[0] = gr;
        gr = new GreenRune("穿刺" , "green" , 1, 0.00, 0.00, 0.00, 0.00, 1.60, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        gfw[1] = gr;
        gr = new GreenRune("专注" , "green" , 1, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.60, 0.00, 0.00, 0.00);
        gfw[2] = gr;
        gr = new GreenRune("坚壁" , "green" , 2, 0.00, 0.00, 0.00, 2.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        gfw[3] = gr;
        gr = new GreenRune("幻盾" , "green" , 2, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 2.50, 0.00, 0.00, 0.00, 0.00);
        gfw[4] = gr;
        gr = new GreenRune("破甲" , "green" , 2, 0.00, 0.00, 0.00, 0.00, 1.80, 0.00, 0.00, 0.00, 0.00, 0.00, 0.20, 0.00);
        gfw[5] = gr;
        gr = new GreenRune("洞察" , "green" , 2, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.80, 0.10, 0.00, 0.00);
        gfw[6] = gr;
        gr = new GreenRune("风怒" , "green" , 3, 0.00, 0.00, 0.40, 0.00, 0.00, 0.00, 0.00, 2.90, 0.00, 0.00, 0.00, 0.00);
        gfw[7] = gr;
        gr = new GreenRune("崩坏" , "green" , 3, 0.00, 0.00, 0.00, 0.00, 0.00, 0.60, 0.00, 0.00, 2.60, 0.00, 0.00, 0.00);
        gfw[8] = gr;
        gr = new GreenRune("突进" , "green" , 3, 0.00, 2.40, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.30);
        gfw[9] = gr;
        gr = new GreenRune("收割" , "green" , 3, 0.00, 0.00, 0.00, 1.10, 2.60, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        gfw[10] = gr;
        gr = new GreenRune("贯穿" , "green" , 3, 0.00, 0.00, 0.00, 0.00, 3.20, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        gfw[11] = gr;
        gr = new GreenRune("破魔" , "green" , 3, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 3.20, 0.00, 0.00, 0.00);
        gfw[12] = gr;
        gr = new GreenRune("侵蚀" , "green" , 4, 0.00, 0.00, 0.00, 0.00, 0.00, 0.90, 0.00, 0.00, 3.80, 0.00, 0.00, 0.00);
        gfw[13] = gr;
        gr = new GreenRune("庇护" , "green" , 4, 0.00, 4.50, 0.00, 3.20, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        gfw[14] = gr;
        gr = new GreenRune("潜能" , "green" , 4, 15.70, 3.10, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.30);
        gfw[15] = gr;
        gr = new GreenRune("野性" , "green" , 4, 13.50, 0.00, 0.00, 0.00, 3.80, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        gfw[16] = gr;
        gr = new GreenRune("铁躯" , "green" , 4, 0.00, 0.00, 0.00, 5.40, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        gfw[17] = gr;
        gr = new GreenRune("无畏" , "green" , 4, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 5.40, 0.00, 0.00, 0.00, 0.00);
        gfw[18] = gr;
        gr = new GreenRune("憎恶" , "green" , 4, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.50, 3.20, 0.00, 0.00, 0.00, 0.00);
        gfw[19] = gr;
        gr = new GreenRune("奇袭" , "green" , 4, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.40, 0.50);
        gfw[20] = gr;
        gr = new GreenRune("献祭" , "green" , 5, 0.00, 0.00, 0.00, 0.00, 0.00, 2.40, 0.00, 0.00, 0.00, 0.00, 0.00, 0.70);
        gfw[21] = gr;
        gr = new GreenRune("鹰眼" , "green" , 5, 0.00, 0.00, 0.90, 0.00, 6.40, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        gfw[22] = gr;
        gr = new GreenRune("虚空" , "green" , 5, 37.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.60);
        gfw[23] = gr;
        gr = new GreenRune("霸者" , "green" , 5, 0.00, 0.00, 0.00, 9.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        gfw[24] = gr;
        gr = new GreenRune("均衡" , "green" , 5, 0.00, 0.00, 0.00, 5.00, 0.00, 0.00, 0.00, 5.00, 0.00, 0.00, 0.00, 0.00);
        gfw[25] = gr;
        gr = new GreenRune("灵山" , "green" , 5, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 9.00, 0.00, 0.00, 0.00, 0.00);
        gfw[26] = gr;
        gr = new GreenRune("敬畏" , "green" , 5, 0.00, 0.00, 0.00, 5.90, 0.00, 0.00, 0.70, 0.00, 0.00, 0.00, 0.00, 0.00);
        gfw[27] = gr;
        gr = new GreenRune("回声" , "green" , 5, 0.00, 0.00, 0.00, 2.70, 0.00, 0.00, 0.00, 2.70, 0.00, 0.00, 0.00, 0.60);
        gfw[28] = gr;
        gr = new GreenRune("怜悯" , "green" , 5, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.00);
        gfw[29] = gr;
        gr = new GreenRune("心眼" , "green" , 5, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 6.40, 0.00, 0.60, 0.00);
        gfw[30] = gr;

    }

    //  橙色符文初始化
    public static void orangec(){
        OrangeRune or = new OrangeRune("勇气", "orange", 1, 0.00, 0.60, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        ofw[0]=or;
        or = new OrangeRune("斗志", "orange", 1, 0.00, 0.00, 0.00, 0.00, 0.00, 1.10, 0.00, 0.00, 0.00, 0.00);
        ofw[1]=or;
        or = new OrangeRune("猛攻", "orange", 1, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.40);
        ofw[2]=or;
        or = new OrangeRune("白刃", "orange", 2, 0.00, 0.70, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.20);
        ofw[3]=or;
        or = new OrangeRune("痛苦", "orange", 2, 0.00, 0.00, 0.00, 0.00, 0.00, 1.20, 0.00, 0.10, 0.00, 0.00);
        ofw[4]=or;
        or = new OrangeRune("践踏", "orange", 2, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.60);
        ofw[5]=or;
        or = new OrangeRune("暴击", "orange", 2, 0.00, 0.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        ofw[6]=or;
        or = new OrangeRune("拯救", "orange", 3, 0.00, 1.00, 0.00, 0.00, 1.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        ofw[7]=or;
        or = new OrangeRune("致命", "orange", 3, 0.00, 1.30, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        ofw[8]=or;
        or = new OrangeRune("恐惧", "orange", 3, 0.00, 0.00, 0.00, 0.00, 0.00, 2.10, 0.00, 0.00, 0.00, 0.00);
        ofw[9]=or;
        or = new OrangeRune("信念", "orange", 3, 0.00, 0.00, 0.00, 0.00, 0.00, 1.70, 0.00, 0.00, 0.00, 0.00);
        ofw[10]=or;
        or = new OrangeRune("振奋", "orange", 3, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.30, 0.00, 0.50);
        ofw[11]=or;
        or = new OrangeRune("一闪", "orange", 3, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.30, 1.30, 0.00);
        ofw[12]=or;
        or = new OrangeRune("暴戾", "orange", 4, 13.50, 1.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        ofw[13]=or;
        or = new OrangeRune("荆棘", "orange", 4, 0.00, 1.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.40);
        ofw[14]=or;
        or = new OrangeRune("戒律", "orange", 4, 0.00, 0.00, 0.00, 0.00, 0.00, 2.50, 0.00, 0.30, 0.00, 0.00);
        ofw[15]=or;
        or = new OrangeRune("阳炎", "orange", 4, 0.00, 0.00, 0.00, 0.00, 0.00, 2.50, 1.40, 0.00, 0.00, 0.00);
        ofw[16]=or;
        or = new OrangeRune("衰败", "orange", 4, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.20);
        ofw[17]=or;
        or = new OrangeRune("风暴", "orange", 4, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.30, 1.10, 0.60);
        ofw[18]=or;
        or = new OrangeRune("惩戒", "orange", 4, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.00, 0.00, 0.00);
        ofw[19]=or;
        or = new OrangeRune("狂热", "orange", 4, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.50, 2.00, 0.00);
        ofw[20]=or;
        or = new OrangeRune("圣人", "orange", 5, 0.00, 0.00, 0.00, 0.00, 0.00, 5.30, 0.00, 0.00, 0.00, 0.00);
        ofw[21]=or;
        or = new OrangeRune("传承", "orange", 5, 0.00, 3.20, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        ofw[22]=or;
        or = new OrangeRune("异变", "orange", 5, 0.00, 2.00, 0.00, 0.00, 3.60, 0.00, 0.00, 0.00, 0.00, 0.00);
        ofw[23]=or;
        or = new OrangeRune("纷争", "orange", 5, 0.00, 2.50, 0.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
        ofw[24]=or;
        or = new OrangeRune("梦魇", "orange", 5, 0.00, 0.00, 0.00, 0.00, 0.00, 4.20, 2.40, 0.00, 0.00, 0.00);
        ofw[25]=or;
        or = new OrangeRune("凶兆", "orange", 5, 0.00, 0.00, 0.00, 0.00, 0.00, 4.20, 0.00, 0.00, 0.00, 0.60);
        ofw[26]=or;
        or = new OrangeRune("宿命", "orange", 5, 33.70, 0.00, 0.00, 2.30, 0.00, 0.00, 0.00, 0.00, 0.00, 1.00);
        ofw[27]=or;
        or = new OrangeRune("红月", "orange", 5, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.50, 0.00, 1.60);
        ofw[28]=or;
        or = new OrangeRune("无双", "orange", 5, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.70, 3.60, 0.00);
        ofw[29]=or;
        or = new OrangeRune("祸源", "orange", 5, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.60, 0.00, 0.00);
        ofw[30]=or;

    }

    //  选择铭文
    public static void option(){
        System.out.println("请输入你想选择的铭文？");
        System.out.println("分别有blue、green、orange三种铭文");
        System.out.println("注:输入over返回的符文大陆模块");
        Scanner in = new Scanner(System.in);
        String fs = in.next();
        if (fs.equals("blue")){
            optionb();
        }else if(fs.equals("green")){
            optiong();
        }else if (fs.equals("orange")){
            optiono();
        }else if(fs.equals("over")){
            kaishi();
        }
    }

    //选择蓝色铭文
    public static void optionb(){
        Scanner in = new Scanner(System.in);
        System.out.println("下面是商城里的所有蓝色铭文");
        for(int i=0;i<10;i++){
            System.out.print(" ["+ bfw[i].getFname() +"] ");
        }
        System.out.println();
        for(int i=10;i<20;i++){
            System.out.print(" ["+ bfw[i].getFname() +"] ");
        }
        System.out.println();
        for(int i=20;i<bfw.length;i++){
            System.out.print(" ["+ bfw[i].getFname() +"] ");
        }
        System.out.println();
    //  输入部分
        System.out.println("请输入你选择的铭文:");
        System.out.println("铭文一:");
        String mw0 = in.next();
        System.out.println("铭文二:");
        String mw1 = in.next();
        System.out.println("铭文三:");
        String mw2 = in.next();
        System.out.println("铭文四:");
        String mw3 = in.next();
        System.out.println("铭文五:");
        String mw4 = in.next();
        System.out.println("铭文六:");
        String mw5 = in.next();
        System.out.println("铭文七:");
        String mw6 = in.next();
        System.out.println("铭文八:");
        String mw7 = in.next();
        System.out.println("铭文九:");
        String mw8 = in.next();
        System.out.println("铭文十:");
        String mw9 = in.next();

    //  存入数组部分
        fw[0][0]=mw0;
        fw[0][1]=mw1;
        fw[0][2]=mw2;
        fw[0][3]=mw3;
        fw[0][4]=mw4;
        fw[0][5]=mw5;
        fw[0][6]=mw6;
        fw[0][7]=mw7;
        fw[0][8]=mw8;
        fw[0][9]=mw9;

    //  最终加成效果
        int level=0;
        double shengMing=0.00;//最大生命
        double huiXue=0.00;//每秒回血
        double moveSpeed=0.00;//移速
        double adHurt=0.00;//物理攻击
        double adXiXue=0.00;//物理吸血
        double adFang=0.00;//物理防御
        double apHurt=0.00;//法术攻击
        double apXiXue=0.00;//法术吸血
        double apFang=0.00;//法术防御
        double baoJil=0.00;//暴击率
        double adSpeed=0.00;//攻击速度

        for(int i=0;i<10;i++){
            level = level + bfw[i].getLevel();
            shengMing = shengMing + bfw[i].getShengMing();
            huiXue = huiXue + bfw[i].getHuiXue();
            moveSpeed = moveSpeed + bfw[i].getMoveSpeed();
            adHurt = apHurt + bfw[i].getAdHurt();
            adXiXue = adXiXue + bfw[i].getAdXiXue();
            adFang = adFang + bfw[i].getAdFang();
            apHurt = apHurt + bfw[i].getApHurt();
            apXiXue = apXiXue + bfw[i].getapXiXue();
            apFang = apFang + bfw[i].getApFang();
            baoJil = baoJil + bfw[i].getBaoJil();
            adSpeed = adSpeed + bfw[i].getAdSpeed();
        }

        System.out.println(" 最大生命:" + shengMing + " 每秒回血:" + huiXue + " 移速:" + moveSpeed +
                " 物理攻击:" + adHurt +
                " 物理吸血:" + adXiXue + " 物理防御:" + adFang + " 法术攻击:" + apHurt +
                " 法术吸血:" + apXiXue + " 法术防御:" + apFang + " 暴击率:" + baoJil + " 攻击速度:" + adSpeed);
        System.out.println("能力值:" + level);

    //  确认
        int fs = likai();
        if(fs==1){
    //  确认后返回主铭文页
            option();
        }else if(fs==0){
            optionb();
        }

    }

    //选择绿色铭文
    public static void optiong(){
        Scanner in = new Scanner(System.in);
        System.out.println("下面是商城里的所有蓝色铭文");
        for(int i=0;i<10;i++){
            System.out.print(" ["+ gfw[i].getFname() +"] ");
        }
        System.out.println();
        for(int i=10;i<20;i++){
            System.out.print(" ["+ gfw[i].getFname() +"] ");
        }
        System.out.println();
        for(int i=20;i<gfw.length;i++){
            System.out.print(" ["+ gfw[i].getFname() +"] ");
        }
        System.out.println();
        //  输入部分
        System.out.println("请输入你选择的铭文:");
        System.out.println("铭文一:");
        String mw0 = in.next();
        System.out.println("铭文二:");
        String mw1 = in.next();
        System.out.println("铭文三:");
        String mw2 = in.next();
        System.out.println("铭文四:");
        String mw3 = in.next();
        System.out.println("铭文五:");
        String mw4 = in.next();
        System.out.println("铭文六:");
        String mw5 = in.next();
        System.out.println("铭文七:");
        String mw6 = in.next();
        System.out.println("铭文八:");
        String mw7 = in.next();
        System.out.println("铭文九:");
        String mw8 = in.next();
        System.out.println("铭文十:");
        String mw9 = in.next();

        //  存入数组部分
        fw[1][0]=mw0;
        fw[1][1]=mw1;
        fw[1][2]=mw2;
        fw[1][3]=mw3;
        fw[1][4]=mw4;
        fw[1][5]=mw5;
        fw[1][6]=mw6;
        fw[1][7]=mw7;
        fw[1][8]=mw8;
        fw[1][9]=mw9;

        //  最终加成效果
        int level=0;
        double shengMing=0.00;//最大生命
        double huiXue=0.00;//每秒回血
        double moveSpeed=0.00;//移速
        double adHurt=0.00;//物理攻击
        double adXiXue=0.00;//物理吸血
        double adFang=0.00;//物理防御
        double apHurt=0.00;//法术攻击
        double apXiXue=0.00;//法术吸血
        double apFang=0.00;//法术防御
        double baoJil=0.00;//暴击率
        double adSpeed=0.00;//攻击速度

        for(int i=0;i<10;i++){
            level = level + gfw[i].getLevel();
            shengMing = shengMing + gfw[i].getShengMing();
            huiXue = huiXue + gfw[i].getHuiXue();
            adHurt = apHurt + gfw[i].getAdHurt();
            adFang = adFang + gfw[i].getAdFang();
            apHurt = apHurt + gfw[i].getApHurt();
            apXiXue = apXiXue + gfw[i].getapXiXue();
            apFang = apFang + gfw[i].getApFang();
            baoJil = baoJil + gfw[i].getBaoJil();
            adSpeed = adSpeed + gfw[i].getAdSpeed();
        }

        System.out.println(" 最大生命:" + shengMing + " 每秒回血:" + huiXue + " 移速:" + moveSpeed +
                " 物理攻击:" + adHurt +
                " 物理吸血:" + adXiXue + " 物理防御:" + adFang + " 法术攻击:" + apHurt +
                " 法术吸血:" + apXiXue + " 法术防御:" + apFang + " 暴击率:" + baoJil + " 攻击速度:" + adSpeed);
        System.out.println("能力值:" + level);

        //  确认
        int fs = likai();
        if(fs==1){
            //  确认后返回主铭文页
            option();
        }else if(fs==0){
            optionb();
        }
    }
    //选择橙色铭文
    public static void optiono(){

    }

    //  确认是否退出
    public static int likai(){
        Scanner in = new Scanner(System.in);
        System.out.println("是否确认该铭文？");
        System.out.println("1-确认，0-重新选择");
        int fs = in.nextInt();
        if(fs==1){
            return 1;
        }else {
            return 0;
        }

    }
}
