package jdbcDemo.factory;

import jdbcDemo.service.EmpService;
import jdbcDemo.service.Impl.EmpServiceImpl;

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
}
