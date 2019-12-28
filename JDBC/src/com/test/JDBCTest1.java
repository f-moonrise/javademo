package com.test;

import com.test.JDBCUtil;

import java.sql.*;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/24 15:13
 */
public class JDBCTest1 {

    public static void main(String[] args)  {
        try {
            //建立连接
            String url = "jdbc:mysql://localhost:3306/fengsheng" + "?serverTimezone=GMT%2B8";
            String user = "root";
            String password = "1332691109";
            Connection con = JDBCUtil.getCon(url,user,password);

            //创建对象
            Statement st = con.createStatement();

            //执行sql语句
            String sql = "select * from a";
            ResultSet rs = st.executeQuery(sql);

            //处理结束
            while (rs.next()){
                System.out.println( rs.getInt("Aid"));
            }

            //关闭资源
            JDBCUtil.closeAll(con,st,rs);
        } catch ( SQLException e) {
            e.printStackTrace();
        }
    }
}
