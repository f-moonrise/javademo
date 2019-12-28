package services;

import pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/26 23:17
 */
public interface UserService {
    int register(String username,String password);

    List<User> getAll();
}
