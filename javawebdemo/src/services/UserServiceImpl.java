package services;

import dao.UserDao;
import pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/26 23:18
 */
public class UserServiceImpl implements UserService {
    UserDao ud = new UserDao();

    @Override
    public int register(String username, String password) {
        if(username == null || username.equals("")){
            return 0;
        }
        if(password == null || password.equals("")){
            return 0;
        }

        //用户是否存在
        User user = ud.selectByUsername(username);
        if (user != null){
            return 1;
        }

        //用户不存在才保存
        int i = ud.insertByUsernameAndPassword(username,password);
        return i;
    }

    @Override
    public List<User> getAll() {
        List<User> li = ud.selectAll();
        return li;
    }
}
