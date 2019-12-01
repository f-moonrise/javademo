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
    ProductsController pc = new ProductsController();


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
            if(fs==1){
                pc.showProducts();
            }else if(fs==2){
                pc.chaProducts();
            }else if(fs==3){
                pc.paiMai(asd);
            }else if(fs==4){
                uc.chong(asd);
            }else if(fs==5){
                uc.showUser(asd);
            }else if(fs==6){
                uc.youxi(asd);
            }else if(fs==7){
                uc.showInte();
            }else if(fs==8){
                uc.shangjia(asd);
            }else if(fs==9){
                pc.paip();
            }else if(fs==10){
                uc.cleang(asd);
            }else if(fs==0){
                loop();
            }
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



}
