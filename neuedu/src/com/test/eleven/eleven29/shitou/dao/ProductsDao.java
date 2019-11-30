package com.test.eleven.eleven29.shitou.dao;

import com.test.eleven.eleven29.shitou.pojo.Products;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/30 10:53
 */
public class ProductsDao {
        Products[] products = new Products[100];
        //商品初始化
    public void chup(){
        Products p = new Products(0, "主宰", 18888);
        products[0] = p;
        p = new Products(1, "李白", 18888);
        products[1] = p;
        p = new Products(2, "宫本武藏", 18888);
        products[2] = p;
        p = new Products(3, "吕布", 18888);
        products[3] = p;
        p = new Products(4, "鲁班", 13888);
        products[4] = p;
        p = new Products(5, "貂蝉", 13888);
        products[5] = p;
        p = new Products(6, "钟馗", 13888);
        products[6] = p;
        p = new Products(7, "诸葛亮", 18888);
        products[7] = p;
        p = new Products(8, "百里守约", 13888);
        products[8] = p;
        p = new Products(9, "典韦", 13888);
        products[9] = p;
        p = new Products(10, "雅典娜", 18888);
    }

    //商品展示
    public String showProducts(){
        for(int i=0;i<products.length;i++){
            if(products[i]!=null){
                return "编号:" + products[i].getId() + "名称:" + products[i].getPname() + "价格:" + products[i].getPrice();
            }
        }
        return null;
    }

    //商品查询
    public String selectProduct(int id){
            for(int i=0;i<products.length;i++){
                if(products[i]!=null){
                    if(products[i].getId() == (id)){
                        return "编号:" + products[i].getId() + "名称:" + products[i].getPname() + "价格:" + products[i].getPrice();
                    }
                }
            }
        return "没有找到该商品";
    }

    public String selectProduct(String name){
        if(name!=null){
            for(int i=0;i<products.length;i++){
                if(products[i]!=null){
                    if(products[i].getPname().equals(name)){
                        return "编号:" + products[i].getId() + "名称:" + products[i].getPname() + "价格:" + products[i].getPrice();
                    }
                }
            }
        }
        return "没有找到该商品";
    }
}
