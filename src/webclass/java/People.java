package webclass.java;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/10/7
 * @ClassName :
 */

public class People {
    private String name = "三三";
    private int age = 27;
    private boolean isBoy = true;

    public String say(String content){
        return name+"说："+content;
    }

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoy() {
        return isBoy;
    }

    public void setBoy(boolean boy) {
        isBoy = boy;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isBoy=" + isBoy +
                '}';
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People(String name, int age, boolean isBoy) {
        this.name = name;
        this.age = age;
        this.isBoy = isBoy;
    }
}
