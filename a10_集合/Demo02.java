package a10_集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

/**
 * 功能： 演示java集合的用法
 */
public class Demo02 {
    public static void main(String[] args) {

//        test02();
//        test03();
//        test04();
//        test05();
        test06();
    }
    // iterator
    public static void test06() {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        ListIterator<Integer> iterator = arrayList.listIterator();

        while (iterator.hasNext()) {
            int a = iterator.next();
            System.out.println(a);
            if (a == 3) iterator.remove();
        }
        System.out.println("size:" + arrayList.size());
        System.out.println(Arrays.toString(arrayList.toArray()));
    }

    // forEach
    public static void test05() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);

        arrayList.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });
    }

    // contains
    public static void test04() {
        class Dog {
            public String name = "dog";
            @Override
            public boolean equals(Object obj) {
                System.out.println(this.name + "---");
                return this.name.equals(((Dog)obj).name);
            }
        }
        Dog dog1 = new Dog();
        ArrayList<Dog> arrayList = new ArrayList();
        arrayList.add(dog1);
        System.out.println(arrayList.contains(new Dog()));
    }

    // clone
    public static void test03() {
        class Dog {
            public String name = "dog";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog());
        ((Dog)arrayList.get(0)).name = "change";
        // 浅拷贝 不会拷贝存储的对象
        ArrayList copy = (ArrayList)arrayList.clone();
        Dog dog = (Dog) copy.get(0);
        System.out.println(dog.name);

    }

    // trimToSize 测试
    public static void test02() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(123);
        arrayList.add(null);
        arrayList.add(3);
        arrayList.add(null);
        arrayList.trimToSize();
        System.out.println(arrayList.size());
    }

    public static void test01() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(123);
        arrayList.add(22);
        arrayList.add(1, 1);
        System.out.println(arrayList.size());
        System.out.println(Arrays.toString(arrayList.toArray()));

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("a");
        arrayList.add(1);
        System.out.println(Arrays.toString(arrayList1.toArray()));
//        System.out.println("平均数：" + arrayList. );
    }
}
