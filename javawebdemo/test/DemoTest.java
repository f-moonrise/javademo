import com.mchange.v2.c3p0.ComboPooledDataSource;
import controller.UserController;
import org.junit.Test;
import pojo.A;
import pojo.User;
import services.UserService;
import utils.PropertiesUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/27 8:19
 */
public class DemoTest {
    @Test
    public void test1() throws SQLException{
        ComboPooledDataSource m = new ComboPooledDataSource();
        Connection connection = m.getConnection();
        String sql = "select * from stu";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int i = resultSet.getInt(1);
            String s = resultSet.getString("name");
            System.out.println("id"+i+"------" + "name" + s);
        }
    }

    @Test
    public void test2(){
        UserController us = new UserController();
        int i = us.register("zhang2","123456");
        System.out.println(i);
    }

    @Test
    public void test3(){
        UserController us = new UserController();
        List<User> all = us.getAll();
        for(User user : all){
            System.out.println(user);
        }
    }

    @Test
    public void test4() throws Exception{
        User u = new User();
        String className = PropertiesUtil.getValue("className");

        Class<?> aClass = Class.forName("pojo.User");
        User o = (User) aClass.newInstance();
        o.setUsername("zhangxin");
        System.out.println(o);
    }

    @Test
    public void test5() throws Exception{
        User u = new User();
        String className = PropertiesUtil.getValue("className");

        Class<?> aClass = Class.forName(className);
        UserService us = (UserService) aClass.newInstance();
        List<User> all = us.getAll();
        System.out.println(all);
    }

    @Test
    public void test6() throws Exception{
        User u = new User();
        String className = PropertiesUtil.getValue("className");

        Class<?> aClass = Class.forName(className);
        if (aClass.isInterface()){
            UserService us = (UserService) aClass.newInstance();
            List<User> all = us.getAll();
            System.out.println(all);
        }else {
            System.out.println("类型转换有问题");
        }
    }

    @Test
    public void test7() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("pojo.A");
        Constructor<?>[] cs = aClass.getConstructors();
        for(Constructor<?> c : cs){
            System.out.println(c);
        }
    }

    @Test
    public void test8() throws ClassNotFoundException, IllegalAccessException {
        Class<?> aClass = Class.forName("pojo.A");
        A a = new A();
        a.setM(1);
        a.setS("java");

        Field[] ff = aClass.getDeclaredFields();
        for(Field field : ff){
            field.setAccessible(true);
            Object o = field.get(a);
            System.out.println(o);
        }
    }

    @Test
    public void test9() throws Exception {
        Class<?> aClass = Class.forName("pojo.A");
        Object o = aClass.newInstance();

        Field[] ff = aClass.getDeclaredFields();
        for(Field field : ff){
            field.setAccessible(true);

            Class<?> type = field.getType();
            String name = type.getName();
            if(name.equals("java.lang.Integer")){
                field.set(o,10);
            }
            if(name.equals("java.lang.String")){
                field.set(o,"java");
            }
            System.out.println(o);
        }
    }

    @Test
    public void test10(){
        String s1 = "c";
        String s2 = "b";
        System.out.println(s1.compareTo(s2));
    }
}
