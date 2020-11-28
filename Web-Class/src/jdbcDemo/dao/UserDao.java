package jdbcDemo.dao;

import jdbcDemo.bean.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Flobby
 */
public interface UserDao {
    int addUser(User user) throws SQLException;
    String getHead(String name) throws SQLException;
    boolean getUser(String name,String password) throws SQLException;
}
