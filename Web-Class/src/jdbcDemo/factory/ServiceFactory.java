package jdbcDemo.factory;

import jdbcDemo.service.EmpService;
import jdbcDemo.service.Impl.EmpServiceImpl;
import jdbcDemo.service.Impl.UserServiceImpl;
import jdbcDemo.service.UserService;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2020/11/18
 * @Description :
 */

public class ServiceFactory {
    public static EmpService getEmpServiceInstance() throws Exception{
        return new EmpServiceImpl();
    }

    public static UserService getUserServiceInstance() throws Exception{
        return new UserServiceImpl();
    }
}
