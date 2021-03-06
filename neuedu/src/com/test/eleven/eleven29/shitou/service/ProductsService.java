package com.test.eleven.eleven29.shitou.service;

import com.test.eleven.eleven29.shitou.controller.ProductsController;
import com.test.eleven.eleven29.shitou.dao.ProductsDao;
import com.test.eleven.eleven29.shitou.dao.UserDao;
import com.test.eleven.eleven29.shitou.pojo.Products;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/30 14:09
 */
public class ProductsService {
    ProductsDao pd = new ProductsDao();
//    ProductsController pc = new ProductsController();
    Products[] pro = new Products[10];
    UserDao ud = new UserDao();

    //展示商品
    public void showProducts(){
        pd.showProducts();
    }

    //名字查询
    public String selectProducts(String name){
        String s = pd.selectProduct(name);
        return s;
    }

    //id查询
    public String selectProduct(int id){
        String s = pd.selectProduct(id);
        return s;
    }

    //商品购买
    public String buyProducts(String fs,int asd){
        Products s = pd.selectProduct1(fs);
        if(ud!=null&&ud.us!=null&&ud.us[asd]!=null){
//            pro = ud.us[asd].getGcar();
            if(s!=null){
                for(int i =0;i<10;i++){
                    if(pro[i]==null){
                        pro[i]=s;
                            System.out.println("名称" + pro[i].getPname() + " 编号" + pro[i].getId()+ " 价格" + pro[i].getPrice());
                        ud.addPro(asd,pro);
                        return "成功加入购物车";
                    }
                }
            }
        }
        return "加入购物车失败";
    }

    //商品的上架
    public String shangjia(String name,int price,int asd){
        int fs = pd.shangjia(name, price, asd);
        if(fs==1){
            return "上架成功";
        }else{
            return "上架失败";
        }

    }

    //商品排行榜
    public void paip(){
        pd.paip();
        pd.showp();
    }
}
