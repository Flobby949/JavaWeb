package jdbcDemo.service;

import jdbcDemo.bean.User;

import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2020/11/20
 * @Description :
 */

public interface UserService {
    int addUser(User user) throws Exception;
    int addHead(String head);
    boolean getUser(String name, String password) throws Exception;
}
