package a04_类;

/**
 * 实例化一个类
 * 调用类的方法
 */
public class Demo01 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(1);
        cat.setName("gaga");
        cat.setColor("yellow");
        System.out.println(cat);
        cat.say();
        Cat cat2 = new Cat(2, "miao", "");
        cat2.say();
        Cat cat3 = cat2;
        cat3.say();
        System.out.println(cat3);
        // 使用静态方法
        System.out.println(Tools.add(2, 3));
        System.out.println(Tools.add(3));
    }
}
