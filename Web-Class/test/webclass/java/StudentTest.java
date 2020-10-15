package webclass.java;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

class StudentTest {

    /**
     * 通过对象名查找对象所对应类的类名
     */
    @Test
    void Test01() {
        Student p1 = new Student("张三", 20);
        System.out.println("类名：" + p1.getClass().getName());
    }

    /**
     * 通过无参方法创建对象
     */

    @Test
    void Test02() throws Exception {
        Class clazz = Class.forName("webclass.java.Student");
        // 通过clazz创建一个对象
        Student p2 = (Student) clazz.newInstance();
        p2.setName("李四");
        p2.setAge(100);
        System.out.println(p2);
    }

    /**
     * 通过有参构造方法实例化对象
     */
    @Test
    void  Test03() throws Exception{
        Class clazz = Class.forName("webclass.java.Student");
        // 通过反射机制获得所有构造方法
        Constructor[] constructors = clazz.getConstructors();
        System.out.println(clazz.getSimpleName()+"有"+constructors.length+"个构造方法\n");
        for (Constructor con:constructors){
            Type[] types = con.getParameterTypes();
            for (Type type:types){
                System.out.println(type);
            }
            System.out.println();
            //用带三个参数的构造方法实例化对象
            if (con.getParameterCount() == 3){
                Student p3 = (Student)con.newInstance("王五",20,true);
                System.out.println(p3);
            }
        }
    }

    @Test
    void Test04() throws Exception{
        Class clazz = Class.forName("webclass.java.Student");
        Object p4 = clazz.newInstance();
        //获得类中指定名称的属性
        Field nameField = clazz.getDeclaredField("name");
        //设置通过反射访问改属性时取消权限检查
        nameField.setAccessible(true);
        //用set方法为p对象指定属性赋值
        nameField.set(p4,"啊三");

        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(p4,25);

        System.out.println(p4);
    }

    @Test
    void Test05() throws Exception{
        Class clazz = Class.forName("webclass.java.Student");
        Student p5 = (Student) clazz.newInstance();
        p5.setName("aaa");
        Method method = clazz.getMethod("say", String.class);
        String str = (String) method.invoke(p5,"good day");
        System.out.println(str);
    }
}