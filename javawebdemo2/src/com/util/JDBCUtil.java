package com.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/30 18:14
 */
public class JDBCUtil {
    //连接数据库
    public static Connection getCon() throws SQLException {
        ComboPooledDataSource cd = new ComboPooledDataSource();
        Connection connection = cd.getConnection();
        return connection;
    }
}
