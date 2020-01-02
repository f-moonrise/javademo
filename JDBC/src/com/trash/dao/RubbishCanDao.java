package com.trash.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.trash.pojo.Rubbish;
import com.trash.pojo.RubbishCan;
import com.trash.pojo.Users;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/30 0:37
 */
public class RubbishCanDao {
    QueryRunner qr = new QueryRunner(new ComboPooledDataSource());

    public RubbishCan selectByRname(RubbishCan rc) {
        String sql = "select * from rubbishcan where rname = ?";
        RubbishCan query = null;
        try {
            query = qr.query(sql,new BeanHandler<RubbishCan>(RubbishCan.class),rc.getRname());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }
}
