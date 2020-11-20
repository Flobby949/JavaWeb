package jdbcDemo.bean;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2020/11/20
 * @Description :用户
 */

public class User {
    private String name;
    private String password;
    private String head;


    public User(String name, String password, String head) {
        this.name = name;
        this.password = password;
        this.head = head;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
