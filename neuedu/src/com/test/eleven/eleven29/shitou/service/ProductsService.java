package com.test.eleven.eleven29.shitou.service;

import com.test.eleven.eleven29.shitou.dao.ProductsDao;
import com.test.eleven.zhouce3.Products;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/30 14:09
 */
public class ProductsService {
    ProductsDao pd = new ProductsDao();

    public String showProducts(){
        String s = pd.showProducts();
        return s;
    }

    public String selectProducts(String name){
        String s = pd.selectProduct(name);
        return s;
    }

    public String selectProduct(int id){
        String s = pd.selectProduct(id);
        return s;
    }
}
