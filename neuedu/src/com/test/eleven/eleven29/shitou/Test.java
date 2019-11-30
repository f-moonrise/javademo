package com.test.eleven.eleven29.shitou;

import com.test.eleven.eleven29.shitou.controller.ProductsController;
import com.test.eleven.eleven29.shitou.controller.UserController;
import com.test.eleven.eleven29.shitou.dao.ProductsDao;
import com.test.eleven.eleven29.shitou.dao.UserDao;
import com.test.eleven.eleven29.shitou.pojo.Products;
import com.test.eleven.eleven29.shitou.service.ProductsService;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 14:39
 */
public class Test {
    Scanner in = new Scanner(System.in);
    UserController uc = new UserController();

    public static void main(String[] args){
        ProductsDao pd = new ProductsDao();
        pd.chup();

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
    public void gong(int asd){
        while (true){
            Util.gong();
            System.out.println("请输出你的选择:");
            int fs = in.nextInt();
            uc.gong(fs,asd);
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
        int fs = uc.login(name1, psd);
        if(fs!=0){
            gong(fs-1);
        }
    }











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