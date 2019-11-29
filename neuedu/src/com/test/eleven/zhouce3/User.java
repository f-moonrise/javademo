package com.test.eleven.zhouce3;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/28 8:37
 */
public class User {
    String uname;//姓名
    String pwd;//密码
    int money;//金额
    int level;//等级
    String[] gcar = new String[10];

    User(){}

    User(String uname, String pwd, int money,int level, String[] gcar){
        this.uname = uname;
        this.pwd = pwd;
        this.money = money;
        this.level = level;
        this.gcar = gcar;
    }


}
