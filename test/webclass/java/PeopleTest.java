package webclass.java;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

class PeopleTest {

    /**
     * 通过对象名查找对象所对应类的类名
     */
    @Test
    void Test01() {
        People p1 = new People("张三", 20);
        System.out.println("类名：" + p1.getClass().getName());
    }

    /**
     * 通过无参方法创建对象
     */

    @Test
    void Test02() throws Exception {
        Class clazz = Class.forName("webclass.java.People");
        // 通过clazz创建一个对象
        People p2 = (People) clazz.newInstance();
        p2.setName("李四");
        p2.setAge(100);
        p2.setBoy(true);
        System.out.println(p2);
    }

    /**
     * 通过有参构造方法实例化对象
     */
    @Test
    void  Test03() throws Exception{
        Class clazz = Class.forName("webclass.java.People");
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
                People p3 = (People)con.newInstance("王五",20,true);
                System.out.println(p3);
            }
        }
    }
}