package a04_类;

/**
 * 类的属性 为另一个类的实例
 */
public class Demo02 {
    public static void main(String[] args) {
        Person person = new Person();
        Cat cat = new Cat(1, "喵喵", "grey");
        person.say();
        person.setCat(cat);
        person.say();

        Person p2 = new Person();
        person.joinGame();
        p2.joinGame();

        System.out.println("当前加入游戏人数" + Person.total);
    }
}
