package com.trash.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.trash.pojo.Users;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/27 15:26
 */
public class UsersDao {
    QueryRunner qr = new QueryRunner(new ComboPooledDataSource());

    //增删改查
    //查询用户
    public Users selectByUname(String uname) throws SQLException {
        String sql = "select * from itdruser where username=?";
        Users query = qr.query(sql,new BeanHandler<Users>(Users.class),uname);
        return query;
    }

    //增加用户
    public int insertByUname(Users u) throws SQLException {
        String sql = "insert into itdruser values(null,?,null,0)";
        int i = qr.update(sql,u);
        return i;
    }

    //更新积分
    public int updateBySort(Integer num)  {
        String sql = "update itdruser set sort = ?";
        int i = 0;
        try {
            i = qr.update(sql,num);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
