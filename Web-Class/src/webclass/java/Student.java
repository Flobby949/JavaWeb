package webclass.java;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/10/7
 * @ClassName :
 */

public class Student {
    private int id;
    private String name;
    private int age ;

    public String say(String content){
        return name+"说："+content;
    }

    public Student() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id = " + id + "\n姓名 ：" + name + "\nage = " + age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int id , String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
