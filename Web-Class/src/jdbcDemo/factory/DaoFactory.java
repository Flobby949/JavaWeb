package jdbcDemo.factory;

import jdbcDemo.dao.EmpDao;
import jdbcDemo.dao.impl.EmpImpl;

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
}
