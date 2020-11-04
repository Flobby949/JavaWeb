package webclass.java;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/10/23
 * @ClassName :用户信息
 */

public class UserInfo {
    private String account;
    private String password;

    @Override
    public String toString() {
        return "UserInfo{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public UserInfo() {
    }

    public UserInfo(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
