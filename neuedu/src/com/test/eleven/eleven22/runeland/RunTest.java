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
    static User[] user = new User[10];//用户和密码
    static User[] userz = new User[10];//用户和铭文
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


        //  打印蓝色铭文
        //   showb();
        //  打印绿色铭文
        //   showg();
        //  打印橙色铭文
        //   showo();

    //  main方底部
    }

    //  用户铭文绑定
    public static void bang(){
        for(int i=0;i<userz.length;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<10;k++){
                    User user = new User("uname",fw[j][k]);
                    userz[i]=user;
                }
            }
        }
    }

    //  打印用户和铭文
    public static void showbang(){
        for(int i=0;i<userz.length;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<10;k++){
                    if(userz!=null){
                        if(user!=null&&fw!=null){
                            if(user[i]!=null&&fw[j][k]!=null){
                                System.out.print(user[i].uname);
                                System.out.println(fw[j][k]);
                            }
                        }
                    }
                }
            }
        }
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

    //  打印蓝色铭文组
    public static void showb(){
        for(int i=0;i<bfw.length;i++){
            System.out.printf( " 名字:" + bfw[i].getFname());
            System.out.printf( " 颜色:" + bfw[i].getColor());
            System.out.print( " 等级:" + bfw[i].getLevel());
            System.out.print( " 最大生命:" + bfw[i].getShengMing()/100.00);
            System.out.print( " 每秒回血:" + bfw[i].getHuiXue()/100.00);
            System.out.print( " 移速:" + bfw[i].getMoveSpeed()/100.00);
            System.out.print( " 物理攻击:" + bfw[i].getAdHurt()/100.00);
            System.out.print( " 物理吸血:" + bfw[i].getAdXiXue()/100.00);
            System.out.print( " 物理防御:" + bfw[i].getAdFang()/100.00);
            System.out.print( " 法术攻击:" + bfw[i].getApHurt()/100.00);
            System.out.print( " 法术吸血:" + bfw[i].getapXiXue()/100.00);
            System.out.print( " 法术防御:" + bfw[i].getApFang()/100.00);
            System.out.print( " 暴击率:" + bfw[i].getBaoJil()/100.00);
            System.out.print( " 攻击速度:" + bfw[i].getAdSpeed()/100.00);
            System.out.println();
        }
    }

    //  打印绿色铭文组
    public static void showg(){
        for(int i=0;i<gfw.length;i++){
            System.out.printf( " 名字:" + gfw[i].getFname());
            System.out.printf( " 颜色:" + gfw[i].getColor());
            System.out.print( " 等级:" + gfw[i].getLevel());
            System.out.print( " 最大生命:" + gfw[i].getShengMing()/100.00);
            System.out.print( " 每秒回血:" + gfw[i].getHuiXue()/100.00);
            System.out.print( " 物理攻击:" + gfw[i].getAdHurt()/100.00);
            System.out.print( " 物理防御:" + gfw[i].getAdFang()/100.00);
            System.out.print( " 物理穿透:" + gfw[i].getAdChuan()/100.00);
            System.out.print( " 法术攻击:" + gfw[i].getApHurt()/100.00);
            System.out.print( " 法术吸血:" + gfw[i].getapXiXue()/100.00);
            System.out.print( " 法术防御:" + gfw[i].getApFang()/100.00);
            System.out.print( " 法术穿透" + gfw[i].getApChuan()/100.00);
            System.out.print( " 暴击率:" + gfw[i].getBaoJil()/100.00);
            System.out.print( " 攻击速度:" + gfw[i].getAdSpeed()/100.00);
            System.out.print( " 冷却:" + gfw[i].getLengQue()/100.00);
            System.out.println();
        }
    }

    //  打印橙色铭文组
    public static void showo(){
        for(int i=0;i<ofw.length;i++){
            System.out.printf( " 名字:" + ofw[i].getFname());
            System.out.printf( " 颜色:" + ofw[i].getColor());
            System.out.print( " 等级:" + ofw[i].getLevel());
            System.out.print( " 最大生命:" + ofw[i].getShengMing()/100.00);
            System.out.print( " 物理攻击:" + ofw[i].getAdHurt()/100.00);
            System.out.print( " 物理吸血:" + ofw[i].getAdXiXue()/100.00);
            System.out.print( " 物理防御:" + ofw[i].getAdFang()/100.00);
            System.out.print( " 物理穿透:" + ofw[i].getAdChuan()/100.00);
            System.out.print( " 法术攻击:" + ofw[i].getApHurt()/100.00);
            System.out.print( " 法术穿透" + ofw[i].getApChuan()/100.00);
            System.out.print( " 暴击率:" + ofw[i].getBaoJil()/100.00);
            System.out.print( " 暴击效果:" + ofw[i].getBaoJix()/100.00);
            System.out.print( " 攻击速度:" + ofw[i].getAdSpeed()/100.00);
            System.out.println();
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
//    public static void bluec(){
//        BlueRune br = new BlueRune("活力", "blue", 1, 15.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00,0.00) ;
//        bfw[0] = br;
//        br = new BlueRune("治疗", "blue", 1, 0.00, 3.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
//        bfw[1] = br;
//        br = new BlueRune("疾行", "blue", 1,0.00, 0.00, 3.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
//        bfw[2] = br;
//        br = new BlueRune("刚毅", "blue", 2,0.00, 0.00, 0.00, 0.30, 0.40, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
//        bfw[3] = br;
//        br = new BlueRune("吸收", "blue", 2,0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.40, 0.40, 0.00, 0.00, 0.00) ;
//        bfw[4] = br;
//        br = new BlueRune("生长", "blue", 2,21.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
//        bfw[5] = br;
//        br = new BlueRune("愈合", "blue", 2,0.00, 4.20, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        bfw[6] = br;
//        br = new BlueRune("强健", "blue", 3,24.00, 0.00, 0.00, 0.40, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        bfw[7] = br;
//        br = new BlueRune("感应", "blue", 3,0.00, 0.00, 0.00, 0.40, 0.00, 0.00, 0.80, 0.00, 0.00, 0.00, 0.00) ;
//        bfw[8] = br;
//        br = new BlueRune("绽放", "blue", 3,12.00, 4.20, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        bfw[9] = br;
//        br = new BlueRune("神速", "blue", 3,0.00, 0.00, 0.30, 0.00, 0.40, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
//        bfw[10] = br;
//        br = new BlueRune("饮血", "blue", 3,0.00, 0.00, 0.00, 0.00, 0.60, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
//        bfw[11] = br;
//        br = new BlueRune("转换", "blue", 3,0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.60, 0.00, 0.00, 0.00) ;
//        bfw[12] = br;
//        br = new BlueRune("渴血", "blue", 4,0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.40, 0.80, 1.60, 0.00, 0.00) ;
//        bfw[13] = br;
//        br = new BlueRune("正义", "blue", 4,36.00, 0.00, 0.00, 0.60, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
//        bfw[14] = br;
//        br = new BlueRune("气数", "blue", 4,45.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
//        bfw[15] = br;
//        br = new BlueRune("刹那", "blue", 4,13.50, 0.00, 0.70, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
//        bfw[16] = br;
//        br = new BlueRune("复苏", "blue",  4,9.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
//        bfw[17] = br;
//        br = new BlueRune("滋生", "blue", 4,36.00, 0.00, 0.00, 0.00, 0.00, 1.60, 0.00, 0.00, 0.00, 0.00, 0.00);
//        bfw[18] = br;
//        br = new BlueRune("急救", "blue", 4,0.00, 0.00, 0.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.30, 0.40) ;
//        bfw[19] = br;
//        br = new BlueRune("吞噬", "blue", 4,0.00, 0.00, 0.40, 0.00, 0.80, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        bfw[20] = br;
//        br = new BlueRune("轮回", "blue", 5,0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 2.40, 1.00, 0.00, 0.00, 0.00) ;
//        bfw[21] = br;
//        br = new BlueRune("隐匿", "blue", 5,0.00, 0.00, 1.00, 1.60, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
//        bfw[22] = br;
//        br = new BlueRune("长生", "blue", 5,75.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
//        bfw[23] = br;
//        br = new BlueRune("兽痕", "blue", 5,60.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.50, 0.00) ;
//        bfw[24] = br;
//        br = new BlueRune("冥想", "blue", 5,60.00, 4.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
//        bfw[25] = br;
//        br = new BlueRune("调和", "blue", 5,45.00, 5.20, 0.40, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00) ;
//        bfw[26] = br;
//        br = new BlueRune("繁荣", "blue", 5,0.00, 0.00, 0.00, 0.00, 1.00, 0.00, 0.00, 0.00, 4.10, 0.00, 0.00) ;
//        bfw[27] = br;
//        br = new BlueRune("狩猎", "blue", 5,0.00, 0.00, 1.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.00) ;
//        bfw[28] = br;
//        br = new BlueRune("贪婪", "blue", 5,0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.60, 0.00, 0.00, 0.00) ;
//        bfw[29] = br;
//        br = new BlueRune("夺萃", "blue", 5,0.00, 0.00, 0.00, 0.00, 1.60, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        bfw[30] = br;
//    }

    public static void bluec(){
        BlueRune br = new BlueRune("活力", "blue", 1, 1500, 000, 000, 000, 000, 000, 000, 000, 000, 000,000) ;
        bfw[0] = br;
        br = new BlueRune("治疗", "blue", 1, 000, 300, 000, 000, 000, 000, 000, 000, 000, 000, 000) ;
        bfw[1] = br;
        br = new BlueRune("疾行", "blue", 1,000, 000, 300, 000, 000, 000, 000, 000, 000, 000, 000) ;
        bfw[2] = br;
        br = new BlueRune("刚毅", "blue", 2,000, 000, 000, 030, 040, 000, 000, 000, 000, 000, 000) ;
        bfw[3] = br;
        br = new BlueRune("吸收", "blue", 2,000, 000, 000, 000, 000, 000, 040, 040, 000, 000, 000) ;
        bfw[4] = br;
        br = new BlueRune("生长", "blue", 2,2100, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000) ;
        bfw[5] = br;
        br = new BlueRune("愈合", "blue", 2,000, 420, 000, 000, 000, 000, 000, 000, 000, 000, 000);
        bfw[6] = br;
        br = new BlueRune("强健", "blue", 3,2400, 000, 000, 040, 000, 000, 000, 000, 000, 000, 000);
        bfw[7] = br;
        br = new BlueRune("感应", "blue", 3,000, 000, 000, 040, 000, 000, 80, 000, 000, 000, 000) ;
        bfw[8] = br;
        br = new BlueRune("绽放", "blue", 3,1200, 420, 000, 000, 000, 000, 000, 000, 000, 000, 000);
        bfw[9] = br;
        br = new BlueRune("神速", "blue", 3,000, 000, 030, 000, 040, 000, 000, 000, 000, 000, 000) ;
        bfw[10] = br;
        br = new BlueRune("饮血", "blue", 3,000, 000, 000, 000, 060, 000, 000, 000, 000, 000, 000) ;
        bfw[11] = br;
        br = new BlueRune("转换", "blue", 3,000, 000, 000, 000, 000, 000, 000, 060, 000, 000, 000) ;
        bfw[12] = br;
        br = new BlueRune("渴血", "blue", 4,000, 000, 000, 000, 000, 000, 140, 80, 160, 000, 000) ;
        bfw[13] = br;
        br = new BlueRune("正义", "blue", 4,3600, 000, 000, 060, 000, 000, 000, 000, 000, 000, 000) ;
        bfw[14] = br;
        br = new BlueRune("气数", "blue", 4,4500, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000) ;
        bfw[15] = br;
        br = new BlueRune("刹那", "blue", 4,1350, 000, 070, 000, 000, 000, 000, 000, 000, 000, 000) ;
        bfw[16] = br;
        br = new BlueRune("复苏", "blue",  4,900, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000) ;
        bfw[17] = br;
        br = new BlueRune("滋生", "blue", 4,3600, 000, 000, 000, 000, 160, 000, 000, 000, 000, 000);
        bfw[18] = br;
        br = new BlueRune("急救", "blue", 4,000, 000, 050, 000, 000, 000, 000, 000, 000, 030, 040) ;
        bfw[19] = br;
        br = new BlueRune("吞噬", "blue", 4,000, 000, 040, 000, 80, 000, 000, 000, 000, 000, 000);
        bfw[20] = br;
        br = new BlueRune("轮回", "blue", 5,000, 000, 000, 000, 000, 000, 240, 100, 000, 000, 000) ;
        bfw[21] = br;
        br = new BlueRune("隐匿", "blue", 5,000, 000, 100, 160, 000, 000, 000, 000, 000, 000, 000) ;
        bfw[22] = br;
        br = new BlueRune("长生", "blue", 5,7500, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000) ;
        bfw[23] = br;
        br = new BlueRune("兽痕", "blue", 5,6000, 000, 000, 000, 000, 000, 000, 000, 000, 050, 000) ;
        bfw[24] = br;
        br = new BlueRune("冥想", "blue", 5,6000, 450, 000, 000, 000, 000, 000, 000, 000, 000, 000) ;
        bfw[25] = br;
        br = new BlueRune("调和", "blue", 5,4500, 520, 040, 000, 000, 000, 000, 000, 000, 000, 000) ;
        bfw[26] = br;
        br = new BlueRune("繁荣", "blue", 5,000, 000, 000, 000, 100, 000, 000, 000, 410, 000, 000) ;
        bfw[27] = br;
        br = new BlueRune("狩猎", "blue", 5,000, 000, 100, 000, 000, 000, 000, 000, 000, 000, 100) ;
        bfw[28] = br;
        br = new BlueRune("贪婪", "blue", 5,000, 000, 000, 000, 000, 000, 000, 160, 000, 000, 000) ;
        bfw[29] = br;
        br = new BlueRune("夺萃", "blue", 5,000, 000, 000, 000, 160, 000, 000, 000, 000, 000, 000);
        bfw[30] = br;
    }


    //  绿色符文初始化
//    public static void greenc(){
//        GreenRune gr = new GreenRune("应激" , "green" , 1, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.20);
//        gfw[0] = gr;
//        gr = new GreenRune("穿刺" , "green" , 1, 0.00, 0.00, 0.00, 0.00, 1.60, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        gfw[1] = gr;
//        gr = new GreenRune("专注" , "green" , 1, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.60, 0.00, 0.00, 0.00);
//        gfw[2] = gr;
//        gr = new GreenRune("坚壁" , "green" , 2, 0.00, 0.00, 0.00, 2.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        gfw[3] = gr;
//        gr = new GreenRune("幻盾" , "green" , 2, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 2.50, 0.00, 0.00, 0.00, 0.00);
//        gfw[4] = gr;
//        gr = new GreenRune("破甲" , "green" , 2, 0.00, 0.00, 0.00, 0.00, 1.80, 0.00, 0.00, 0.00, 0.00, 0.00, 0.20, 0.00);
//        gfw[5] = gr;
//        gr = new GreenRune("洞察" , "green" , 2, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.80, 0.10, 0.00, 0.00);
//        gfw[6] = gr;
//        gr = new GreenRune("风怒" , "green" , 3, 0.00, 0.00, 0.40, 0.00, 0.00, 0.00, 0.00, 2.90, 0.00, 0.00, 0.00, 0.00);
//        gfw[7] = gr;
//        gr = new GreenRune("崩坏" , "green" , 3, 0.00, 0.00, 0.00, 0.00, 0.00, 0.60, 0.00, 0.00, 2.60, 0.00, 0.00, 0.00);
//        gfw[8] = gr;
//        gr = new GreenRune("突进" , "green" , 3, 0.00, 2.40, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.30);
//        gfw[9] = gr;
//        gr = new GreenRune("收割" , "green" , 3, 0.00, 0.00, 0.00, 1.10, 2.60, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        gfw[10] = gr;
//        gr = new GreenRune("贯穿" , "green" , 3, 0.00, 0.00, 0.00, 0.00, 3.20, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        gfw[11] = gr;
//        gr = new GreenRune("破魔" , "green" , 3, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 3.20, 0.00, 0.00, 0.00);
//        gfw[12] = gr;
//        gr = new GreenRune("侵蚀" , "green" , 4, 0.00, 0.00, 0.00, 0.00, 0.00, 0.90, 0.00, 0.00, 3.80, 0.00, 0.00, 0.00);
//        gfw[13] = gr;
//        gr = new GreenRune("庇护" , "green" , 4, 0.00, 4.50, 0.00, 3.20, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        gfw[14] = gr;
//        gr = new GreenRune("潜能" , "green" , 4, 15.70, 3.10, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.30);
//        gfw[15] = gr;
//        gr = new GreenRune("野性" , "green" , 4, 13.50, 0.00, 0.00, 0.00, 3.80, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        gfw[16] = gr;
//        gr = new GreenRune("铁躯" , "green" , 4, 0.00, 0.00, 0.00, 5.40, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        gfw[17] = gr;
//        gr = new GreenRune("无畏" , "green" , 4, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 5.40, 0.00, 0.00, 0.00, 0.00);
//        gfw[18] = gr;
//        gr = new GreenRune("憎恶" , "green" , 4, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.50, 3.20, 0.00, 0.00, 0.00, 0.00);
//        gfw[19] = gr;
//        gr = new GreenRune("奇袭" , "green" , 4, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.40, 0.50);
//        gfw[20] = gr;
//        gr = new GreenRune("献祭" , "green" , 5, 0.00, 0.00, 0.00, 0.00, 0.00, 2.40, 0.00, 0.00, 0.00, 0.00, 0.00, 0.70);
//        gfw[21] = gr;
//        gr = new GreenRune("鹰眼" , "green" , 5, 0.00, 0.00, 0.90, 0.00, 6.40, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        gfw[22] = gr;
//        gr = new GreenRune("虚空" , "green" , 5, 37.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.60);
//        gfw[23] = gr;
//        gr = new GreenRune("霸者" , "green" , 5, 0.00, 0.00, 0.00, 9.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        gfw[24] = gr;
//        gr = new GreenRune("均衡" , "green" , 5, 0.00, 0.00, 0.00, 5.00, 0.00, 0.00, 0.00, 5.00, 0.00, 0.00, 0.00, 0.00);
//        gfw[25] = gr;
//        gr = new GreenRune("灵山" , "green" , 5, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 9.00, 0.00, 0.00, 0.00, 0.00);
//        gfw[26] = gr;
//        gr = new GreenRune("敬畏" , "green" , 5, 0.00, 0.00, 0.00, 5.90, 0.00, 0.00, 0.70, 0.00, 0.00, 0.00, 0.00, 0.00);
//        gfw[27] = gr;
//        gr = new GreenRune("回声" , "green" , 5, 0.00, 0.00, 0.00, 2.70, 0.00, 0.00, 0.00, 2.70, 0.00, 0.00, 0.00, 0.60);
//        gfw[28] = gr;
//        gr = new GreenRune("怜悯" , "green" , 5, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.00);
//        gfw[29] = gr;
//        gr = new GreenRune("心眼" , "green" , 5, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 6.40, 0.00, 0.60, 0.00);
//        gfw[30] = gr;
//
//    }

    public static void greenc(){
        GreenRune gr = new GreenRune("应激" , "green" , 1, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 020);
        gfw[0] = gr;
        gr = new GreenRune("穿刺" , "green" , 1, 000, 000, 000, 000, 160, 000, 000, 000, 000, 000, 000, 000);
        gfw[1] = gr;
        gr = new GreenRune("专注" , "green" , 1, 000, 000, 000, 000, 000, 000, 000, 000, 160, 000, 000, 000);
        gfw[2] = gr;
        gr = new GreenRune("坚壁" , "green" , 2, 000, 000, 000, 250, 000, 000, 000, 000, 000, 000, 000, 000);
        gfw[3] = gr;
        gr = new GreenRune("幻盾" , "green" , 2, 000, 000, 000, 000, 000, 000, 000, 250, 000, 000, 000, 000);
        gfw[4] = gr;
        gr = new GreenRune("破甲" , "green" , 2, 000, 000, 000, 000, 180, 000, 000, 000, 000, 000, 020, 000);
        gfw[5] = gr;
        gr = new GreenRune("洞察" , "green" , 2, 000, 000, 000, 000, 000, 000, 000, 000, 180, 010, 000, 000);
        gfw[6] = gr;
        gr = new GreenRune("风怒" , "green" , 3, 000, 000, 040, 000, 000, 000, 000, 290, 000, 000, 000, 000);
        gfw[7] = gr;
        gr = new GreenRune("崩坏" , "green" , 3, 000, 000, 000, 000, 000, 060, 000, 000, 260, 000, 000, 000);
        gfw[8] = gr;
        gr = new GreenRune("突进" , "green" , 3, 000, 240, 000, 000, 000, 000, 000, 000, 000, 000, 000, 030);
        gfw[9] = gr;
        gr = new GreenRune("收割" , "green" , 3, 000, 000, 000, 110, 260, 000, 000, 000, 000, 000, 000, 000);
        gfw[10] = gr;
        gr = new GreenRune("贯穿" , "green" , 3, 000, 000, 000, 000, 320, 000, 000, 000, 000, 000, 000, 000);
        gfw[11] = gr;
        gr = new GreenRune("破魔" , "green" , 3, 000, 000, 000, 000, 000, 000, 000, 000, 320, 000, 000, 000);
        gfw[12] = gr;
        gr = new GreenRune("侵蚀" , "green" , 4, 000, 000, 000, 000, 000, 90, 000, 000, 380, 000, 000, 000);
        gfw[13] = gr;
        gr = new GreenRune("庇护" , "green" , 4, 000, 450, 000, 320, 000, 000, 000, 000, 000, 000, 000, 000);
        gfw[14] = gr;
        gr = new GreenRune("潜能" , "green" , 4, 1570, 310, 000, 000, 000, 000, 000, 000, 000, 000, 000, 030);
        gfw[15] = gr;
        gr = new GreenRune("野性" , "green" , 4, 1350, 000, 000, 0, 380, 000, 000, 000, 000, 000, 000, 000);
        gfw[16] = gr;
        gr = new GreenRune("铁躯" , "green" , 4, 000, 000, 000, 540, 000, 000, 000, 000, 000, 000, 000, 000);
        gfw[17] = gr;
        gr = new GreenRune("无畏" , "green" , 4, 000, 000, 000, 000, 000, 000, 000, 540, 000, 000, 000, 000);
        gfw[18] = gr;
        gr = new GreenRune("憎恶" , "green" , 4, 000, 000, 000, 000, 000, 000, 050, 320, 000, 000, 000, 000);
        gfw[19] = gr;
        gr = new GreenRune("奇袭" , "green" , 4, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 040, 050);
        gfw[20] = gr;
        gr = new GreenRune("献祭" , "green" , 5, 000, 000, 000, 000, 000, 240, 000, 000, 000, 000, 000, 070);
        gfw[21] = gr;
        gr = new GreenRune("鹰眼" , "green" , 5, 000, 000, 90, 000, 640, 000, 000, 000, 000, 000, 000, 000);
        gfw[22] = gr;
        gr = new GreenRune("虚空" , "green" , 5, 3750, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 060);
        gfw[23] = gr;
        gr = new GreenRune("霸者" , "green" , 5, 000, 000, 000, 900, 000, 000, 000, 000, 000, 000, 000, 000);
        gfw[24] = gr;
        gr = new GreenRune("均衡" , "green" , 5, 000, 000, 000, 500, 000, 000, 000, 500, 000, 000, 000, 000);
        gfw[25] = gr;
        gr = new GreenRune("灵山" , "green" , 5, 000, 000, 000, 000, 000, 000, 000, 900, 000, 000, 000, 000);
        gfw[26] = gr;
        gr = new GreenRune("敬畏" , "green" , 5, 000, 000, 000, 590, 000, 000, 070, 000, 000, 000, 000, 000);
        gfw[27] = gr;
        gr = new GreenRune("回声" , "green" , 5, 000, 000, 000, 270, 000, 000, 000, 270, 000, 000, 000, 060);
        gfw[28] = gr;
        gr = new GreenRune("怜悯" , "green" , 5, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 100);
        gfw[29] = gr;
        gr = new GreenRune("心眼" , "green" , 5, 000, 000, 000, 000, 000, 000, 000, 000, 640, 000, 060, 000);
        gfw[30] = gr;

    }


    //  橙色符文初始化
//    public static void orangec(){
//        OrangeRune or = new OrangeRune("勇气", "orange", 1, 0.00, 0.60, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        ofw[0]=or;
//        or = new OrangeRune("斗志", "orange", 1, 0.00, 0.00, 0.00, 0.00, 0.00, 1.10, 0.00, 0.00, 0.00, 0.00);
//        ofw[1]=or;
//        or = new OrangeRune("猛攻", "orange", 1, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.40);
//        ofw[2]=or;
//        or = new OrangeRune("白刃", "orange", 2, 0.00, 0.70, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.20);
//        ofw[3]=or;
//        or = new OrangeRune("痛苦", "orange", 2, 0.00, 0.00, 0.00, 0.00, 0.00, 1.20, 0.00, 0.10, 0.00, 0.00);
//        ofw[4]=or;
//        or = new OrangeRune("践踏", "orange", 2, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.60);
//        ofw[5]=or;
//        or = new OrangeRune("暴击", "orange", 2, 0.00, 0.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        ofw[6]=or;
//        or = new OrangeRune("拯救", "orange", 3, 0.00, 1.00, 0.00, 0.00, 1.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        ofw[7]=or;
//        or = new OrangeRune("致命", "orange", 3, 0.00, 1.30, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        ofw[8]=or;
//        or = new OrangeRune("恐惧", "orange", 3, 0.00, 0.00, 0.00, 0.00, 0.00, 2.10, 0.00, 0.00, 0.00, 0.00);
//        ofw[9]=or;
//        or = new OrangeRune("信念", "orange", 3, 0.00, 0.00, 0.00, 0.00, 0.00, 1.70, 0.00, 0.00, 0.00, 0.00);
//        ofw[10]=or;
//        or = new OrangeRune("振奋", "orange", 3, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.30, 0.00, 0.50);
//        ofw[11]=or;
//        or = new OrangeRune("一闪", "orange", 3, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.30, 1.30, 0.00);
//        ofw[12]=or;
//        or = new OrangeRune("暴戾", "orange", 4, 13.50, 1.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        ofw[13]=or;
//        or = new OrangeRune("荆棘", "orange", 4, 0.00, 1.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.40);
//        ofw[14]=or;
//        or = new OrangeRune("戒律", "orange", 4, 0.00, 0.00, 0.00, 0.00, 0.00, 2.50, 0.00, 0.30, 0.00, 0.00);
//        ofw[15]=or;
//        or = new OrangeRune("阳炎", "orange", 4, 0.00, 0.00, 0.00, 0.00, 0.00, 2.50, 1.40, 0.00, 0.00, 0.00);
//        ofw[16]=or;
//        or = new OrangeRune("衰败", "orange", 4, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.20);
//        ofw[17]=or;
//        or = new OrangeRune("风暴", "orange", 4, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.30, 1.10, 0.60);
//        ofw[18]=or;
//        or = new OrangeRune("惩戒", "orange", 4, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.00, 0.00, 0.00);
//        ofw[19]=or;
//        or = new OrangeRune("狂热", "orange", 4, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.50, 2.00, 0.00);
//        ofw[20]=or;
//        or = new OrangeRune("圣人", "orange", 5, 0.00, 0.00, 0.00, 0.00, 0.00, 5.30, 0.00, 0.00, 0.00, 0.00);
//        ofw[21]=or;
//        or = new OrangeRune("传承", "orange", 5, 0.00, 3.20, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        ofw[22]=or;
//        or = new OrangeRune("异变", "orange", 5, 0.00, 2.00, 0.00, 0.00, 3.60, 0.00, 0.00, 0.00, 0.00, 0.00);
//        ofw[23]=or;
//        or = new OrangeRune("纷争", "orange", 5, 0.00, 2.50, 0.50, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00);
//        ofw[24]=or;
//        or = new OrangeRune("梦魇", "orange", 5, 0.00, 0.00, 0.00, 0.00, 0.00, 4.20, 2.40, 0.00, 0.00, 0.00);
//        ofw[25]=or;
//        or = new OrangeRune("凶兆", "orange", 5, 0.00, 0.00, 0.00, 0.00, 0.00, 4.20, 0.00, 0.00, 0.00, 0.60);
//        ofw[26]=or;
//        or = new OrangeRune("宿命", "orange", 5, 33.70, 0.00, 0.00, 2.30, 0.00, 0.00, 0.00, 0.00, 0.00, 1.00);
//        ofw[27]=or;
//        or = new OrangeRune("红月", "orange", 5, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.50, 0.00, 1.60);
//        ofw[28]=or;
//        or = new OrangeRune("无双", "orange", 5, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.70, 3.60, 0.00);
//        ofw[29]=or;
//        or = new OrangeRune("祸源", "orange", 5, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 1.60, 0.00, 0.00);
//        ofw[30]=or;
//
//    }

    public static void orangec(){
        OrangeRune or = new OrangeRune("勇气", "orange", 1, 000, 060, 000, 000, 000, 000, 000, 000, 000, 000);
        ofw[0]=or;
        or = new OrangeRune("斗志", "orange", 1, 000, 000, 000, 000, 000, 110, 000, 000, 000, 000);
        ofw[1]=or;
        or = new OrangeRune("猛攻", "orange", 1, 000, 000, 000, 000, 000, 000, 000, 000, 000, 040);
        ofw[2]=or;
        or = new OrangeRune("白刃", "orange", 2, 000, 070, 000, 000, 000, 000, 000, 000, 000, 020);
        ofw[3]=or;
        or = new OrangeRune("痛苦", "orange", 2, 000, 000, 000, 000, 000, 120, 000, 010, 000, 000);
        ofw[4]=or;
        or = new OrangeRune("践踏", "orange", 2, 000, 000, 000, 000, 000, 000, 000, 000, 000, 060);
        ofw[5]=or;
        or = new OrangeRune("暴击", "orange", 2, 000, 050, 000, 000, 000, 000, 000, 000, 000, 000);
        ofw[6]=or;
        or = new OrangeRune("拯救", "orange", 3, 000, 100, 000, 000, 100, 000, 000, 000, 000, 000);
        ofw[7]=or;
        or = new OrangeRune("致命", "orange", 3, 000, 130, 000, 000, 000, 000, 000, 000, 000, 000);
        ofw[8]=or;
        or = new OrangeRune("恐惧", "orange", 3, 000, 000, 000, 000, 000, 210, 000, 000, 000, 000);
        ofw[9]=or;
        or = new OrangeRune("信念", "orange", 3, 000, 000, 000, 000, 000, 170, 000, 000, 000, 000);
        ofw[10]=or;
        or = new OrangeRune("振奋", "orange", 3, 000, 000, 000, 000, 000, 000, 000, 030, 000, 050);
        ofw[11]=or;
        or = new OrangeRune("一闪", "orange", 3, 000, 000, 000, 000, 000, 000, 000, 030, 130, 000);
        ofw[12]=or;
        or = new OrangeRune("暴戾", "orange", 4, 1350, 150, 000, 000, 000, 000, 000, 000, 000, 000);
        ofw[13]=or;
        or = new OrangeRune("荆棘", "orange", 4, 000, 150, 000, 000, 000, 000, 000, 000, 000, 040);
        ofw[14]=or;
        or = new OrangeRune("戒律", "orange", 4, 000, 000, 000, 000, 000, 250, 000, 030, 000, 000);
        ofw[15]=or;
        or = new OrangeRune("阳炎", "orange", 4, 000, 000, 000, 000, 000, 250, 140, 000, 000, 000);
        ofw[16]=or;
        or = new OrangeRune("衰败", "orange", 4, 000, 000, 000, 000, 000, 000, 000, 000, 000, 120);
        ofw[17]=or;
        or = new OrangeRune("风暴", "orange", 4, 000, 000, 000, 000, 000, 000, 000, 030, 110, 060);
        ofw[18]=or;
        or = new OrangeRune("惩戒", "orange", 4, 000, 000, 000, 000, 000, 000, 000, 100, 000, 000);
        ofw[19]=or;
        or = new OrangeRune("狂热", "orange", 4, 000, 000, 000, 000, 000, 000, 000, 050, 200, 000);
        ofw[20]=or;
        or = new OrangeRune("圣人", "orange", 5, 000, 000, 000, 000, 000, 530, 000, 000, 000, 000);
        ofw[21]=or;
        or = new OrangeRune("传承", "orange", 5, 000, 320, 000, 000, 000, 000, 000, 000, 000, 000);
        ofw[22]=or;
        or = new OrangeRune("异变", "orange", 5, 000, 200, 000, 000, 360, 000, 000, 000, 000, 000);
        ofw[23]=or;
        or = new OrangeRune("纷争", "orange", 5, 000, 250, 050, 000, 000, 000, 000, 000, 000, 000);
        ofw[24]=or;
        or = new OrangeRune("梦魇", "orange", 5, 000, 000, 000, 000, 000, 420, 240, 000, 000, 000);
        ofw[25]=or;
        or = new OrangeRune("凶兆", "orange", 5, 000, 000, 000, 000, 000, 420, 000, 000, 000, 060);
        ofw[26]=or;
        or = new OrangeRune("宿命", "orange", 5, 3370, 000, 000, 230, 000, 000, 000, 000, 000, 100);
        ofw[27]=or;
        or = new OrangeRune("红月", "orange", 5, 000, 000, 000, 000, 000, 000, 000, 050, 000, 160);
        ofw[28]=or;
        or = new OrangeRune("无双", "orange", 5, 000, 000, 000, 000, 000, 000, 000, 070, 360, 000);
        ofw[29]=or;
        or = new OrangeRune("祸源", "orange", 5, 000, 000, 000, 000, 000, 000, 000, 160, 000, 000);
        ofw[30]=or;

    }


    //  选择铭文
    public static void option(){
        System.out.println("请输入你想选择的铭文？");
        System.out.println("分别有blue、green、orange三种铭文");
        System.out.println("注:输入baochun存储用户和铭文信息");
        System.out.println("注:输入over返回的符文大陆模块");
        Scanner in = new Scanner(System.in);
        String fs = in.next();
        if (fs.equals("blue")){
            optionb();
        }else if(fs.equals("green")){
            optiong();
        }else if (fs.equals("orange")){
            optiono();
        }else if(fs.equals("baochun")){
            bang();
            showbang();
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

    //  查看蓝色铭文信息
        chakanb();


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
        int shengMing=000;//最大生命
        int huiXue=000;//每秒回血
        int moveSpeed=000;//移速
        int adHurt=000;//物理攻击
        int adXiXue=000;//物理吸血
        int adFang=000;//物理防御
        int apHurt=000;//法术攻击
        int apXiXue=000;//法术吸血
        int apFang=000;//法术防御
        int baoJil=000;//暴击率
        int adSpeed=000;//攻击速度

        for(int i=0;i<10;i++){
            for(int j=0;j<bfw.length;j++){
                if(fw[0][i].equals(bfw[j].getFname())){
                    level = level + bfw[j].getLevel();
                    shengMing = shengMing + bfw[j].getShengMing();
                    huiXue = huiXue + bfw[j].getHuiXue();
                    moveSpeed = moveSpeed + bfw[j].getMoveSpeed();
                    adHurt = adHurt + bfw[j].getAdHurt();
                    adXiXue = adXiXue + bfw[j].getAdXiXue();
                    adFang = adFang + bfw[j].getAdFang();
                    apHurt = apHurt + bfw[j].getApHurt();
                    apXiXue = apXiXue + bfw[j].getapXiXue();
                    apFang = apFang + bfw[j].getApFang();
                    baoJil = baoJil + bfw[j].getBaoJil();
                    adSpeed = adSpeed + bfw[j].getAdSpeed();
                }
            }
        }


        System.out.println(" 最大生命:" + shengMing/100.00 + " 每秒回血:" + huiXue/100.00 + " 移速:" + moveSpeed/100.00 +
                " 物理攻击:" + adHurt/100.00 +
                " 物理吸血:" + adXiXue/100.00 + " 物理防御:" + adFang/100.00 + " 法术攻击:" + apHurt/100.00 +
                " 法术吸血:" + apXiXue/100.00 + " 法术防御:" + apFang/100.00 + " 暴击率:" + baoJil/100.00 + " 攻击速度:" + adSpeed/100.00);
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

        //  查看绿色铭文
        chakang();

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
        int shengMing=000;//最大生命
        int huiXue=000;//每秒回血

        int adHurt=000;//物理攻击
        int adFang=000;//物理防御
        int adChuan=000;//物理穿透

        int apHurt=000;//法术攻击
        int apXiXue=000;//法术吸血
        int apFang=000;//法术防御
        int apChuan=000;//法术穿透

        int baoJil=000;//暴击率
        int adSpeed=000;//攻击速度
        int lengQue=000;//冷却

        for(int i=0;i<10;i++){
            for(int j=0;j<gfw.length;j++){
                if(fw[1][i].equals(gfw[j].getFname())){
                    level = level + gfw[j].getLevel();
                    shengMing = shengMing + gfw[j].getShengMing();
                    huiXue = huiXue + gfw[j].getHuiXue();
                    adHurt = adHurt + gfw[j].getAdHurt();
                    adFang = adFang + gfw[j].getAdFang();
                    adChuan = adChuan +gfw[j].getAdChuan();
                    apHurt = apHurt + gfw[j].getApHurt();
                    apXiXue = apXiXue + gfw[j].getapXiXue();
                    apFang = apFang + gfw[j].getApFang();
                    apChuan = apChuan + gfw[j].getApChuan();
                    baoJil = baoJil + gfw[j].getBaoJil();
                    adSpeed = adSpeed + gfw[j].getAdSpeed();
                    lengQue = lengQue + gfw[j].getLengQue();
                }
            }
        }


        System.out.println(" 最大生命:" + shengMing/100.00 + " 每秒回血:" + huiXue/100.00 +
                " 物理攻击:" + adHurt/100.00 + " 物理防御:" + adFang/100.00 + " 物理穿透:" + adChuan/100.00 +
                " 法术攻击:" + apHurt/100.00 + " 法术吸血:" + apXiXue/100.00 + " 法术防御:" + apFang/100.00 + " 法术穿透:" + apChuan/100.00 +
                " 暴击率:" + baoJil/100.00 + " 攻击速度:" + adSpeed/100.00 + " 冷却:" + lengQue/100.00);
        System.out.println("能力值:" + level);

        //  确认
        int fs = likai();
        if(fs==1){
            //  确认后返回主铭文页
            option();
        }else if(fs==0){
            optiong();
        }
    }

    //选择橙色铭文
    public static void optiono(){
        Scanner in = new Scanner(System.in);
        System.out.println("下面是商城里的所有蓝色铭文");
        for(int i=0;i<10;i++){
            System.out.print(" ["+ ofw[i].getFname() +"] ");
        }
        System.out.println();
        for(int i=10;i<20;i++){
            System.out.print(" ["+ ofw[i].getFname() +"] ");
        }
        System.out.println();
        for(int i=20;i<ofw.length;i++){
            System.out.print(" ["+ ofw[i].getFname() +"] ");
        }
        System.out.println();

    //  查看橙色铭文
        chakano();

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
        fw[2][0]=mw0;
        fw[2][1]=mw1;
        fw[2][2]=mw2;
        fw[2][3]=mw3;
        fw[2][4]=mw4;
        fw[2][5]=mw5;
        fw[2][6]=mw6;
        fw[2][7]=mw7;
        fw[2][8]=mw8;
        fw[2][9]=mw9;

        //  最终加成效果
        int level=0;
        int shengMing=000;//最大生命

        int adHurt=000;//物理攻击
        int adFang=000;//物理防御
        int adChuan=000;//物理穿透
        int adXiXue=000;//物理吸血

        int apHurt=000;//法术攻击
        int apChuan=000;//法术穿透

        int baoJil=000;//暴击率
        int baoJix=000;//暴击效果
        int adSpeed=000;//攻击速度

        for(int i=0;i<10;i++){
            for(int j=0;j<ofw.length;j++){
                if(fw[2][i].equals(ofw[j].getFname())){
                    level = level + ofw[j].getLevel();
                    shengMing = shengMing + ofw[j].getShengMing();

                    adHurt = adHurt + ofw[j].getAdHurt();
                    adFang = adFang + ofw[j].getAdFang();
                    adChuan = adChuan + ofw[j].getAdChuan();
                    adXiXue = adXiXue + ofw[j].getAdXiXue();

                    apHurt = apHurt + ofw[j].getApHurt();
                    apChuan = apChuan + ofw[j].getApChuan();

                    baoJil = baoJil + ofw[j].getBaoJil();
                    baoJix = baoJix + ofw[j].getBaoJix();
                    adSpeed = adSpeed + ofw[j].getAdSpeed();
                }
            }
        }


        System.out.println(" 最大生命:" + shengMing/100.00 +
                " 物理攻击:" + adHurt/100.00 + " 物理防御:" + adFang/100.00 + " 物理穿透:" + adChuan/100.00 + " 物理吸血:" + adXiXue/100.00 +
                " 法术攻击:" + apHurt/100.00 + " 法术穿透:" + apChuan/100.00 +
                " 暴击率:" + baoJil/100.00 + " 暴击效果:" + baoJix/100.00 +" 攻击速度:" + adSpeed/100.00 );
        System.out.println("能力值:" + level);

        //  确认
        int fs = likai();
        if(fs==1){
            //  确认后返回主铭文页
            option();
        }else if(fs==0){
            optiono();
        }
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

    //  查看蓝色铭文
    public static void chakanb(){
        Scanner in = new Scanner(System.in);
        boolean key = true;

        while (key){
            boolean key1 = true;
            System.out.println("请输入具体要查看的铭文信息:");
            String fs1 = in.next();
            for(int i=0;i<bfw.length;i++){
                if(fs1.equals(bfw[i].getFname())){
                    System.out.printf( " 名字:" + bfw[i].getFname());
                    System.out.printf( " 颜色:" + bfw[i].getColor());
                    System.out.print( " 等级:" + bfw[i].getLevel());
                    System.out.print( " 最大生命:" + bfw[i].getShengMing()/100.00);
                    System.out.print( " 每秒回血:" + bfw[i].getHuiXue()/100.00);
                    System.out.print( " 移速:" + bfw[i].getMoveSpeed()/100.00);
                    System.out.print( " 物理攻击:" + bfw[i].getAdHurt()/100.00);
                    System.out.print( " 物理吸血:" + bfw[i].getAdXiXue()/100.00);
                    System.out.print( " 物理防御:" + bfw[i].getAdFang()/100.00);
                    System.out.print( " 法术攻击:" + bfw[i].getApHurt()/100.00);
                    System.out.print( " 法术吸血:" + bfw[i].getapXiXue()/100.00);
                    System.out.print( " 法术防御:" + bfw[i].getApFang()/100.00);
                    System.out.print( " 暴击率:" + bfw[i].getBaoJil()/100.00);
                    System.out.print( " 攻击速度:" + bfw[i].getAdSpeed()/100.00);
                    System.out.println();
                    key1 = false;
                }
            }

            if(key1==true){
                System.out.println("没有此铭文！");
            }

            System.out.println("是否继续查看铭文信息？");
            System.out.println("1-继续，0-退出");
            int fs2 = in.nextInt();
            if(fs2 == 1){
                key=true;
            }else{
                key=false;
            }
        }
    }

    //  查看绿色铭文
    public static void chakang(){
        Scanner in = new Scanner(System.in);
        boolean key = true;
        while (key){
            boolean key1 = true;
            System.out.println("请输入具体要查看的铭文信息:");
            String fs1 = in.next();
            for(int i=0;i<gfw.length;i++){
                if(fs1.equals(gfw[i].getFname())){
                    System.out.printf( " 名字:" + gfw[i].getFname());
                    System.out.printf( " 颜色:" + gfw[i].getColor());
                    System.out.print( " 等级:" + gfw[i].getLevel());
                    System.out.print( " 最大生命:" + gfw[i].getShengMing()/100.00);
                    System.out.print( " 每秒回血:" + gfw[i].getHuiXue()/100.00);
                    System.out.print( " 物理攻击:" + gfw[i].getAdHurt()/100.00);
                    System.out.print( " 物理防御:" + gfw[i].getAdFang()/100.00);
                    System.out.print( " 物理穿透:" + gfw[i].getAdChuan()/100.00);
                    System.out.print( " 法术攻击:" + gfw[i].getApHurt()/100.00);
                    System.out.print( " 法术吸血:" + gfw[i].getapXiXue()/100.00);
                    System.out.print( " 法术防御:" + gfw[i].getApFang()/100.00);
                    System.out.print( " 法术穿透" + gfw[i].getApChuan()/100.00);
                    System.out.print( " 暴击率:" + gfw[i].getBaoJil()/100.00);
                    System.out.print( " 攻击速度:" + gfw[i].getAdSpeed()/100.00);
                    System.out.print( " 冷却:" + gfw[i].getLengQue()/100.00);
                    System.out.println();
                    key1 = false;
                }
            }

            if(key1==true){
                System.out.println("没有此铭文！");
            }

            System.out.println("是否继续查看铭文信息？");
            System.out.println("1-继续，0-退出");
            int fs2 = in.nextInt();
            if(fs2 == 1){
                key=true;
            }else{
                key=false;
            }
        }
    }

    //  查看橙色铭文
    public static void chakano(){
        Scanner in = new Scanner(System.in);
        boolean key = true;
        while (key){
            boolean key1 = true;
            System.out.println("请输入具体要查看的铭文信息:");
            String fs1 = in.next();
            for(int i=0;i<ofw.length;i++){
                if(fs1.equals(ofw[i].getFname())){
                    System.out.printf( " 名字:" + ofw[i].getFname());
                    System.out.printf( " 颜色:" + ofw[i].getColor());
                    System.out.print( " 等级:" + ofw[i].getLevel());
                    System.out.print( " 最大生命:" + ofw[i].getShengMing()/100.00);
                    System.out.print( " 物理攻击:" + ofw[i].getAdHurt()/100.00);
                    System.out.print( " 物理吸血:" + ofw[i].getAdXiXue()/100.00);
                    System.out.print( " 物理防御:" + ofw[i].getAdFang()/100.00);
                    System.out.print( " 物理穿透:" + ofw[i].getAdChuan()/100.00);
                    System.out.print( " 法术攻击:" + ofw[i].getApHurt()/100.00);
                    System.out.print( " 法术穿透" + ofw[i].getApChuan()/100.00);
                    System.out.print( " 暴击率:" + ofw[i].getBaoJil()/100.00);
                    System.out.print( " 暴击效果:" + ofw[i].getBaoJix()/100.00);
                    System.out.print( " 攻击速度:" + ofw[i].getAdSpeed()/100.00);
                    System.out.println();
                    key1 = false;
                }
            }

            if(key1==true){
                System.out.println("没有此铭文！");
            }

            System.out.println("是否继续查看铭文信息？");
            System.out.println("1-继续，0-退出");
            int fs2 = in.nextInt();
            if(fs2 == 1){
                key=true;
            }else{
                key=false;
            }
        }
    }
}
