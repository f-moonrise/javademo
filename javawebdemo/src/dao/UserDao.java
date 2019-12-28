package dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import pojo.User;
import utils.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/26 23:22
 */
public class UserDao {

    static QueryRunner qr = new QueryRunner(new ComboPooledDataSource());

    //增
//    //不用连接池
//    public int insertByUsernameAndPassword(String username,String password){
//        int i = 0;
//        try{
//            Connection con = JDBCUtil.getCon();
//            String sql = "insert into itdruser value (null,?,?)";
//            PreparedStatement preparedStatement = con.prepareStatement(sql);
//            preparedStatement.setString(1,username);
//            preparedStatement.setString(2,password);
//            i = preparedStatement.executeUpdate();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return 0;
//    }
    //用连接池
    public int insertByUsernameAndPassword(String username,String password) {
        String sql = "insert into itdruser values(null,?,?)";
        int i = 0;
        try {
            i = qr.update(sql, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }


    //删
    //改
    //查
//    public User selectByUsername(String username){
//        User u = null;
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/fengsheng"+"?serverTimezone=GMT%2B8";
//            String user = "root";
//            String password = "1332691109";
//            Connection connection = DriverManager.getConnection(url,user,password);
//            String sql = "select * from itdruser where username = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1,username);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()){
//                u = new User();
//                u.setId(resultSet.getInt("id"));
//                u.setUsername(resultSet.getString("username"));
//                u.setPassword(resultSet.getString("password"));
//            }
//
//
//        }catch (Exception e){
//            System.out.println("查询用户有异常");
//            e.printStackTrace();
//        }
//        return u;
//    }

     public User selectByUsername(String username){
        User u = null;
        String sql = "select * from itdruser ";
        try{
           u = qr.query(sql,new BeanHandler<User>(User.class));
        }catch (SQLException e){
           e.printStackTrace();
        }
        return u;
     }

     public List<User> selectAll(){
        List<User> li = null;
        String sql = "select * from itdruser  ";
        try {
            li = qr.query(sql,new BeanListHandler<User>(User.class));
        }catch (SQLException e){
            e.printStackTrace();
        }
        return li;
     }
}
