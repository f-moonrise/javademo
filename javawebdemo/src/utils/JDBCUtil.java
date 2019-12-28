package utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import jdk.internal.util.xml.impl.Input;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/27 8:35
 */
public class JDBCUtil {
//    //不使用连接池
//    static String driverClass;
//    static String url;
//    static String user;
//    static String password;
//
//    static {
//        Properties p = new Properties();
//        InputStream in = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
//        try {
//            p.load(in);
//            driverClass = p.getProperty("driverClass");
//            url = p.getProperty("url");
//            user = p.getProperty("user");
//            password = p.getProperty("password");
//            Class.forName(driverClass);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e){
//            e.printStackTrace();
//        }
//    }
//
//    public static Connection getCon() throws SQLException{
//        Connection connection = DriverManager.getConnection(url,user,password);
//        return connection;
//    }

    //利用连接池
    public static Connection getCon() throws SQLException{
        ComboPooledDataSource cd = new ComboPooledDataSource();
        Connection connection = cd.getConnection();
        return connection;
    }
}
