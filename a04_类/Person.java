package a04_类;

public class Person {
    public Person() { super(); }

    public static int total = 0;
    private Cat cat;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Person(Cat cat) {
        this.cat = cat;
    }

    public void joinGame() {
        Person.total ++;
    }

    public void say() {
        if (this.cat == null) {
            System.out.println("没有猫");
        } else {
            System.out.println("我有一只猫，叫" + this.cat.getName());
        }
    }
}
