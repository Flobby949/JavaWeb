package webclass.java;

import java.text.Collator;
import java.util.*;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/10/23
 * @ClassName :排序
 */

public class SortDemo {
    public static void main(String[] args) {
        Comparator cmp = Collator.getInstance(Locale.CHINA);
        String[] str = {"张三","李四","马六","钱七","王五","老八"};

        Arrays.sort(str,cmp);
        for (String name:str){
            System.out.println(name);
        }

    }
}
