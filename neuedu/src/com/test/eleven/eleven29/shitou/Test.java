package com.test.eleven.eleven29.shitou;

import com.test.eleven.eleven29.shitou.controller.UserController;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 14:39
 */
public class Test {
    Scanner in = new Scanner(System.in);
    UserController uc = new UserController();

    public static void main(String[] args){
        Test test = new Test();
        test.loop();
    }

    //主架构
    public void loop(){
        Util.start();
        boolean key = true;
        int shu = in.nextInt();

        while (key){
            switch (shu){
                case 1:
                    //注册
                    Util.regist();
                    register();
                    loop();
                    break;
                case 2:
                    //登录
                    Util.login();
                    login();

                default:
                    key = false;
                    break;
            }
        }
    }


    //功能模块
    public void gong(){
        while (true){
            Util.gong();
            System.out.println("请输出你的选择:");
            int fs = in.nextInt();
            uc.gong(fs);
        }
    }

    //注册
    public void register(){
        System.out.println("请注册");
        System.out.println("姓名:");
        String name = in.next();
        System.out.println("密码:");
        String psd = in.next();
        String fs = uc.register(name,psd);
        System.out.println(fs);
    }

    //登录
    public void login(){
        System.out.println("请登录");
        System.out.println("姓名:");
        String name1 = in.next();
        System.out.println("密码:");
        String psd = in.next();
        String fs = uc.login(name1, psd);
        System.out.println(fs);
        if(fs.equals("登录成功")){
            gong();
        }
    }



    //排行榜
    public void showInte(){
        String fs = uc.showInte();
        System.out.println(fs);
    }

    //游戏
    public void youxi(){
        System.out.println("请输入你的选择：//定义1-拳头，2-剪刀，3-布");
        int select =in.nextInt();
        String fs = uc.youxi(select);
        System.out.println(fs);
    }

//    static Scanner in = new Scanner(System.in);
//    static User[] user = new User[10];
//    static Products[] products = new Products[100];
//    static int asd ;
//    static String[] car = new String[10];
//
//
//    public static void main(String[] args){
//        //初始化
//        chup();
//        //展示
//        show();
////        showProducts();
////        showUser();
//        in.close();
//    }
//



//
//    //拍卖
//    public static void paiMai(){
//        Util.paiMai();
//        showProducts();
//        paiMaiju(asd);
//    }
//
//    public static void paiMaiju(int asd){
//        System.out.println("请输入你选择商品的编号或名称:");
//        String fs = in.next();
//        int j=0;
//        if(fs!=null){
//            for(int i=0;i<products.length;i++){
//                if(products[i]!=null){
//                    if(products[i].pname.equals(fs)||products[i].id.equals(fs)){
//                        if(user!=null&&user[asd]!=null){
//                            for(int k=0;k<car.length;k++){
//                                car[k]=products[i].pname;
//                                break;
//                            }
//                        }
//                    }
//                }
//            }
//        }else {
//            System.out.println("对不起，你没有输入任何信息。");
//            paiMaiju(asd);
//        }
//
//        user[asd].gcar=car;
//        System.out.println("拍卖成功。");
//        //是否继续拍卖
//        paiduan();
//    }
//
//    //是否继续拍卖
//    public static void paiduan(){
//        Util.paiduan();
//        int fs = in.nextInt();
//        if(fs==1){
//            paiMaiju(asd);
//        }else if(fs==2){
//            showProducts();
//            paiduan();
//        }else if(fs==0){
//            showUser();
//            show();
//        }
//    }
//
//    //打印用户信息
//    public static void showUser(){
//        for(int i=0;i<user.length;i++){
//            if(user!=null&&user[i]!=null&&user[i].uname!=null&&user[i].gcar!=null){
//                System.out.printf("名字:"+user[i].uname);
//                System.out.print("积分:"+user[i].money +"等级:"+user[i].level);
//                System.out.printf("已选商品:");
//                for(int j=0;j<user[i].gcar.length;j++){
//                    if(user[i].gcar[i]!=null){
//                        System.out.print(user[i].gcar[j]);
//                    }
//                }
//            }
//        }
//        System.out.println();
//    }
//

//
//    //商品展示
//    public static void showProducts(){
//        for(int i=0;i<products.length;i++){
//            if(products[i]!=null){
//                System.out.printf("编号:" + products[i].id + " 名称:" + products[i].pname + " 价格:" + products[i].price + "  \t" );
//                while ((i+1)%5==0){
//                    System.out.println();
//                    break;
//                }
//            }
//        }
//    }
//
    //商品查询
//    public static void chaProducts(){
//        Util.cha();
//        String fs = in.next();
//        if(fs!=null){
//            for(int i=0;i<products.length;i++){
//                if(products[i]!=null){
//                    if(products[i].pname.equals(fs)||products[i].id.equals(fs)){
//                        System.out.print("编号:" + products[i].id + "     ");
//                        System.out.print("名称:" + products[i].pname + "     ");
//                        System.out.println("价格:" + products[i].price);
//                    }
//                }
//            }
//        }else {
//            System.out.println("对不起，你没有输入任何信息。");
//            chaProducts();
//        }
//    }
//
//    //账户充值
//    public static void chong(){
//        Util.chong();
//        System.out.println("请输入你要充值的金额:");
//        int fs=in.nextInt();
//        if(fs<0||fs>100){
//            System.out.println("充值失败！");
//        }else {
//            user[asd].money = user[asd].money + fs;
//            System.out.println("充值成功");
//            showUser();
//        }
//    }
//
//    //商品的上架
//    public static void shangjia(){
//        System.out.println("请输入你要拍卖商品的信息:包括编号id，名字name,价格price");
//        String id = in.next();
//        String name = in.next();
//        int price = in.nextInt();
//        Products p = new Products(id,name,price);
//
//        for(int i=0;i<products.length;i++){
//            if(products[i]==null){
//                products[i] = p;
//            }
//        }
//    }
//
//    //商品排行榜
//    public static void paihangb(){
//        for(int i=0;i<products.length;i++){
//
//        }
//    }
//
//    //结算模块

}
//            System.out.println("石头剪刀布游戏");
//                    System.out.println("1、注册");
//                    System.out.println("2、登录");
//                    System.out.println("3、注销");
//                    System.out.println("4、排行榜");
//                    System.out.println("5、游戏");
//                    System.out.println("6、退出");