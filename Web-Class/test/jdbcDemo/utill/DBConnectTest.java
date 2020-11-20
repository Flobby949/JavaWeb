package jdbcDemo.utill;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class DBConnectTest {

    @Test
    void getConnection() throws SQLException {
        Connection connection = DBConnect.getInitDBConnect().getConnection();
        if (connection != null){
            System.out.println("连接成功");
        }
    }
}