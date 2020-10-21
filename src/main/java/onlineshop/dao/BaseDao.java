package onlineshop.dao;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * BaseDao.java
 *
 * @author Milesians
 * @date 2020/10/20
 */
public class BaseDao {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static {
        //读取资源
        try {
            Properties properties = new Properties();
            properties.load(BaseDao.class.getResourceAsStream("/jdbc.properties"));
            driver = properties.getProperty("prop.driverClass");
            url = properties.getProperty("prop.url");
            username = properties.getProperty("prop.userName");
            password = properties.getProperty("prop.password");
            System.out.println("资源加载成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //加载驱动
        try {
            Class.forName(driver);
            System.out.println("驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConn() {
        Connection connection = null;
        try {

            connection = DriverManager.getConnection(url, username, password);
            System.out.println("链接创建成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static int exectuIUD(String sql, Object[] params) {
        int count = 0;
        Connection connection = BaseDao.getConn();
        //准备sql语句
        PreparedStatement ps = null;
        try {
            //准备sql语句
            ps = connection.prepareStatement(sql);
            //绑定参数
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            count = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(null,ps,connection);
        }

        return count;
    }


    public static void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) {

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }


}
