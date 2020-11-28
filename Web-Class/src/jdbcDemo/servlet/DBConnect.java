package jdbcDemo.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/11/11
 * @ClassName :数据库连接
 */

public class DBConnect {
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/db_emp?"+
            "serverTimezone = UTC";
    private static String USER = "root";
    private static String PSD = "kobe24";

    private Connection con = null;
    private static DBConnect dbConnect = null;//单例模式

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 单例模式创建dbconnect
     * @return 返回创建的单例对象
     */
    public static DBConnect getInitDBConnect(){
        if (dbConnect == null){
            synchronized (DBConnect.class){
                if (dbConnect == null){
                    dbConnect = new DBConnect();
                }
            }
        }
        return dbConnect;
    }

    public Connection getConnection() throws SQLException {
        con = DriverManager.getConnection(URL,USER,PSD);
        System.out.println("连接成功");
        return con;
    }

    /**
     * 关闭数据库连接
     */
    public void closeDB() throws SQLException {
        if (con != null){
            con.close();
        }
    }
}
