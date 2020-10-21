package onlineshop.service;

import onlineshop.dao.BaseDao;
import onlineshop.entity.User;

/**
 * UserDao.java
 *
 * @author Milesians
 * @date 2020/10/20
 */
public class UserDao {
    public static int insert(User u) {
        String sql = "insert into user values(?,?,?,?,DATE_FORMAT(?,'%Y-%m-%d'),?,?,?,?,?)";
        Object[] params = {
                u.getUserId(),
                u.getUserName(),
                u.getUserPassword(),
                u.getUserSex(),
                u.getUserBirthday(),
                u.getUserIdenityCode(),
                u.getUserEmail(),
                u.getUserMobile(),
                u.getUserAddress(),
                u.getUserStatus()
        };
        return BaseDao.exectuIUD(sql, params);
    }
}
