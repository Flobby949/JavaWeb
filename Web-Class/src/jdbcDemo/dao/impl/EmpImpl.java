package jdbcDemo.dao.impl;

import jdbcDemo.bean.Emp;
import jdbcDemo.dao.EmpDao;
import jdbcDemo.servlet.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/11/11
 * @ClassName :接口实现类
 */

public class EmpImpl implements EmpDao {
    private Connection conn = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private String sql;
    @Override
    public List<Emp> searchAll() throws SQLException {
        conn = DBConnect.getInitDBConnect().getConnection();
        sql = "SELECT * FROM tb_emp";
        preparedStatement = conn.prepareStatement(sql);
        resultSet = preparedStatement.executeQuery();
        List<Emp> empList = new ArrayList<>();
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String job = resultSet.getString("job");
            double sal = resultSet.getDouble(4);
            Emp emp = new Emp(id,name,job,sal);
            empList.add(emp);
        }
        resultSet.close();
        preparedStatement.close();
        conn.close();
        return empList;
    }

    @Override
    public List<Emp> searchByName(String keywords) throws SQLException {
        conn = DBConnect.getInitDBConnect().getConnection();
        sql = "SELECT * FROM tb_emp WHERE name=?";
        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,keywords);
        resultSet = preparedStatement.executeQuery();
        List<Emp> empList = new ArrayList<>();
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String job = resultSet.getString("job");
            double sal = resultSet.getDouble(4);
            Emp emp = new Emp(id,name,job,sal);
            empList.add(emp);
        }
        resultSet.close();
        preparedStatement.close();
        conn.close();
        return empList;
    }

    @Override
    public Emp searchById(int id) throws SQLException {
        conn = DBConnect.getInitDBConnect().getConnection();
        sql = "SELECT * FROM tb_emp WHERE id=?";
        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        resultSet = preparedStatement.executeQuery();
        Emp emp = null;
        while (resultSet.next()){
            int id1 = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String job = resultSet.getString("job");
            double sal = resultSet.getDouble(4);
            emp = new Emp(id1,name,job,sal);
        }
        resultSet.close();
        preparedStatement.close();
        conn.close();
        return emp;
    }

    @Override
    public int updateById(int id, Emp emp) throws SQLException {
        int effectLine = 0;
        conn = DBConnect.getInitDBConnect().getConnection();
        sql = "UPDATE tb_emp SET name=?, job=?, sal=? WHERE id=?";
        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,emp.getName());
        preparedStatement.setString(2,emp.getJob());
        preparedStatement.setDouble(3,emp.getSal());
        preparedStatement.setInt(4,emp.getId());
        effectLine = preparedStatement.executeUpdate();
        conn.close();
        return effectLine;
    }

    @Override
    public int insert(Emp emp) throws SQLException {
        int effectLine = 0;
        conn = DBConnect.getInitDBConnect().getConnection();
        sql = "INSERT INTO tb_emp(id,name,job,sal) VALUES(id,?,?,?)";
        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,emp.getName());
        preparedStatement.setString(2,emp.getJob());
        preparedStatement.setDouble(3,emp.getSal());
        effectLine = preparedStatement.executeUpdate();
        conn.close();
        return effectLine;
    }

    @Override
    public int deleteById(int id) throws SQLException {
        int effectLine = 0;
        conn = DBConnect.getInitDBConnect().getConnection();
        String sql = "DELETE FROM tb_emp WHERE id=?";
        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        effectLine = preparedStatement.executeUpdate();
        conn.close();
        return effectLine;
    }
}
