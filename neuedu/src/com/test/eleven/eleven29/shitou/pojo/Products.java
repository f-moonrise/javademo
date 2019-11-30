package com.test.eleven.eleven29.shitou.pojo;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/28 8:40
 */
public class Products {
    private int id;
    private String pname;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Products(){}

    public Products(int id, String pname, int price){
        this.id = id;
        this.pname = pname;
        this.price = price;
    }
}
