package jdbcDemo.dao;

import jdbcDemo.bean.Emp;
import java.sql.SQLException;
import java.util.List;

public interface EmpDao {
    List<Emp> searchAll() throws SQLException;

    List<Emp> searchByName(String keywords)throws SQLException;

    Emp searchById(int id)throws SQLException;

    int updateById(int id,Emp emp)throws SQLException;

    int insert(Emp emp)throws SQLException;

    int deleteById(int id)throws SQLException;
}
