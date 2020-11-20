package jdbcDemo.service.Impl;

import jdbcDemo.bean.Emp;
import jdbcDemo.factory.DaoFactory;
import jdbcDemo.service.EmpService;

import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2020/11/18
 * @Description :
 */

public class EmpServiceImpl implements EmpService {
    @Override
    public List<Emp> searchAll() throws Exception {
        List<Emp> empList = DaoFactory.getEmpDaoInstance().searchAll();
        return empList;
    }

    @Override
    public int insert(Emp emp) throws Exception {
        int effectLine = DaoFactory.getEmpDaoInstance().insert(emp);
        return effectLine;
    }
}
