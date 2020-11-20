package jdbcDemo.service;

import jdbcDemo.bean.User;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2020/11/20
 * @Description :
 */

public interface UserService {
    int addUser(User user);
    int addHead(String head);
}
