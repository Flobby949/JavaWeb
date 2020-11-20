package jdbcDemo.service.Impl;

import jdbcDemo.bean.Emp;
import jdbcDemo.factory.ServiceFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpServiceImplTest {

    @Test
    void searchAll() {
        try {
            List<Emp> empList= ServiceFactory.getEmpServiceInstance().searchAll();
            empList.forEach(emp -> System.out.println(emp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void insert() {
    }
}