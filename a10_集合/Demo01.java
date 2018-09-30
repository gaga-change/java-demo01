package a10_集合;

import java.util.ArrayList;
import java.util.Date;

/**
 * ArrayList 测试
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("123");
        arrayList.add(123);
        arrayList.add(new Date());
        arrayList.add('a');
        System.out.println(arrayList);

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("123");
        myArrayList.add(123);
        myArrayList.add(new Date());
        myArrayList.add('a');
        System.out.println(myArrayList);
    }
}
