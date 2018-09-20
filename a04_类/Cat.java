package a04_类;

/**
 * 猫类 继承动物类
 */
public class Cat extends Animate {

    public Cat() {}

    public Cat(int age, String name, String color) {
        super(age);
        this.name = name;
        this.color = color;
    }

    // 属性
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 方法
    public void say() {
        System.out.println("My name is " + this.name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
