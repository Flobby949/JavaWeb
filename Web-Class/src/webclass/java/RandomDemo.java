package webclass.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/10/23
 * @ClassName :
 */

public class RandomDemo {
    public static void main(String[] args) {
        String[] str = {"b","c","a","f","g","d","e"};
        String[] rands = new String[2];
        int len = str.length;
        Random random = new Random();
        for (int i = 0; i < 2; i++){
            rands[i] = str[random.nextInt(len)];
        }
        System.out.println(rands[0]+rands[1]);
        System.out.println();
        List<String> list = Arrays.asList(str);
        System.out.println("原list1="+list);
        Collections.shuffle(list);
        System.out.println("打乱后list2="+list);
        //排序
        Collections.sort(list);
        System.out.println("排序后list3="+list);
    }
}