package jdbcDemo.service;

import jdbcDemo.bean.Emp;

import java.util.List;

/**
 * @author Flobby
 */
public interface EmpService {
    List<Emp> searchAll() throws Exception;
    int insert(Emp emp) throws Exception;
}
