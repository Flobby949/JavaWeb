package jdbcDemo.dao.impl;

import jdbcDemo.bean.Emp;
import jdbcDemo.dao.EmpDao;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpImplTest {
    EmpDao empDao = new EmpImpl();
    @Test
    void searchAll() {
        try {
            List<Emp> list = empDao.searchAll();
            list.forEach(emp -> System.out.println(emp));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void searchByName() {
    }

    @Test
    void searchById() {
    }

    @Test
    void updateById() {
    }

    @Test
    void insert() throws SQLException {
        Emp emp = new Emp("aaa","bbb",123321);
        int effectLine = empDao.insert(emp);
        assertEquals(1,effectLine);
    }

    @Test
    void deleteById() {
    }
}