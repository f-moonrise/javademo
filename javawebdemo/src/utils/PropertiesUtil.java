package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/28 9:32
 */
public class PropertiesUtil {
    public static String getValue(String key){
        Properties p = new Properties();
        InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream("st.properties");
        String property = null;
        try {
            p.load(in);
            property = p.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return property;
    }
}
