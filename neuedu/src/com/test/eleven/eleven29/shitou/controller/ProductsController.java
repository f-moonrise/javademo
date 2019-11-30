package com.test.eleven.eleven29.shitou.controller;

import com.test.eleven.eleven29.shitou.Util;
import com.test.eleven.eleven29.shitou.service.ProductsService;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/30 14:10
 */
public class ProductsController {
    ProductsService ps = new ProductsService();
    Scanner in = new Scanner(System.in);


    //展示商品
    public void showProducts(){
        Util.paiMai();
        ps.showProducts();
    }

    //名字查询
    public void selectProductsn(){
        Util.select();
        System.out.println("输入你要查询的名称");
        String fs = in.next();
        String fs1 = ps.selectProducts(fs);
        System.out.println(fs1);
    }

    //id查询
    public void selectProductsi(){
        Util.select();
        System.out.println("输入你要查询的id");
        int fs = in.nextInt();
        String fs1 = ps.selectProduct(fs);
        System.out.println(fs1);
    }

    //选择查询类型
    public void chaProducts(){
        Util.cha();
        int fs = in.nextInt();
        if(fs==1){
            //id查询
            selectProductsi();
        }else if(fs==2){
            //名字查询
            selectProductsn();
        }
    }

    //开始拍卖
    public void paiMai(int asd){
        Util.paiMai();
        System.out.println("输入你要购买商品的名称");
        String fs = in.next();
        String fs1 = ps.buyProducts(fs,asd);
        System.out.println(fs1);
        paiMaij(asd);
    }

    //是否继续拍卖
    public void paiMaij(int asd){
        Util.paiduan();
        int fs = in.nextInt();
        if(fs==1){
            paiMai(asd);
        }else if(fs==2){
            chaProducts();
        }
    }
}
