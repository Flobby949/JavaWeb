package webclass.java;


/**
 * @author Flobby
 * @version :1.0
 * @date :2020/10/7
 * @ClassName :
 */

public class ReflectDemo {
    public static void main(String[] args) {
        People p = new People();
        System.out.println("由对象查找类："+p.getClass().getName());
        System.out.println("由对象查找类："+p.getClass().getSimpleName());
    }
}
