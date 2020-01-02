package com.trash.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.trash.pojo.Rubbish;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/29 23:51
 */
public class RubbishDao {
    QueryRunner qr = new QueryRunner(new ComboPooledDataSource());

    public List<Rubbish> selectAll() {
        String sql = "select * from rubbish";
        List<Rubbish> li = null;
        try {
            li = qr.query(sql,new BeanListHandler<Rubbish>(Rubbish.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li;
    }
}
