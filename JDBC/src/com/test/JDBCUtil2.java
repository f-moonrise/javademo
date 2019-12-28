package com.test;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/25 12:54
 */
public class JDBCUtil2 {
    static String driverClass;
    static String url;
    static String user;
    static String password;

    static {
        Properties p = new Properties();
        InputStream in = JDBCUtil2.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            p.load(in);
            driverClass = p.getProperty("driverClass");
            url = p.getProperty("url");
            user = p.getProperty("username");
            password = p.getProperty("password");
            Class.forName(driverClass);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //1.对外提供连接对象
    public static Connection getCon() throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        return connection;
    }

    //2.查询关闭数据库
    public static void closeAll(Connection con,Statement st, ResultSet rs){
        closeResult(rs);
        closeStatement(st);
        closeConnection(con);
    }
    //3.增删改关闭数据资源
    public static void closeAll(Connection con,Statement st){
        closeStatement(st);
        closeConnection(con);
    }

    private static void closeConnection(Connection con){
        if(con != null){
            try{
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    private static void closeStatement(Statement st){
        if(st != null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void closeResult(ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
