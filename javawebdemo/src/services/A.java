package services;

import pojo.User;

import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/28 10:15
 */
public class A implements UserService {

    @Override
    public int register(String username, String password) {
        return 0;
    }

    @Override
    public List<User> getAll() {
        System.out.println("这是A类");
        return null;
    }
}
