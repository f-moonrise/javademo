package com.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/25 15:41
 */
public class PoolDemo {
    //创建一个静态连接池
    static ArrayList<Connection> li = new ArrayList<>();
    static {
        for(int i=0;i<5;i++){
            try{
                li.add(JDBCUtil2.getCon());
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    //创建非静态连接池
    private ArrayList<Connection> li2 = new ArrayList<>();
    public PoolDemo(){
        for(int i=0;i<5;i++){
            try{
                li2.add(JDBCUtil2.getCon());
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Connection> getLi2(){
        return li2;
    }

    //通过静态连接池获取连接
    public static Connection getCon(){
        Connection remove = null;
        if(li.size() == 0){
            for(int i=0;i<5;i++){
                try {
                    li.add(JDBCUtil2.getCon());
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        for(int i=0;i<li.size();i++){
            remove = li.remove(i);
            break;
        }
        return remove;
    }

    //通过非静态连接池获取连接
    public Connection getCon2(){
        PoolDemo p = new PoolDemo();
        ArrayList<Connection> li2 = p.getLi2();
        Connection remove = null;
        if(li2.size() == 0){
            for(int i=0;i<5;i++){
                try{
                    li2.add(JDBCUtil2.getCon());
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        for(int i=0;i<li2.size();i++){
            remove = li2.remove(i);
            break;
        }
        return remove;
    }

    //返回
    public static void addBack(Connection con){
        li.add(con);
    }

    public void addBack2(Connection con){
        li2.add(con);
    }
 }
