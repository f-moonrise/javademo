import com.test.JDBCUtil2;
import com.test.PoolDemo;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/25 10:47
 */
public class DemoTest {

    @Test
    public void test2() throws IOException{
        Properties p = new Properties();
        InputStream in = DemoTest.class.getClassLoader().getResourceAsStream("db.properties");
        p.load(in);
        String driverClass = p.getProperty("driverClass");
        System.out.println(driverClass);
    }

    @Test
    public void test1() throws SQLException{
        Connection con = JDBCUtil2.getCon();
        Statement statement = con.createStatement();
        String sql = "select * from stu where id = 1 or 1";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
    }

    @Test
    public void test3() throws SQLException{
        Connection con = JDBCUtil2.getCon();
        String sql = "select * from a where Aid = ?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1,"1 or 1");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("Aid"));
        }
    }

    @Test
    public void test4() throws SQLException{
        Connection con = PoolDemo.getCon();
        System.out.println(con);
        PoolDemo.addBack(con);
    }

    @Test
    public void test5() throws SQLException{
        PoolDemo p = new PoolDemo();
        Connection con2 = p.getCon2();
        System.out.println(con2);
        p.addBack2(con2);
    }
}
