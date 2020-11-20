package jdbcDemo.service;

import jdbcDemo.bean.Emp;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Flobby
 */
public interface EmpService {
    List<Emp> searchAll() throws Exception;
    int insert(Emp emp) throws Exception;
    int deleteById(int id) throws Exception;
    int updateById(int id,Emp emp) throws Exception;
    List<Emp> searchByName(String keywords)throws Exception;
    Emp searchById(int id)throws Exception;
}
