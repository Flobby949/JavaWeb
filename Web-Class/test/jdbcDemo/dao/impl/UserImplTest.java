package jdbcDemo.dao.impl;

import jdbcDemo.dao.UserDao;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserImplTest {
    UserDao userDao = new UserImpl();
    @Test
    void addUser() {
    }

    @Test
    void addHead() {
    }

    @Test
    void getUser() throws SQLException {
        boolean flag = userDao.getUser("flobby","123321");
        assertEquals(true,flag);
    }
}