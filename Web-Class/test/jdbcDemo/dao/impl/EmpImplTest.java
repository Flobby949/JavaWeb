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
        try {
            List<Emp> list = empDao.searchByName("张三");
            list.forEach(emp -> System.out.println(emp));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void searchById() throws SQLException {
        Emp emp = empDao.searchById(0);
        if (emp!=null){
            System.out.println(emp.getName());
        }else {
            System.out.println("不存在");
        }

    }

    @Test
    void updateById() throws SQLException {
        Emp emp = new Emp(34,"feifeifei","fei",456164);
        int effectLine = empDao.updateById(34,emp);
        assertEquals(1,effectLine);
    }

    @Test
    void insert() throws SQLException {
        Emp emp = new Emp("aaa","bbb",123321);
        int effectLine = empDao.insert(emp);
        assertEquals(1,effectLine);
    }

    @Test
    void deleteById() throws SQLException {
        int effectLine = empDao.deleteById(41);
        assertEquals(1,effectLine);
    }
}