package jdbcDemo.dao.impl;

import jdbcDemo.bean.User;
import jdbcDemo.dao.UserDao;
import jdbcDemo.utill.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2020/11/20
 * @Description :
 */

public class UserImpl implements UserDao {
    private Connection conn = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private String sql;

    @Override
    public int addUser(User user) throws SQLException {
        int effectLine = 0;
        conn = DBConnect.getInitDBConnect().getConnection();
        sql = "INSERT INTO tb_user(id,head,name,password) VALUES(id,head,?,?)";
        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,user.getName());
        preparedStatement.setString(2,user.getPassword());
        effectLine = preparedStatement.executeUpdate();
        conn.close();
        return effectLine;
    }

    @Override
    public int addHead(String head) {
        return 0;
    }

    @Override
    public boolean getUser(String name,String password){
        boolean flag = false;
        try {
            conn = DBConnect.getInitDBConnect().getConnection();
            sql="SELECT * FROM tb_user WHERE name=? and password=?";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,password);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                flag = true;
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }
}
