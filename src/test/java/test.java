import onlineshop.dao.BaseDao;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

/**
 * test.java
 *
 * @author Milesians
 * @date 2020/10/20
 */
public class test {
    @Test
    public void test(){
        Properties properties = new Properties();
        try {
            properties.load(BaseDao.class.getResourceAsStream("/jdbc.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
