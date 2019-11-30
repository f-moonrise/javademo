package com.test.eleven.eleven29.shitou.controller;

import com.test.eleven.eleven29.shitou.service.ProductsService;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/30 14:10
 */
public class ProductsController {
    ProductsService ps = new ProductsService();

    //展示商品
    public String showProducts(){
        String s = ps.showProducts();
        return s;
    }

    public String selectProducts(){
        
    }
}
