package com.test;

import java.sql.*;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/24 19:18
 */
public class JDBCUtil {
    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch ( ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    //1.对外提供连接对象
    public static Connection getCon(String url,String root,String password) throws SQLException{
        Connection connection = DriverManager.getConnection(url, root, password);
        return connection;
    }

    //2.关闭资源
    public static void closeAll(Connection con, Statement st, ResultSet rs){
        try {
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
