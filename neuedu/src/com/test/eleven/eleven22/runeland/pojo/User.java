package com.test.eleven.eleven22.runeland.pojo;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/23 9:10
 */
public class User {
     public String uname;
     public String pwd;
     public int fw;

    public User(){

    }

    public User(String uname,String pwd){
        this.uname = uname;
        this.pwd = pwd;
    }

    public User(String uname,String pwd,int fw){
        this.uname = uname;
        this.pwd = pwd;
        this.fw = fw;
    }


}
