package jdbcDemo.service.Impl;

import jdbcDemo.bean.User;
import jdbcDemo.factory.DaoFactory;
import jdbcDemo.service.UserService;

import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2020/11/20
 * @Description :
 */

public class UserServiceImpl implements UserService {
    @Override
    public int addUser(User user) throws Exception {
        int effectLine = DaoFactory.getUserDaoInstance().addUser(user);
        return effectLine;
    }

    @Override
    public int addHead(String head) {
        return 0;
    }

    @Override
    public boolean getUser(String name, String password) throws Exception {
        boolean flag = DaoFactory.getUserDaoInstance().getUser(name,password);
        return flag;
    }
}
