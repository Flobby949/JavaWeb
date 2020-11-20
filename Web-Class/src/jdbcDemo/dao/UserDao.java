package jdbcDemo.dao;

import jdbcDemo.bean.User;

/**
 * @author Flobby
 */
public interface UserDao {
    int addUser(User user);
    int addHead(String head);
}
