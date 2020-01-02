package com.trash.service;

import com.trash.dao.UsersDao;
import com.trash.pojo.Users;

import java.sql.SQLException;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/27 15:25
 */
public class UsersServiceImpl implements UsersService {
    private UsersDao ud = new UsersDao();

    @Override
    public void register(String uname) {
        Users users = null;
        try {
            users = ud.selectByUname(uname);

            if(users != null){
                return;
            }
            Users u = new Users();
            u.setUsername(uname);
            ud.insertByUname(u);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int updateSort(Integer num) {
        return ud.updateBySort(num);
    }
}
