package com.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/25 13:22
 */
public class JDBCDemo {
    public static void main(String[] args) {
        {
            try {
                //建立连接
                String url = "jdbc:mysql://localhost:3306/fengsheng" + "?serverTimezone=GMT%2B8";
                String user = "root";
                String password = "1332691109";
                Connection con = JDBCUtil2.getCon();

                //创建对象
                Statement st = con.createStatement();

                //执行sql语句
                String sql = "select * from a where id = 1";
                ResultSet rs = st.executeQuery(sql);

                //处理结束
                while (rs.next()){
                    System.out.println( rs.getInt("Aid"));
                }

                //关闭资源
                JDBCUtil2.closeAll(con,st,rs);
            } catch ( SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
