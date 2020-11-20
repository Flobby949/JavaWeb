package jdbcDemo.factory;

import jdbcDemo.dao.EmpDao;
import jdbcDemo.dao.UserDao;
import jdbcDemo.dao.impl.EmpImpl;
import jdbcDemo.dao.impl.UserImpl;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2020/11/18
 * @Description :
 */

public class DaoFactory {
    public static EmpDao getEmpDaoInstance() throws Exception{
        return new EmpImpl();
    }

    public static UserDao getUserDaoInstance() throws Exception{
        return new UserImpl();
    }
}
